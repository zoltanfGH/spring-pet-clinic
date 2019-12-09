package pro.zoltanfekete.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.zoltanfekete.springpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
