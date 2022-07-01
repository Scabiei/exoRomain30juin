package exoRomain30juin.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "formateur") // name optionnel, par défaut reprend le nom de la classe en minuscule
public class Formateur extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="hiredate")
    private Date hiredate;
    @Column(name="experience")
    private int experience;
    @Column(name="isInterne")
    private boolean isInterne;
    @Column(name="stagiaires")
    private List<Stagiaire> stagiaires;
    @Column(name="subjects")
    private List<Subject> subjects;

    public Formateur(String civility, String lastname, String firstname, String email, String address, int id, Date hiredate, int experience, boolean isInterne, List<Stagiaire> stagiaires, List<Subject> subjects) {
        super(civility, lastname, firstname, email, address);
        this.id = id;
        this.hiredate = hiredate;
        this.experience = experience;
        this.isInterne = isInterne;
        this.stagiaires = stagiaires;
        this.subjects = subjects;
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

    public List<Stagiaire> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(List<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
