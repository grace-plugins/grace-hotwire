/*
 * Copyright 2024-2026 the original author or authors.
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
package org.graceframework.plugins.turbo;

import grails.web.mime.MimeType;

/**
 * {@link MimeType} for Turbo
 *
 * @author Michael Yan
 * @since 0.1
 */
public class TurboMimeType {

    public static final String TURBO_STREAM_FORMAT = "turbo_stream";

    public static final String TURBO_FRAME_FORMAT = "turbo_frame";

    public static final MimeType TURBO_STREAM = new MimeType("text/vnd.turbo-stream.html", "turbo_stream");

    public static final MimeType TURBO_FRAME = new MimeType("text/html", "turbo_frame");

    public static final MimeType[] TURBO_MIME_TYPES = new MimeType[] { TurboMimeType.TURBO_FRAME, TurboMimeType.TURBO_STREAM };

}
