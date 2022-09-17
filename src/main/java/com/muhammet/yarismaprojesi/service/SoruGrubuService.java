package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.repository.ISoruGrubuRepository;
import com.muhammet.yarismaprojesi.repository.entity.SoruGrubu;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SoruGrubuService extends ServiceManager<SoruGrubu,Long> {
    private final ISoruGrubuRepository soruGrubuRepository;

    public SoruGrubuService(ISoruGrubuRepository soruGrubuRepository) {
        super(soruGrubuRepository);
        this.soruGrubuRepository = soruGrubuRepository;
    }
}
