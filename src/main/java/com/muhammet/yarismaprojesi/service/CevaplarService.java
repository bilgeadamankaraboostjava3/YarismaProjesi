package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.dto.request.CevaplarRequestDto;
import com.muhammet.yarismaprojesi.repository.ICevaplarRepository;
import com.muhammet.yarismaprojesi.repository.entity.Cevaplar;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CevaplarService extends ServiceManager<Cevaplar,Long> {
    private final ICevaplarRepository cevaplarRepository;

    public CevaplarService(ICevaplarRepository cevaplarRepository) {
        super(cevaplarRepository);
        this.cevaplarRepository = cevaplarRepository;
    }

    public void soruCevaplariniEkle(List<CevaplarRequestDto> dto, Long soruId){
       dto.forEach(cevap->{
        save(Cevaplar.builder()
                .soru_id(soruId)
                .istrue(cevap.isDogrucevapmi())
                .cevap(cevap.getCevapicerigi())
                .build());
       });
    }
}
