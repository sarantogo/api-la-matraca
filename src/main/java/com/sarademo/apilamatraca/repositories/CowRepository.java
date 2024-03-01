package com.sarademo.apilamatraca.repositories;

import com.sarademo.apilamatraca.entities.Cow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CowRepository extends JpaRepository<Cow, Long> {


}
