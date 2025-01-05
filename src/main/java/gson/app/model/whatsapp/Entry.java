package gson.app.model.whatsapp;

import java.util.List;

public class Entry {
    private String id;
    private List<Change> changes;

    public Entry(String id, List<Change> changes) {
        this.id = id;
        this.changes = changes;
    }

    public String getId() {
        return this.id;
    }

    public List<Change> getChanges() {
        return this.changes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setChanges(List<Change> changes) {
        this.changes = changes;
    }
}
