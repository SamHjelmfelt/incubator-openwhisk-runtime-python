/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
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

package runtime.actionContainers

import common.WskActorSystem
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PythonActionLoopContainerTests extends PythonActionContainerTests with WskActorSystem {

  override lazy val imageName = "actionloop-python-v3.7"

  override val testNoSource = TestConfig("", hasCodeStub = false)

  /** indicates if strings in python are unicode by default (i.e., python3 -> true, python2.7 -> false) */
  override lazy val pythonStringAsUnicode = true

  /** actionloop based image does not log init errors - return the error in the body */
  override lazy val initErrorsAreLogged = false
}
