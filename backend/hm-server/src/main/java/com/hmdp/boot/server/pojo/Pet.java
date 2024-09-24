package com.hmdp.boot.server.pojo;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Pet {
    @NonNull
    private String  PetName;
    @NonNull
    private Integer PetAge;

}
