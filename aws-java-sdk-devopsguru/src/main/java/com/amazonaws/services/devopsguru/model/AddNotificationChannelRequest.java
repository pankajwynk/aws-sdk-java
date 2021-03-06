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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddNotificationChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private NotificationChannelConfig config;

    /**
     * @param config
     */

    public void setConfig(NotificationChannelConfig config) {
        this.config = config;
    }

    /**
     * @return
     */

    public NotificationChannelConfig getConfig() {
        return this.config;
    }

    /**
     * @param config
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddNotificationChannelRequest withConfig(NotificationChannelConfig config) {
        setConfig(config);
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
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddNotificationChannelRequest == false)
            return false;
        AddNotificationChannelRequest other = (AddNotificationChannelRequest) obj;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        return hashCode;
    }

    @Override
    public AddNotificationChannelRequest clone() {
        return (AddNotificationChannelRequest) super.clone();
    }

}
