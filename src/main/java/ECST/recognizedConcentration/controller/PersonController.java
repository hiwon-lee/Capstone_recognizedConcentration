package ECST.recognizedConcentration.controller;

import ECST.recognizedConcentration.entity.Person;
import ECST.recognizedConcentration.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {

    // MemberRepository는 jpa로 멤버를 관리할수있게하는 인터페이스
    private final PersonRepository personRepository;


    // 회원가입 : 디비에 회원저장
    @PostMapping("/users/signup")
    public void personSave(@RequestBody Person person) {

        personRepository.save(person);
    }

    // 로그인확인 : 디비에 있는 사용자 정보 일치 확인
    @GetMapping("/users/signin")
    public void personMatch(@RequestBody Person person) {

        // TODO : 사용자정보 비교후 일치시 service/mainServer.html페이지 열기
        personRepository.equals(person);
    }
}
