package com.muhammet.yarismaprojesi.repository;

import com.muhammet.yarismaprojesi.repository.entity.DereceYapanlar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDereceYapanlarRepository extends JpaRepository<DereceYapanlar, Long> {
}
