package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.repository.IYarismaRepository;
import com.muhammet.yarismaprojesi.repository.entity.Yarisma;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class YarismaService extends ServiceManager<Yarisma,Long> {
    private final IYarismaRepository yarismaRepository;

    public YarismaService(IYarismaRepository yarismaRepository) {
        super(yarismaRepository);
        this.yarismaRepository = yarismaRepository;
    }
}
