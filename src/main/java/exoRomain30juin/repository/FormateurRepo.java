package exoRomain30juin.repository;

import exoRomain30juin.entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FormateurRepo extends JpaRepository<Formateur, Integer> {

    public List<Formateur> findByHiredate(Date hiredate);
    public List<Formateur> findByExperience(int experience);
    public List<Formateur> findByIsInterne(boolean isInterne);

}
