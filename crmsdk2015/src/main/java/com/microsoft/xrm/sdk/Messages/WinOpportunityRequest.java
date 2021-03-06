package com.microsoft.xrm.sdk.Messages;

import android.support.annotation.Nullable;

import com.microsoft.xrm.sdk.Entity;
import com.microsoft.xrm.sdk.OptionSetValue;
import com.microsoft.xrm.sdk.OrganizationRequest;

public final class WinOpportunityRequest extends OrganizationRequest {

    public WinOpportunityRequest() {
        this.setResponseType(new WinOpportunityResponse());
        this.setRequestName("WinOpportunity");
    }

    @Nullable
    public Entity getOpportunityClose() {
        if (this.getParameters().containsKey("OpportunityClose")) {
            return (Entity) this.getParameters().get("OpportunityClose");
        }

        return null;
    }

    public void setOpportunityClose(Entity value) {
        this.set("OpportunityClose", value);
    }

    @Nullable
    public OptionSetValue getStatus() {
        if (this.getParameters().containsKey("Status")) {
            return (OptionSetValue) this.getParameters().get("Status");
        }

        return null;
    }

    public void setStatus(OptionSetValue value) {
        this.set("Status", value);
    }

    @Override
    public String getRequestBody() {
        this.set("OpportunityClose", getOpportunityClose());
        this.set("Status", getStatus());
        return getSoapBody();
    }

}
