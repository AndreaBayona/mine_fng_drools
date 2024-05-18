package com.example.fng_drools.model;

public class CreditOpeningRequest {
    private User user;
    private CreditQuotaOpening[] creditQuotaOpenings;

    public CreditOpeningRequest(User user, CreditQuotaOpening[] creditQuotaOpenings) {
        this.user = user;
        this.creditQuotaOpenings = creditQuotaOpenings;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CreditQuotaOpening[] getCreditQuotaOpenings() {
        return creditQuotaOpenings;
    }

    public void setCreditQuotaOpenings(CreditQuotaOpening[] creditQuotaOpenings) {
        this.creditQuotaOpenings = creditQuotaOpenings;
    }
}
