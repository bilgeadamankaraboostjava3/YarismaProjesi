package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.repository.IDereceYapanlarRepository;
import com.muhammet.yarismaprojesi.repository.entity.DereceYapanlar;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class DereceYapanlarService extends ServiceManager<DereceYapanlar,Long> {
    private final IDereceYapanlarRepository dereceYapanlarRepository;

    public DereceYapanlarService(IDereceYapanlarRepository dereceYapanlarRepository) {
        super(dereceYapanlarRepository);
        this.dereceYapanlarRepository = dereceYapanlarRepository;
    }
}
