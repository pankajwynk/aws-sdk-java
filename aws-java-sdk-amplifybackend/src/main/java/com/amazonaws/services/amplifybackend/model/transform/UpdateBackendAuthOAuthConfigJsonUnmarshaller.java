/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.amplifybackend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifybackend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateBackendAuthOAuthConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBackendAuthOAuthConfigJsonUnmarshaller implements Unmarshaller<UpdateBackendAuthOAuthConfig, JsonUnmarshallerContext> {

    public UpdateBackendAuthOAuthConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateBackendAuthOAuthConfig updateBackendAuthOAuthConfig = new UpdateBackendAuthOAuthConfig();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("domainPrefix", targetDepth)) {
                    context.nextToken();
                    updateBackendAuthOAuthConfig.setDomainPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("oAuthGrantType", targetDepth)) {
                    context.nextToken();
                    updateBackendAuthOAuthConfig.setOAuthGrantType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("oAuthScopes", targetDepth)) {
                    context.nextToken();
                    updateBackendAuthOAuthConfig.setOAuthScopes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("redirectSignInURIs", targetDepth)) {
                    context.nextToken();
                    updateBackendAuthOAuthConfig.setRedirectSignInURIs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("redirectSignOutURIs", targetDepth)) {
                    context.nextToken();
                    updateBackendAuthOAuthConfig.setRedirectSignOutURIs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("socialProviderSettings", targetDepth)) {
                    context.nextToken();
                    updateBackendAuthOAuthConfig.setSocialProviderSettings(SocialProviderSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateBackendAuthOAuthConfig;
    }

    private static UpdateBackendAuthOAuthConfigJsonUnmarshaller instance;

    public static UpdateBackendAuthOAuthConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateBackendAuthOAuthConfigJsonUnmarshaller();
        return instance;
    }
}
