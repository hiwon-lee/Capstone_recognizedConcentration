package ECST.recognizedConcentration.controller;

import ECST.recognizedConcentration.dto.UserDTO;
import ECST.recognizedConcentration.entity.User;
import ECST.recognizedConcentration.repository.UserRepository;
import ECST.recognizedConcentration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor // userSErvice 대한 멤버를 사용가능
public class UserController {

    // injecting constrator
    private final UserService userService;

    // 회원가입 페이지 출력 요청
    @GetMapping("/user/signup")
    public String signupForm() {
        return "signup";
    }

    @PostMapping("/user/signup")    // name값을 requestparam에 담아온다
    public String signup(
            @ModelAttribute UserDTO userDTO
//            @RequestParam("userName") String userName,
//            @RequestParam("password") String password,
//            @RequestParam("age") String age
            // 하나의 코드로 주석처리한 모든 요소들을 관통할 수 있다! 이것이 바로 DTO의 기능이다.
    ) {
        System.out.println("UserController.save");
        System.out.println("userDTO = " + userDTO);
        userService.signup(userDTO);
        return "index";
    }
}
