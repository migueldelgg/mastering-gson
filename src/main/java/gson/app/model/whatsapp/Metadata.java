package gson.app.model.whatsapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata {
    @JsonProperty("display_phone_number")
    private String displayPhoneNumber;
    @JsonProperty("phone_number_id")
    private String phoneNumberId;

    public Metadata(String displayPhoneNumber, String phoneNumberId) {
        this.displayPhoneNumber = displayPhoneNumber;
        this.phoneNumberId = phoneNumberId;
    }

    public String getDisplayPhoneNumber() {
        return this.displayPhoneNumber;
    }

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    public void setDisplayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }
}
