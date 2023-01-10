import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
    private int number;
    private String name;
    private String lastname;
    private String phone;
    private String address;
    private String city;
    private String state;

}
