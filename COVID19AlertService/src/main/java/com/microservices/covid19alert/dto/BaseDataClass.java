package com.microservices.covid19alert.dto;

public class BaseDataClass {
    private int comfirmedCaseIndian;
    private int getComfirmedCaseForeign;
    private int discharged;
    private int deaths;

    public int getComfirmedCaseIndian() {
        return comfirmedCaseIndian;
    }

    public void setComfirmedCaseIndian(int comfirmedCaseIndian) {
        this.comfirmedCaseIndian = comfirmedCaseIndian;
    }

    public int getGetComfirmedCaseForeign() {
        return getComfirmedCaseForeign;
    }

    public void setGetComfirmedCaseForeign(int getComfirmedCaseForeign) {
        this.getComfirmedCaseForeign = getComfirmedCaseForeign;
    }

    public int getDischarged() {
        return discharged;
    }

    public void setDischarged(int discharged) {
        this.discharged = discharged;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
}
