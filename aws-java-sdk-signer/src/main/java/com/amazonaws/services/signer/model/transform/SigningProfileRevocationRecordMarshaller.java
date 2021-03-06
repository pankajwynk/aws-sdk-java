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
package com.amazonaws.services.signer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.signer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SigningProfileRevocationRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SigningProfileRevocationRecordMarshaller {

    private static final MarshallingInfo<java.util.Date> REVOCATIONEFFECTIVEFROM_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revocationEffectiveFrom").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REVOKEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revokedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REVOKEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("revokedBy").build();

    private static final SigningProfileRevocationRecordMarshaller instance = new SigningProfileRevocationRecordMarshaller();

    public static SigningProfileRevocationRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SigningProfileRevocationRecord signingProfileRevocationRecord, ProtocolMarshaller protocolMarshaller) {

        if (signingProfileRevocationRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(signingProfileRevocationRecord.getRevocationEffectiveFrom(), REVOCATIONEFFECTIVEFROM_BINDING);
            protocolMarshaller.marshall(signingProfileRevocationRecord.getRevokedAt(), REVOKEDAT_BINDING);
            protocolMarshaller.marshall(signingProfileRevocationRecord.getRevokedBy(), REVOKEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
