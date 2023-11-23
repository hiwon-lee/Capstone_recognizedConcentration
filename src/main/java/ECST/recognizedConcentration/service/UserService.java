package ECST.recognizedConcentration.service;

import ECST.recognizedConcentration.dto.UserDTO;
import ECST.recognizedConcentration.entity.User;
import ECST.recognizedConcentration.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service  // 스프링이 관리해주는 객체를 나타낸다.
@RequiredArgsConstructor  // controller와 같이, create final member constructor
public class UserService {
    private final UserRepository userRepository; // 먼저 jpa, mysql dependency 추가

    public void signup(UserDTO userDTO) {
        // repsitory의 save 메서드 호출
        User userEntity = User.toUserEntity(userDTO);
        userRepository.save(userEntity);
        //Repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)

    }
}
