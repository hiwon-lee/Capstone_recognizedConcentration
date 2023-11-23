package ECST.recognizedConcentration.dto;

import ECST.recognizedConcentration.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok dependency추가
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDTO { //회원 정보를 필드로 정의
    private Long id;
    private String password;
    private String userName;

    //lombok 어노테이션으로 getter,setter,생성자,toString 메서드 생략 가능

    public static UserDTO toUserDTO(User userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setUserName(userEntity.getUserName());
        userDTO.setPassword(userEntity.getPassword());

        return userDTO;
    }
}