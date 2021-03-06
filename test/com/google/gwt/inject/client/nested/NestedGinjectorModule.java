/*
 * Copyright 2009 Google Inc.
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

package com.google.gwt.inject.client.nested;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.name.Names;

public class NestedGinjectorModule extends AbstractGinModule {

  protected void configure() {
    bindConstant().annotatedWith(Names.named("hello")).to("H3llo");
    bindConstant().annotatedWith(Names.named("world")).to("w0rld");
  }
}
