package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.repository.IGoruntulenmeRepository;
import com.muhammet.yarismaprojesi.repository.entity.Goruntulenme;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class GoruntulenmeService extends ServiceManager<Goruntulenme,Long> {
    private final IGoruntulenmeRepository goruntulenmeRepository;

    public GoruntulenmeService(IGoruntulenmeRepository goruntulenmeRepository) {
        super(goruntulenmeRepository);
        this.goruntulenmeRepository = goruntulenmeRepository;
    }

}
