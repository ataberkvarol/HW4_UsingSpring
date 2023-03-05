package edu.sbanciuniv.hw4_usingspring.repository;
import edu.sbanciuniv.hw4_usingspring.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository <Student, Integer> {


}
