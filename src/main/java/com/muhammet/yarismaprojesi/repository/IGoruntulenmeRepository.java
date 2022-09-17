package com.muhammet.yarismaprojesi.repository;

import com.muhammet.yarismaprojesi.repository.entity.Goruntulenme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGoruntulenmeRepository extends JpaRepository<Goruntulenme, Long> {

}
