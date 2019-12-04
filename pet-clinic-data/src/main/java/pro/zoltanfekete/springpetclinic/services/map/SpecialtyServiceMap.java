package pro.zoltanfekete.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import pro.zoltanfekete.springpetclinic.model.Specialty;
import pro.zoltanfekete.springpetclinic.services.SpecialtyService;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
