package com.microservices.covid19alert.dto;

import java.time.ZonedDateTime;

public class CovidApiData {
    private CountryData data;
    private ZonedDateTime lastRefreshed;
    private ZonedDateTime lastOriginUpdate;

    public CountryData getData() {
        return data;
    }

    public void setData(CountryData data) {
        this.data = data;
    }

    public ZonedDateTime getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(ZonedDateTime lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public ZonedDateTime getLastOriginUpdate() {
        return lastOriginUpdate;
    }

    public void setLastOriginUpdate(ZonedDateTime lastOriginUpdate) {
        this.lastOriginUpdate = lastOriginUpdate;
    }
}
