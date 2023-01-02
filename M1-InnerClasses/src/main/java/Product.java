import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    int id;
    String name;
    double price;
}
