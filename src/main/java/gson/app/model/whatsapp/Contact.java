package gson.app.model.whatsapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {
    private Profile profile;
    @JsonProperty("wa_id")
    private String waId;

    public Contact(Profile profile, String waId) {
        this.profile = profile;
        this.waId = waId;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public String getWaId() {
        return this.waId;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setWaId(String waId) {
        this.waId = waId;
    }
}
