package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.repository.IYarismaSorulariRepository;
import com.muhammet.yarismaprojesi.repository.entity.YarismaSorulari;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class YarismaSorulariService extends ServiceManager<YarismaSorulari,Long> {
    private final IYarismaSorulariRepository yarismaSorulariRepository;

    public YarismaSorulariService(IYarismaSorulariRepository yarismaSorulariRepository) {
        super(yarismaSorulariRepository);
        this.yarismaSorulariRepository = yarismaSorulariRepository;
    }
}
