package gson.app;

import com.google.gson.Gson;
import gson.app.domain.User;

public class GsonUseCases {

    public static void serializableUserSimple() {
        User user = new User("miguel",
                "miguel@gmail.com",
                20,
                true);

        Gson gson = new Gson();

        var myUserJson = gson.toJson(user);
        System.out.println(myUserJson);
    }

    public static void desrializableUserSimple() {
        String user = "{\"name\":\"miguel\",\"email\":\"miguel@gmail.com\",\"age\":20,\"isDeveloper\":true}";
        Gson gson = new Gson();

        var myUserFromJson = gson.fromJson(user, User.class);

        myUserFromJson.setAge(22);

        System.out.println(myUserFromJson.toString());
    }

}
