package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.repository.IKatilimRepository;
import com.muhammet.yarismaprojesi.repository.entity.Katilim;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class KatilimService extends ServiceManager<Katilim,Long> {
    private final IKatilimRepository katilimRepository;

    public KatilimService(IKatilimRepository katilimRepository) {
        super(katilimRepository);
        this.katilimRepository = katilimRepository;
    }
}
