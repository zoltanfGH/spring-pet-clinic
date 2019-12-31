package pro.zoltanfekete.springpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.zoltanfekete.springpetclinic.model.Pet;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetMapServiceTest {

    PetMapService petMapService;
    final String petName = "Kitty";

    @BeforeEach
    void setUp() {
        petMapService = new PetMapService();
        petMapService.save(Pet.builder().name(petName).build());
    }

    @Test
    void findAll() {
        Set<Pet> petSet = petMapService.findAll();

        assertEquals(1,petSet.size());
    }

    @Test
    void findById() {
        Pet pet = petMapService.findById(1L);

        assertEquals(1L,pet.getId());
    }

    @Test
    void save() {
        Pet pet2 = Pet.builder().name("Doggo").build();
        Pet savedPet2 = petMapService.save(pet2);

        assertEquals(2L,savedPet2.getId());
    }

    @Test
    void delete() {
        petMapService.delete(petMapService.findById(1L));
        assertEquals(0,petMapService.findAll().size());
    }

    @Test
    void deleteById() {
        petMapService.deleteById(1L);
        assertEquals(0,petMapService.findAll().size());
    }
}