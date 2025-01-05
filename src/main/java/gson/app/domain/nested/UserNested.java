package gson.app.domain.nested;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class UserNested {

    private String name;
    private String email;
    private int age;
    private boolean isDeveloper;
    private Address address;

    public UserNested() {
    }

    public UserNested(String name, String email, int age, boolean isDeveloper, Address address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.address = address;
    }

}
