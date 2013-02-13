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
package org.picketlink.identity.federation.core.saml.v2.interfaces;

import java.util.List;

import org.w3c.dom.Document;

/**
 * A response object sent to the {@code SAML2Handler} as part of a chain
 *
 * @author Anil.Saldhana@redhat.com
 * @since Sep 25, 2009
 */
public interface SAML2HandlerResponse {
    /**
     * Set the destination where the response from the current processing node is sent
     *
     * @param destination
     */
    void setDestination(String destination);

    /**
     * Get the destination
     *
     * @return
     */
    String getDestination();

    /**
     * Set the resulting document from the handler
     *
     * @param doc
     */
    void setResultingDocument(Document doc);

    /**
     * Set any relay state that needs to be used in the workflow
     *
     * @param relayState
     */
    void setRelayState(String relayState);

    /**
     * Get the resulting document from the handler invocation
     *
     * @return
     */
    Document getResultingDocument();

    /**
     * Get the relay state
     *
     * @return
     */
    String getRelayState();

    /**
     * Set an roles that are generated by handlers
     *
     * @param roles
     */
    void setRoles(List<String> roles);

    /**
     * Get the roles generated by handlers
     *
     * @return
     */
    List<String> getRoles();

    /**
     * Specifies whether the handler chain processing resulted in an error
     *
     * @return
     */
    boolean isInError();

    /**
     * Handler can set an error
     *
     * @param errorCode
     * @param errorMessage
     */
    void setError(int errorCode, String errorMessage);

    /**
     * Get the error code set in the handler chain
     *
     * @return
     */
    int getErrorCode();

    /**
     * Get the error message set in the handler chain
     *
     * @return
     */
    String getErrorMessage();

    /**
     * Will the resulting document be a SAMLRequest?
     *
     * @param request
     */
    void setSendRequest(boolean request);

    /**
     * @see #setSendRequest(boolean)
     * @return
     */
    boolean getSendRequest();

    /**
     * Set whether the response should be using the Post Binding
     *
     * @param postB
     */
    void setPostBindingForResponse(boolean postB);

    /**
     * Should the response be in post binding?
     *
     * @return
     */
    boolean isPostBindingForResponse();

   /**
    *  Whole destination query string including signature. It's used only in Redirect Binding with
    * signature enabled.
    *
    * @param destinationQueryStringWithSignature
    */
    void setDestinationQueryStringWithSignature(String destinationQueryStringWithSignature);

   /**
    * @see #setDestinationQueryStringWithSignature(String)
    * @return
    */
    String getDestinationQueryStringWithSignature();
}