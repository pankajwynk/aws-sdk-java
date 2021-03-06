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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAppInstanceStreamingConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppInstanceStreamingConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The streaming settings.
     * </p>
     */
    private java.util.List<AppInstanceStreamingConfiguration> appInstanceStreamingConfigurations;

    /**
     * <p>
     * The streaming settings.
     * </p>
     * 
     * @return The streaming settings.
     */

    public java.util.List<AppInstanceStreamingConfiguration> getAppInstanceStreamingConfigurations() {
        return appInstanceStreamingConfigurations;
    }

    /**
     * <p>
     * The streaming settings.
     * </p>
     * 
     * @param appInstanceStreamingConfigurations
     *        The streaming settings.
     */

    public void setAppInstanceStreamingConfigurations(java.util.Collection<AppInstanceStreamingConfiguration> appInstanceStreamingConfigurations) {
        if (appInstanceStreamingConfigurations == null) {
            this.appInstanceStreamingConfigurations = null;
            return;
        }

        this.appInstanceStreamingConfigurations = new java.util.ArrayList<AppInstanceStreamingConfiguration>(appInstanceStreamingConfigurations);
    }

    /**
     * <p>
     * The streaming settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppInstanceStreamingConfigurations(java.util.Collection)} or
     * {@link #withAppInstanceStreamingConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param appInstanceStreamingConfigurations
     *        The streaming settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppInstanceStreamingConfigurationsResult withAppInstanceStreamingConfigurations(
            AppInstanceStreamingConfiguration... appInstanceStreamingConfigurations) {
        if (this.appInstanceStreamingConfigurations == null) {
            setAppInstanceStreamingConfigurations(new java.util.ArrayList<AppInstanceStreamingConfiguration>(appInstanceStreamingConfigurations.length));
        }
        for (AppInstanceStreamingConfiguration ele : appInstanceStreamingConfigurations) {
            this.appInstanceStreamingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The streaming settings.
     * </p>
     * 
     * @param appInstanceStreamingConfigurations
     *        The streaming settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppInstanceStreamingConfigurationsResult withAppInstanceStreamingConfigurations(
            java.util.Collection<AppInstanceStreamingConfiguration> appInstanceStreamingConfigurations) {
        setAppInstanceStreamingConfigurations(appInstanceStreamingConfigurations);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppInstanceStreamingConfigurations() != null)
            sb.append("AppInstanceStreamingConfigurations: ").append(getAppInstanceStreamingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppInstanceStreamingConfigurationsResult == false)
            return false;
        GetAppInstanceStreamingConfigurationsResult other = (GetAppInstanceStreamingConfigurationsResult) obj;
        if (other.getAppInstanceStreamingConfigurations() == null ^ this.getAppInstanceStreamingConfigurations() == null)
            return false;
        if (other.getAppInstanceStreamingConfigurations() != null
                && other.getAppInstanceStreamingConfigurations().equals(this.getAppInstanceStreamingConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceStreamingConfigurations() == null) ? 0 : getAppInstanceStreamingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public GetAppInstanceStreamingConfigurationsResult clone() {
        try {
            return (GetAppInstanceStreamingConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
