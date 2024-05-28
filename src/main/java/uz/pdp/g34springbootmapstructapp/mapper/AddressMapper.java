package uz.pdp.g34springbootmapstructapp.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import uz.pdp.g34springbootmapstructapp.domain.Address;
import uz.pdp.g34springbootmapstructapp.dto.AddressDto;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    @Mapping(
            target = "cnt",
            source = "country"
    )
    @Mapping(
            target = "cty",
            source = "city"
    )
    AddressDto toDto(
            Address address
    );

    @InheritInverseConfiguration
    Address toEntity(
            AddressDto dto
    );
}
