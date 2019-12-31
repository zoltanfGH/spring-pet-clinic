package pro.zoltanfekete.springpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.zoltanfekete.springpetclinic.model.PetType;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetTypeMapServiceTest {

    PetTypeMapService petTypeMapService;
    final String petTypeName = "Dog";

    @BeforeEach
    void setUp() {
        petTypeMapService = new PetTypeMapService();
        petTypeMapService.save(PetType.builder().name(petTypeName).build());
    }

    @Test
    void findAll() {
        Set<PetType> petTypeSet = petTypeMapService.findAll();

        assertEquals(1,petTypeSet.size());
    }

    @Test
    void findById() {
        PetType petType = petTypeMapService.findById(1L);
        assertEquals(1L,petType.getId());
    }

    @Test
    void save() {
        PetType petType2 = PetType.builder().name("Cat").build();
        PetType savedPetType2 = petTypeMapService.save(petType2);

        assertEquals(2L, savedPetType2.getId());
    }

    @Test
    void delete() {
        petTypeMapService.delete(petTypeMapService.findById(1L));
        assertEquals(0, petTypeMapService.findAll().size());
    }

    @Test
    void deleteById() {
        petTypeMapService.deleteById(1L);
        assertEquals(0,petTypeMapService.findAll().size());
    }
}