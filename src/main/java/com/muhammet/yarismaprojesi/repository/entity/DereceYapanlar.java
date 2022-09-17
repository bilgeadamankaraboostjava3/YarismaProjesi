package com.muhammet.yarismaprojesi.repository.entity;

import com.muhammet.yarismaprojesi.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbldereceyapanlar")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DereceYapanlar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long user_id;
    Long yarisma_id;
    int puan;
    int sirasi;
    @Enumerated(EnumType.STRING)
    State state = State.ONAYLANMIS;
    @Embedded
    TableAdd tableAdd;

}
