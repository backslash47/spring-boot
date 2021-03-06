/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.elasticsearch.jest;

import io.searchbox.client.config.HttpClientConfig;

/**
 * Callback interface that can be implemented by beans wishing to further customize the
 * {@link io.searchbox.client.config.HttpClientConfig} via
 * {@link io.searchbox.client.config.HttpClientConfig.Builder} retaining its default
 * auto-configuration.
 *
 * @author Stephane Nicoll
 * @since 1.5.0
 */
public interface HttpClientConfigBuilderCustomizer {

	/**
	 * Customize the {@link io.searchbox.client.config.HttpClientConfig.Builder}.
	 * @param builder the builder to customize
	 */
	void customize(HttpClientConfig.Builder builder);

}
