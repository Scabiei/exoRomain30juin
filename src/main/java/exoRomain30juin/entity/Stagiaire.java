package exoRomain30juin.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stagiaire")
public class Stagiaire extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date birthdate;
    private int trainer_id;

    public Stagiaire(int id, String civility, String lastname, String firstname, String email, String adress, Date birthdate, int trainer_id) {
        super(civility, lastname, firstname, email, adress);
        this.id = id;
        this.birthdate = birthdate;
        this.trainer_id = trainer_id;
    }

    public Stagiaire() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }
}
