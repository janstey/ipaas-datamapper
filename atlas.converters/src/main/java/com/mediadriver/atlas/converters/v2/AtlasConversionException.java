/**
 * Copyright (C) 2017 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mediadriver.atlas.converters.v2;

/**
 * Created by on 3/6/17.
 */
public class AtlasConversionException extends Exception {

    public AtlasConversionException() {
        super();
    }

    public AtlasConversionException(String message, Throwable cause) {
        super(message, cause);
    }

    public AtlasConversionException(String message) {
        super(message);
    }

    public AtlasConversionException(Throwable cause) {
        super(cause);
    }
}
