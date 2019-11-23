package pro.zoltanfekete.springpetclinic.services;

import pro.zoltanfekete.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
