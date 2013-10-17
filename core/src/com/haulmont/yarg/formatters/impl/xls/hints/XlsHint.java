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

package com.haulmont.yarg.formatters.impl.xls.hints;

import com.haulmont.yarg.structure.BandData;
import org.apache.poi.hssf.usermodel.HSSFCell;

/**
 * @author artamonov
 * @version $Id: XlsHint.java 9328 2012-10-18 15:28:32Z artamonov $
 */
public interface XlsHint {
    class CheckResult {
        public final String cellValue;
        public final boolean result;

        public CheckResult(boolean result, String cellValue) {
            this.cellValue = cellValue;
            this.result = result;
        }

        public static CheckResult NEGATIVE = new CheckResult(false, null);
    }

    CheckResult check(String templateCellValue);

    void add(HSSFCell templateCell, HSSFCell resultCell, BandData bandData);

    void apply();
}