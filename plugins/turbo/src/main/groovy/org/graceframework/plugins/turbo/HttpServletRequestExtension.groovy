/*
 * Copyright 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.graceframework.plugins.turbo

import javax.servlet.http.HttpServletRequest

import groovy.transform.CompileStatic

/**
 * Extends the {@link HttpServletRequest} object with new methods for handling Turbo Request
 *
 * @author Michael Yan
 * @since 0.1
 */
@CompileStatic
class HttpServletRequestExtension {

    static TurboRequest getTurbo(HttpServletRequest request) {
        new TurboRequest(request)
    }

    static boolean isTurboFrame(HttpServletRequest request) {
        getTurbo(request).isTurboFrame()
    }

    static boolean isTurboStream(HttpServletRequest request) {
        getTurbo(request).isTurboStream()
    }

}
