/*
 * Copyright 2013 Haulmont
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

/**
 *
 * @author degtyarjov
 * @version $Id$
 */
package com.haulmont.yarg.loaders.factory;

import com.haulmont.yarg.exception.InitializationException;
import com.haulmont.yarg.exception.UnsupportedLoaderException;
import com.haulmont.yarg.loaders.ReportDataLoader;
import org.apache.commons.dbcp.*;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class DefaultLoaderFactory implements ReportLoaderFactory {
    public static final String GROOVY_DATA_LOADER = "groovy";
    public static final String SQL_DATA_LOADER = "sql";

    protected Map<String, ReportDataLoader> dataLoaders = new HashMap<String, ReportDataLoader>();

    public DefaultLoaderFactory setDataLoaders(Map<String, ReportDataLoader> dataLoaders) {
        this.dataLoaders.putAll(dataLoaders);
        return this;
    }

    public DefaultLoaderFactory setGroovyDataLoader(ReportDataLoader dataLoader) {
        return registerDataLoader(GROOVY_DATA_LOADER, dataLoader);
    }

    public DefaultLoaderFactory setSqlDataLoader(ReportDataLoader dataLoader) {
        return registerDataLoader(SQL_DATA_LOADER, dataLoader);
    }

    public DefaultLoaderFactory registerDataLoader(String key, ReportDataLoader dataLoader) {
        dataLoaders.put(key, dataLoader);
        return this;
    }

    @Override
    public ReportDataLoader createDataLoader(String loaderType) {
        ReportDataLoader dataLoader = dataLoaders.get(loaderType);
        if (dataLoader == null) {
            throw new UnsupportedLoaderException(String.format("Unsupported loader type [%s]", loaderType));
        } else {
            return dataLoader;
        }
    }

    public static DataSource setupDataSource(String driver, String connectURI,
                                             String username,
                                             String password,
                                             Integer maxActive,
                                             Integer maxIdle,
                                             Integer maxWait) {
        try {
            Class.forName(driver);
            final AbandonedConfig config = new AbandonedConfig();
            config.setLogAbandoned(true);

            AbandonedObjectPool connectionPool = new AbandonedObjectPool(null, config);

            connectionPool.setMaxIdle(maxIdle);
            connectionPool.setMaxActive(maxActive);
            if (maxWait != null) {
                connectionPool.setMaxWait(maxWait);
            }

            ConnectionFactory connectionFactory =
                    new DriverManagerConnectionFactory(connectURI, username, password);

            PoolableConnectionFactory poolableConnectionFactory =
                    new PoolableConnectionFactory(
                            connectionFactory, connectionPool, null, null, false, true);

            connectionPool.setFactory(poolableConnectionFactory);
            PoolingDataSource dataSource =
                    new PoolingDataSource(connectionPool);

            return dataSource;
        } catch (ClassNotFoundException e) {
            throw new InitializationException("An error occurred during creation of new datasource object", e);
        }
    }
}
