package com.muhammet.yarismaprojesi.repository;

import com.muhammet.yarismaprojesi.repository.entity.Katilim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKatilimRepository extends JpaRepository<Katilim, Long> {
}
