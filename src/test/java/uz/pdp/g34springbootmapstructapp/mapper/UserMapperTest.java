package uz.pdp.g34springbootmapstructapp.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import uz.pdp.g34springbootmapstructapp.domain.Address;
import uz.pdp.g34springbootmapstructapp.domain.User;
import uz.pdp.g34springbootmapstructapp.dto.UserDto;

@Slf4j
class UserMapperTest {

    @Test
    void testToDto() {
        User user = new User(
                1L,
                "John",
                "Doe",
                new Address("Uzbekistan", "Tashkent")
        );
        UserDto dto = UserMapper.INSTANCE.toDto(user);
        log.info(dto.toString());
    }

    @Test
    void testToEntity() {
        UserDto dto = new UserDto(
                1L,
                "John Doe"
        );
        User user = UserMapper.INSTANCE.toEntity(dto);
        log.info(user.toString());
    }
}