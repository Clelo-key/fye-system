package cn.fye.lecteste.server.pojo;

import lombok.*;
import org.springframework.lang.Nullable;

@Data
@RequiredArgsConstructor()
public class User {
    @NonNull
    private String username;
    @NonNull
    private Integer age;
    private Pet pet;



}
