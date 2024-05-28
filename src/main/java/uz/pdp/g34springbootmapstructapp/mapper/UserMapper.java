package uz.pdp.g34springbootmapstructapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import uz.pdp.g34springbootmapstructapp.domain.Address;
import uz.pdp.g34springbootmapstructapp.domain.User;
import uz.pdp.g34springbootmapstructapp.dto.AddressDto;
import uz.pdp.g34springbootmapstructapp.dto.UserDto;

@Mapper(
        uses = {AddressMapper.class}
)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(
            target = "fullName",
            expression = "java(user.getFirstName() + \" \" + user.getLastName())"
    )
    UserDto toDto(User user);

    @Mapping(
            target = "firstName",
            expression = "java(dto.getFullName().split(\" \")[0])"
    )
    @Mapping(
            target = "lastName",
            expression = "java(dto.getFullName().split(\" \")[1])"
    )
    User toEntity(UserDto dto);


    @Mapping(
            target = "firstName",
            expression = "java(extractName(true, dto.getFullName()))"
    )
    @Mapping(
            target = "lastName",
            expression = "java(extractName(false, dto.getFullName()))"
    )
    User toDto(
            UserDto dto,
            AddressDto address
    );

    default String extractName(boolean isFirstName, String fullName){
        if(isFirstName){
            return fullName.substring(0, fullName.indexOf(' '));
        }
        return fullName.substring(fullName.indexOf(' ') + 1);
    }

//    default Address toAddressEntity(AddressDto dto) {
//        return new Address(dto.getCnt(), dto.getCty());
//    }
}
