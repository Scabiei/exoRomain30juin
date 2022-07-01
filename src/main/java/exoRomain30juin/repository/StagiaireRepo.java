package exoRomain30juin.repository;

import exoRomain30juin.entity.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface StagiaireRepo extends JpaRepository<Stagiaire, Integer> {

    public List<Stagiaire> findByBirthdate(Date birthdate);
    public List<Stagiaire> findByTrainer_id(int trainer_id);

}
