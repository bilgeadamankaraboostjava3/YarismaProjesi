package com.muhammet.yarismaprojesi.repository.entity;

import com.muhammet.yarismaprojesi.repository.enums.KatilimDurumu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblkatilim")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Katilim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long user_id;
    Long yarisma_id;
    Long date;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    KatilimDurumu katilimDurumu = KatilimDurumu.ONAYLANMAMIS;
    @Embedded
    TableAdd tableAdd;
}
