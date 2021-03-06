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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContextResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     */
    private String contextArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @param contextArn
     *        The Amazon Resource Name (ARN) of the context.
     */

    public void setContextArn(String contextArn) {
        this.contextArn = contextArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the context.
     */

    public String getContextArn() {
        return this.contextArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @param contextArn
     *        The Amazon Resource Name (ARN) of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContextResult withContextArn(String contextArn) {
        setContextArn(contextArn);
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
        if (getContextArn() != null)
            sb.append("ContextArn: ").append(getContextArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContextResult == false)
            return false;
        UpdateContextResult other = (UpdateContextResult) obj;
        if (other.getContextArn() == null ^ this.getContextArn() == null)
            return false;
        if (other.getContextArn() != null && other.getContextArn().equals(this.getContextArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContextArn() == null) ? 0 : getContextArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContextResult clone() {
        try {
            return (UpdateContextResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
