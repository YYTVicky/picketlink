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
package org.picketlink.common.exceptions.fed;

import java.security.GeneralSecurityException;

/**
 * Indicates the failure of signature validation
 *
 * @author Anil.Saldhana@redhat.com
 * @since Jul 28, 2011
 */
public class SignatureValidationException extends GeneralSecurityException {
    private static final long serialVersionUID = 1L;

    public SignatureValidationException() {
    }

    public SignatureValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignatureValidationException(String msg) {
        super(msg);
    }

    public SignatureValidationException(Throwable cause) {
        super(cause);
    }
}