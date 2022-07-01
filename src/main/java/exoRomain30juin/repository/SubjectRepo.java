package exoRomain30juin.repository;

import exoRomain30juin.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {

    public List<Subject> findByName(String name);
    public List<Subject> findByDuration(int duration);
    public List<Subject> findByDifficulty(String difficulty);

}
