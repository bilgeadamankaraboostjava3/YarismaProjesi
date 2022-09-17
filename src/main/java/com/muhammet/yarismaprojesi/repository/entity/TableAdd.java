package com.muhammet.yarismaprojesi.repository.entity;

import com.muhammet.yarismaprojesi.repository.enums.State;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class TableAdd {

    /**
     * Ortak olan alanlar
     */
    /**
     * 0-> pasif
     * 1-> onayda
     * 2-> onaylanmış
     * 3-> silinmiş
     * 4-> engellenmiş
     */
    Long createdate;
    Long updatedate;
}
