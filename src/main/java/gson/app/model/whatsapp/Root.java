package gson.app.model.whatsapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {
    @JsonProperty("object")
    private String object_field;
    private List<Entry> entry;

    public Root(String object_field, List<Entry> entry) {
        this.object_field = object_field;
        this.entry = entry;
    }

    public String getObject_field() {
        return this.object_field;
    }

    public List<Entry> getEntry() {
        return this.entry;
    }

    public void setObject_field(String object_field) {
        this.object_field = object_field;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }
}


