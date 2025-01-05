package gson.app.domain.nested;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {
    private String street;
    private String houseNumber;
    private String city;
    private String country;

    public Address() {
    }

    public Address(String street, String houseNumber, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
