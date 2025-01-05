package gson.app.model.whatsapp;

public class Message {
    private String from;
    private String id;
    private String timestamp;
    private String type;
    private Text text;

    public Message(String from, String id, String timestamp, String type, Text text) {
        this.from = from;
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
        this.text = text;
    }

    public String getFrom() {
        return this.from;
    }

    public String getId() {
        return this.id;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public Text getText() {
        return this.text;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setText(Text text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", id='" + id + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", type='" + type + '\'' +
                ", text=" + text +
                '}';
    }
}
