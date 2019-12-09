package pro.zoltanfekete.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.zoltanfekete.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
