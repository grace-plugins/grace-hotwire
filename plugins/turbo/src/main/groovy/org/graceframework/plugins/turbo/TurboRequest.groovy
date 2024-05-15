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

import grails.web.http.HttpHeaders

/**
 * Turbo Request {link https://turbo.hotwired.dev/handbook/}
 *
 * @author Michael Yan
 * @since 0.1
 */
@CompileStatic
class TurboRequest {

    public static final String TURBO_FRAME = 'Turbo-Frame'
    public static final String TURBO_REQUEST_ID = 'X-Turbo-Request-Id'

    private final HttpServletRequest request

    TurboRequest(HttpServletRequest request) {
        this.request = request
    }

    /**
     * The ID of current Turbo request.
     */
    String getTurboRequestId() {
        getHeaderValue(TURBO_REQUEST_ID)
    }

    /**
     * Turbo Frames allow predefined parts of a page to be updated on request.
     * Each frame have a unique ID, which is used to match the content being replaced when requesting new pages from the server.
     */
    String getTurboFrameId() {
        getHeaderValue(TURBO_FRAME)
    }

    /**
     * Get header value from request
     * @param The name of header
     * @return value
     */
    String getHeaderValue(String name) {
        this.request.getHeader(name)
    }

    /**
     * Check current request whether have the header <tt>X-Turbo-Request-Id</tt>
     */
    boolean isTurboRequest() {
        getTurboRequestId()
    }

    /**
     * Check current request whether have the header <tt>Turbo-Frame</tt>
     */
    boolean isTurboFrame() {
        getTurboFrameId()
    }

    /**
     * Check current request whether from Turbo Stream
     */
    boolean isTurboStream() {
        getHeaderValue(HttpHeaders.ACCEPT) == TurboMimeType.TURBO_STREAM.name
    }

    boolean asBoolean() {
        getTurboRequestId()
    }

}
