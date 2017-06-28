/* See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * Esri Inc. licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.esri.gpt.control.webharvest.client;

import com.esri.gpt.control.webharvest.AccessException;
import com.esri.gpt.control.webharvest.IterationContext;
import com.esri.gpt.framework.http.HttpClientRequest;
import com.esri.gpt.framework.robots.Bots;

/**
 * Mock iteration context.
 */
public class MockIterationContext implements IterationContext {

  @Override
  public void onIterationException(Exception ex) {
  }

  @Override
  public HttpClientRequest newHttpClientRequest() {
    return new HttpClientRequest();
  }

  @Override
  public void assertAccess(String url) throws AccessException {
  }

  @Override
  public Bots getRobotsTxt() {
    return null;
  }
  
}
