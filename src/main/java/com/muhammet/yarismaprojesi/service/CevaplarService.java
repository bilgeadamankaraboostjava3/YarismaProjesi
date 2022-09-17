package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.repository.ICevaplarRepository;
import com.muhammet.yarismaprojesi.repository.entity.Cevaplar;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CevaplarService extends ServiceManager<Cevaplar,Long> {
    private final ICevaplarRepository cevaplarRepository;

    public CevaplarService(ICevaplarRepository cevaplarRepository) {
        super(cevaplarRepository);
        this.cevaplarRepository = cevaplarRepository;
    }
}
