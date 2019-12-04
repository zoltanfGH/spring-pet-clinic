package pro.zoltanfekete.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;

public class Speciality extends BaseEntity {

    @Getter
    @Setter
    private String description;
}
