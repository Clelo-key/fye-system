package com.hmdp.boot.server.pojo;

import lombok.*;
import org.springframework.lang.Nullable;

@Data
@RequiredArgsConstructor()
public class User {
    @NonNull
    private String Username;
    @NonNull
    private Integer age;
    private Pet pet;



}
