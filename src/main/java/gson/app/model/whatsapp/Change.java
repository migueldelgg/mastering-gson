package gson.app.model.whatsapp;

public class Change {
    private Value value;
    private String field;

    public Change(Value value, String field) {
        this.value = value;
        this.field = field;
    }

    public Value getValue() {
        return this.value;
    }

    public String getField() {
        return this.field;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setField(String field) {
        this.field = field;
    }


}
