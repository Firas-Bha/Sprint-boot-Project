package tn.esprit.arc.spring.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.arc.spring.stationdeski.entites.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Integer> {
}
