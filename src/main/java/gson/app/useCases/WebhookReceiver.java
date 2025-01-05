package gson.app.useCases;

import com.google.gson.Gson;
import gson.app.model.whatsapp.Root;

public class WebhookReceiver {

    public static void deserializableWebhook() {
        var webhookObj = new Gson().fromJson(json, Root.class);
        var messages = webhookObj
                .getEntry().getFirst()
                .getChanges().getFirst()
                .getValue()
                .getMessages().getFirst()
                .getText()
                .getBody();
        System.out.println(messages);
    }

    static String json = """
            {
              "object": "whatsapp_business_account",
              "entry": [
                {
                  "id": "WHATSAPP-BUSINESS-ACCOUNT-ID",
                  "changes": [
                    {
                      "value": {
                        "messaging_product": "whatsapp",
                        "metadata": {
                          "display_phone_number": "PHONE-NUMBER",
                          "phone_number_id": "PHONE-NUMBER-ID"
                        },
                        "contacts": [
                          {
                            "profile": {
                              "name": "John Doe"
                            },
                            "wa_id": "5511998765432"
                          }
                        ],
                        "messages": [
                          {
                            "from": "5511998765432",
                            "id": "ABCD1234EFGH5678",
                            "timestamp": "1609459200",
                            "type": "text",
                            "text": {
                              "body": "Hello, this is a test message."
                            }
                          }
                        ]
                      },
                      "field": "messages"
                    }
                  ]
                }
              ]
            }""";

}
