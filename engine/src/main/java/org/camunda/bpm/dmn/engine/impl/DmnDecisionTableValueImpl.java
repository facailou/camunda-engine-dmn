/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecisionTableValue;
import org.camunda.bpm.dmn.engine.DmnInput;
import org.camunda.bpm.dmn.engine.DmnOutput;
import org.camunda.bpm.engine.variable.value.TypedValue;

public class DmnDecisionTableValueImpl implements DmnDecisionTableValue {

  protected String key;
  protected String name;
  protected TypedValue value;

  public DmnDecisionTableValueImpl(DmnInput dmnInput) {
    this.key = dmnInput.getKey();
    this.name = dmnInput.getName();
  }

  public DmnDecisionTableValueImpl(DmnOutput dmnOutput) {
    this.key = dmnOutput.getKey();
    this.name = dmnOutput.getName();
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypedValue getValue() {
    return value;
  }

  public void setValue(TypedValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "DmnDecisionTableValueImpl{" +
      "key='" + key + '\'' +
      ", name='" + name + '\'' +
      ", value=" + value +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DmnDecisionTableValueImpl that = (DmnDecisionTableValueImpl) o;

    if (key != null ? !key.equals(that.key) : that.key != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return !(value != null ? !value.equals(that.value) : that.value != null);

  }

  @Override
  public int hashCode() {
    int result = key != null ? key.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (value != null ? value.hashCode() : 0);
    return result;
  }

}
