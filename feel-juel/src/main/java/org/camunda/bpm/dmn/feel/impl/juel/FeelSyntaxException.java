/*
 * Copyright © 2015-2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.dmn.feel.impl.juel;

import org.camunda.bpm.dmn.feel.impl.FeelException;

/**
 * Exception thrown if the syntax of a FEEL expression is invalid.
 */
public class FeelSyntaxException extends FeelException {

  protected String feelExpression;
  protected String description;

  public FeelSyntaxException(String message, String feelExpression, String description) {
    super(message);
    this.feelExpression = feelExpression;
    this.description = description;
  }

  public FeelSyntaxException(String message, String feelExpression, String description, Throwable cause) {
    super(message, cause);
    this.feelExpression = feelExpression;
    this.description = description;
  }

  public String getFeelExpression() {
    return feelExpression;
  }

  public String getDescription() {
    return description;
  }

}
