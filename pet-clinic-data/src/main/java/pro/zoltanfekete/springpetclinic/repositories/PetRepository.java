package pro.zoltanfekete.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.zoltanfekete.springpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
