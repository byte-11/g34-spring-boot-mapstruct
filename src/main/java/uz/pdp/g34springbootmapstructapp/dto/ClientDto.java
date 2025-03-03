package uz.pdp.g34springbootmapstructapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private String id;
    private String firstName;
    private String lastName;
    private String mail;
    private String location;
}
