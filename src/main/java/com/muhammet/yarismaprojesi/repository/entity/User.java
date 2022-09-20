package com.muhammet.yarismaprojesi.repository.entity;

import com.muhammet.yarismaprojesi.repository.enums.State;
import com.muhammet.yarismaprojesi.repository.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbluser")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String adsoyad;
    String username;
    String password;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    UserType userType = UserType.USER;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    State state = State.ONAYLANMIS;
    @Embedded
    TableAdd tableAdd;
}
