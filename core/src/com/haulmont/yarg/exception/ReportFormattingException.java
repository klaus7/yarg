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
package com.haulmont.yarg.exception;

public class ReportFormattingException extends ReportingException {
    public ReportFormattingException() {
    }

    public ReportFormattingException(String message) {
        super(message);
    }

    public ReportFormattingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportFormattingException(Throwable cause) {
        super(cause);
    }
}
