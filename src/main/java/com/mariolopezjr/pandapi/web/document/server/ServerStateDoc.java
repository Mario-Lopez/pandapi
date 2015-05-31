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

package com.mariolopezjr.pandapi.web.document.server;

import com.mariolopezjr.pandapi.data.server.ServerState;
import com.mariolopezjr.pandapi.exception.NonCorrespondingValueException;

/**
 * List of server states to display to the client.
 * @author Mario Lopez Jr
 * @since 0.0.5
 */
public enum ServerStateDoc {
    Building,
    Running,
    Destroyed;

    /**
     * Returns an enum of this type for the corresponding value of the provided domain object enum.
     * @param domainObject {@link ServerState}
     * @return {@link ServerStateDoc}
     */
    public static ServerStateDoc fromDomainObject(final ServerState domainObject) {
        if (null == domainObject) {
            throw new NonCorrespondingValueException("Server state is null");
        }

        switch (domainObject) {
            case BUILDING: return Building;
            case RUNNING: return Running;
            case TERMINATING: return Destroyed;
            case DESTROYED: return Destroyed;
            default: throw new NonCorrespondingValueException("Unknown server state: " + domainObject);
        }
    }
}
