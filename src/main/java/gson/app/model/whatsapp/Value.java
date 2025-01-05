package gson.app.model.whatsapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Value {
    @JsonProperty("messaging_product")
    private String messagingProduct;
    private Metadata metadata;
    private List<Contact> contacts;
    private List<Message> messages;

    public Value(String messagingProduct, Metadata metadata, List<Contact> contacts, List<Message> messages) {
        this.messagingProduct = messagingProduct;
        this.metadata = metadata;
        this.contacts = contacts;
        this.messages = messages;
    }

    public String getMessagingProduct() {
        return this.messagingProduct;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
