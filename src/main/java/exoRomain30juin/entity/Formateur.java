package exoRomain30juin.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "formateur") // name optionnel, par défaut reprend le nom de la classe en minuscule
public class Formateur extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date hiredate;
    private int experience;
    private boolean isInterne;

    public Formateur(String civility, String lastname, String firstname, String email, String adress, int id, Date hiredate, int experience, boolean isInterne) {
        super(civility, lastname, firstname, email, adress);
        this.id = id;
        this.hiredate = hiredate;
        this.experience = experience;
        this.isInterne = isInterne;
    }

    public Formateur() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean getIsInterne() {
        return isInterne;
    }

    public void setIsInterne(boolean interne) {
        isInterne = interne;
    }
}
