package com.sarademo.apilamatraca.repositories;

import com.sarademo.apilamatraca.entities.VetVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetVisitRepository extends JpaRepository<VetVisit, Long> {
}
