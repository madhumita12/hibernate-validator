// $Id$
/*
* JBoss, Home of Professional Open Source
* Copyright 2008, Red Hat, Inc. and/or its affiliates, and individual contributors
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* http://www.apache.org/licenses/LICENSE-2.0
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.hibernate.validator.util;

import java.security.PrivilegedAction;
import java.lang.reflect.Field;

/**
 * @author Emmanuel Bernard
 */
public class GetDeclaredFields implements PrivilegedAction<Field[]> {
	private final Class<?> clazz;

	public static GetDeclaredFields action(Class<?> clazz) {
		return new GetDeclaredFields( clazz );
	}

	private GetDeclaredFields(Class<?> clazz) {
		this.clazz = clazz;
	}

	public Field[] run() {
		return clazz.getDeclaredFields();
	}
}