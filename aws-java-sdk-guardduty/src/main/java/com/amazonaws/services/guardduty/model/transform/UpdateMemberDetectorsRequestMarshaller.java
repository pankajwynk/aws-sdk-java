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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMemberDetectorsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMemberDetectorsRequestMarshaller {

    private static final MarshallingInfo<String> DETECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("detectorId").build();
    private static final MarshallingInfo<List> ACCOUNTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountIds").build();
    private static final MarshallingInfo<StructuredPojo> DATASOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSources").build();

    private static final UpdateMemberDetectorsRequestMarshaller instance = new UpdateMemberDetectorsRequestMarshaller();

    public static UpdateMemberDetectorsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMemberDetectorsRequest updateMemberDetectorsRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMemberDetectorsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMemberDetectorsRequest.getDetectorId(), DETECTORID_BINDING);
            protocolMarshaller.marshall(updateMemberDetectorsRequest.getAccountIds(), ACCOUNTIDS_BINDING);
            protocolMarshaller.marshall(updateMemberDetectorsRequest.getDataSources(), DATASOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
