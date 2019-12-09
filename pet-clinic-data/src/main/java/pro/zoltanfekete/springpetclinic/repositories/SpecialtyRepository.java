package pro.zoltanfekete.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.zoltanfekete.springpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
