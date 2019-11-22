package pro.zoltanfekete.springpetclinic.services;

import pro.zoltanfekete.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
