package org.testing.responsePojo.draft;

import java.util.Map;

public class DraftTimeSchedulesResponse {
    private String preferredDate;
    private Map<String, Long> preferredTime;

    public String getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(String preferredDate) {
        this.preferredDate = preferredDate;
    }

    public Map<String, Long> getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(Map<String, Long> preferredTime) {
        this.preferredTime = preferredTime;
    }
}
