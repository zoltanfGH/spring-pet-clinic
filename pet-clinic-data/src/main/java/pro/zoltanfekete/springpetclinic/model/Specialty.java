package pro.zoltanfekete.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;

public class Specialty extends BaseEntity {

    @Getter
    @Setter
    private String description;
}
