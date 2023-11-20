package ECST.recognizedConcentration.repository;

import ECST.recognizedConcentration.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
