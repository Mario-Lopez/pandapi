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

/**
 * Contains the API documents (i.e. POJOs for JSON [de]serialization) grouped (i.e. packaged) by endpoint.
 * Changes to the output/input data model of an API will be made here and in supporting classes.  These
 * classes handle translating domain objects to themselves and back with 'fromDomainObject' and
 * 'toDomainObject' methods respectively.
 * @author Mario Lopez Jr
 * @since 0.0.5
 */
package com.mariolopezjr.pandapi.web.document;