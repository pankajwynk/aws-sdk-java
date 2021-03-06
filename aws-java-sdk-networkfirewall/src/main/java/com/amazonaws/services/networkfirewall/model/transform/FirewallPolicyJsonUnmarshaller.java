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
package com.amazonaws.services.networkfirewall.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FirewallPolicy JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallPolicyJsonUnmarshaller implements Unmarshaller<FirewallPolicy, JsonUnmarshallerContext> {

    public FirewallPolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        FirewallPolicy firewallPolicy = new FirewallPolicy();

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
                if (context.testExpression("StatelessRuleGroupReferences", targetDepth)) {
                    context.nextToken();
                    firewallPolicy.setStatelessRuleGroupReferences(new ListUnmarshaller<StatelessRuleGroupReference>(
                            StatelessRuleGroupReferenceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StatelessDefaultActions", targetDepth)) {
                    context.nextToken();
                    firewallPolicy.setStatelessDefaultActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("StatelessFragmentDefaultActions", targetDepth)) {
                    context.nextToken();
                    firewallPolicy.setStatelessFragmentDefaultActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("StatelessCustomActions", targetDepth)) {
                    context.nextToken();
                    firewallPolicy.setStatelessCustomActions(new ListUnmarshaller<CustomAction>(CustomActionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StatefulRuleGroupReferences", targetDepth)) {
                    context.nextToken();
                    firewallPolicy.setStatefulRuleGroupReferences(new ListUnmarshaller<StatefulRuleGroupReference>(StatefulRuleGroupReferenceJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return firewallPolicy;
    }

    private static FirewallPolicyJsonUnmarshaller instance;

    public static FirewallPolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallPolicyJsonUnmarshaller();
        return instance;
    }
}
