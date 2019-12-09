package pro.zoltanfekete.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.zoltanfekete.springpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
