package com.muhammet.yarismaprojesi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DoLoginDto {
    private String username;
    private String password;
}
