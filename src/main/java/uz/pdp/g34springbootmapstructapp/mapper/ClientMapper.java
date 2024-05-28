package uz.pdp.g34springbootmapstructapp.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.pdp.g34springbootmapstructapp.domain.Client;
import uz.pdp.g34springbootmapstructapp.dto.ClientDto;

@Mapper
public interface ClientMapper {
    @Mapping(source = "email", target = "mail")
    @Mapping(source = "address", target = "location")
    ClientDto toDto(Client client);

    /*@Mapping(source = "mail", target = "email")
    @Mapping(source = "location", target = "address")*/
    @InheritInverseConfiguration
    Client toEntity(ClientDto dto);
}
