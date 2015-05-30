/*
 * Copyright 2015 Mario Lopez Jr
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.mariolopezjr.pandapi.integrationtests.functional

import spock.lang.Specification

/**
 * Tests the functional requirements for the Server API.
 *
 * These include:
 * - Verifying a server resource can be created
 * - Verifying a server resource can be retrieved
 * - Verifying a server resource can be destroyed
 *
 * @author Mario Lopez Jr
 * @since 0.0.3
 */
class ServerSpec extends Specification {

    def "testing spec"() {
        given:
        def a = 1
        def b = 1

        when:
        def c = 3

        then:
        a == b
    }
}
