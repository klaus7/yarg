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

package com.haulmont.yarg.loaders;

import com.haulmont.yarg.structure.BandData;
import com.haulmont.yarg.structure.ReportQuery;

import java.util.List;
import java.util.Map;


/**
 * This interface describes a logic which load rows of data using report query, parent band and params
 */
public interface ReportDataLoader {
    List<Map<String, Object>> loadData(ReportQuery reportQuery, BandData parentBand, Map<String, Object> params);
}