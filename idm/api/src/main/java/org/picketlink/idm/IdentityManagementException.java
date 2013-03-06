/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
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

package org.picketlink.idm;

/**
 * This exception is thrown if there is an error during an identity management operation.
 *
 * @author Shane Bryzak
 */
public class IdentityManagementException extends SecurityException {
    private static final long serialVersionUID = -1607577358422916393L;

    public IdentityManagementException() {
        super();
    }

    public IdentityManagementException(String message, Throwable cause) {
        super(message, cause);
    }

    public IdentityManagementException(String message) {
        super(message);
    }

    public IdentityManagementException(Throwable cause) {
        super(cause);
    }
}
