package uz.pdp.g34springbootmapstructapp.mapper;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import uz.pdp.g34springbootmapstructapp.domain.Client;
import uz.pdp.g34springbootmapstructapp.dto.ClientDto;

@Slf4j
class ClientMapperTest {

    private static ClientMapper mapper = Mappers.getMapper(ClientMapper.class);

    @Test
    void testToDto() {
        Client client = new Client(
                UUID.randomUUID(),
                "John",
                "Doe",
                "john_doe@gmail.com",
                "Somewhere",
                true
        );

        ClientDto dto = mapper.toDto(client);
        log.info(dto.toString());
    }

    @Test
    void testToEntity() {
        ClientDto dto = new ClientDto(
                UUID.randomUUID().toString(),
                "John",
                "Doe",
                "john_doe@gmail.com",
                "Somewhere"
        );
        Client client = mapper.toEntity(dto);
        log.info(client.toString());
    }
}