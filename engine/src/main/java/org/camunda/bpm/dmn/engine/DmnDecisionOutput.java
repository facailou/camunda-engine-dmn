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

package org.camunda.bpm.dmn.engine;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import org.camunda.bpm.engine.variable.value.TypedValue;

/**
 * The output of one decision. In context of a decision table this represents
 * the output of a matching decision rule. It is a mapping from the
 * <code>camunda:output</code> attribute to output value. If no
 * <code>camunda:output</code> was given the key is <code>null</code>.
 */
public interface DmnDecisionOutput extends Serializable {

  /**
   * Returns the value for a given output name.
   *
   * @param name
   *          the name of the output
   * @param <T>
   *          the type of the output value
   * @return the value for the given name or null if no value exists for this
   *         name
   *
   * @see #getValueTyped(String)
   */
  <T> T getValue(String name);

  /**
   * Returns the value of the first output.
   *
   * @param <T>
   *          the type of the output value
   * @return the first output value or null if none exists
   *
   * @see #getFirstValueTyped()
   */
  <T> T getFirstValue();

  /**
   * Returns the single value of the output. Which asserts that the decision
   * output only has one value.
   *
   * @param <T>
   *          the type of the output value
   * @return the single output value or null if none exists
   * @throws DmnResultException
   *           if more than one output value exists
   *
   * @see #getSingleValueTyped()
   */
  <T> T getSingleValue();

  /**
   * Returns the typed value for a given output name.
   *
   * @param name
   *          the name of the output
   * @param <T>
   *          the type of the output value
   * @return the typed value for the given name or null if no value exists for
   *         this name
   *
   * @see #getValue(String)
   */
  <T extends TypedValue> T getValueTyped(String name);

  /**
   * Returns the typed value of the first output.
   *
   * @param <T>
   *          the type of the output value
   * @return the first typed output value or null if none exists
   *
   * @see #getFirstValue()
   */
  <T extends TypedValue> T getFirstValueTyped();

  /**
   * Returns the single typed value of the output. Which asserts that the
   * decision output only has one value.
   *
   * @param <T>
   *          the type of the output value
   * @return the single typed output value or null if none exists
   * @throws DmnResultException
   *           if more than one output value exists
   *
   * @see #getSingleValue()
   */
  <T extends TypedValue> T getSingleValueTyped();

  /**
   * @return the number of the output values
   */
  int size();

  /**
   * @return <code>true</code>, if the decision output has no output values
   */
  boolean isEmpty();

  /**
   * @return <code>true</code>, if the decision output contains an entry with
   *         the given key
   */
  boolean containsKey(String key);

  /**
   * @return the keys of the decision output
   */
  Set<String> keySet();

  /**
   * @return the values of the decision output
   */
  Collection<Object> values();

  /**
   * @return the typed values of the decision output
   */
  Collection<TypedValue> valuesTyped();

}
