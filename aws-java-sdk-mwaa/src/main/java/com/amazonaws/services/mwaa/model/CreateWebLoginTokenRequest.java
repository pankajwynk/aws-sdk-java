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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateWebLoginToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWebLoginTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Create an Airflow Web UI login token request for a MWAA environment.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Create an Airflow Web UI login token request for a MWAA environment.
     * </p>
     * 
     * @param name
     *        Create an Airflow Web UI login token request for a MWAA environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Create an Airflow Web UI login token request for a MWAA environment.
     * </p>
     * 
     * @return Create an Airflow Web UI login token request for a MWAA environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Create an Airflow Web UI login token request for a MWAA environment.
     * </p>
     * 
     * @param name
     *        Create an Airflow Web UI login token request for a MWAA environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebLoginTokenRequest withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebLoginTokenRequest == false)
            return false;
        CreateWebLoginTokenRequest other = (CreateWebLoginTokenRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateWebLoginTokenRequest clone() {
        return (CreateWebLoginTokenRequest) super.clone();
    }

}
