package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.repository.ISorularRepository;
import com.muhammet.yarismaprojesi.repository.entity.Sorular;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SorularService extends ServiceManager<Sorular,Long> {
    private final ISorularRepository sorularRepository;

    public SorularService(ISorularRepository sorularRepository) {
        super(sorularRepository);
        this.sorularRepository = sorularRepository;
    }
}
