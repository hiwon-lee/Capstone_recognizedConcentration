package ECST.recognizedConcentration.entity;

import ECST.recognizedConcentration.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "user_table")  // 사용하지 않으면 클래스 이름이 테이블 이름이 됨
@Getter  // lombok getter
@Setter  // lombok setter
public class User {

    // 기본키를 의미. 반드시 기본키를 가져야 함.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 비밀번호
    @NonNull
    @Column(name="pass_word")
    private String password;

    // 사용자 이름
    @NonNull
    @Column(unique = true, length = 10, name = "user_name") // 유일하고 최대 길이가 10
    private String userName;

    // 사용자 나이
    @Column(name="person_age")
    private int age;

    public static User toUserEntity(UserDTO userDTO){
        User userEntity = new User();
        userEntity.setId(userDTO.getId());
        userEntity.setUserName(userDTO.getUserName());
        userEntity.setPassword(userDTO.getPassword());
        return userEntity;
    }

}
