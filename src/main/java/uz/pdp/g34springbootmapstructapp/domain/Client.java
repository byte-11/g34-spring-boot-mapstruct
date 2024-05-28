package uz.pdp.g34springbootmapstructapp.domain;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private boolean active;
}
