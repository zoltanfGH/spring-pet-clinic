package pro.zoltanfekete.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pro.zoltanfekete.springpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
