package be.dblocks;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Entity1 {
    @Column
    private String property;

    @Column
    private String otherProperty;

}
