package com.spring.curdopreation.Model;





import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
public class Player {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;

    @Column
    private  String lastName;

    @Column
    private Date dateOfInvited;

    @Column
    private  String nameOfClube;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfInvited() {
        return dateOfInvited;
    }

    public void setDateOfInvited(Date dateOfInvited) {
        this.dateOfInvited = dateOfInvited;
    }

    public String getNameOfClube() {
        return nameOfClube;
    }

    public void setNameOfClube(String nameOfClube) {
        this.nameOfClube = nameOfClube;
    }


}
