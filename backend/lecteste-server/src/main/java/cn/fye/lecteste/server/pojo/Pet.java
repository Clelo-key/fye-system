package cn.fye.lecteste.server.pojo;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Pet {
    @NonNull
    private String petName;
    @NonNull
    private Integer petAge;

}
