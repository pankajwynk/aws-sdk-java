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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MpdSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MpdSettingsJsonUnmarshaller implements Unmarshaller<MpdSettings, JsonUnmarshallerContext> {

    public MpdSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        MpdSettings mpdSettings = new MpdSettings();

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
                if (context.testExpression("accessibilityCaptionHints", targetDepth)) {
                    context.nextToken();
                    mpdSettings.setAccessibilityCaptionHints(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioDuration", targetDepth)) {
                    context.nextToken();
                    mpdSettings.setAudioDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("captionContainerType", targetDepth)) {
                    context.nextToken();
                    mpdSettings.setCaptionContainerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte35Esam", targetDepth)) {
                    context.nextToken();
                    mpdSettings.setScte35Esam(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte35Source", targetDepth)) {
                    context.nextToken();
                    mpdSettings.setScte35Source(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mpdSettings;
    }

    private static MpdSettingsJsonUnmarshaller instance;

    public static MpdSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MpdSettingsJsonUnmarshaller();
        return instance;
    }
}
