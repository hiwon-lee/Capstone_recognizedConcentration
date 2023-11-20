package ECST.recognizedConcentration.controller;

import ECST.recognizedConcentration.entity.Person;
import ECST.recognizedConcentration.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {

    // MemberRepository는 jpa로 멤버를 관리할수있게하는 인터페이스
    private final PersonRepository personRepository;


    @PostMapping("/users/save")
    public void personSave(@RequestBody Person person) {
        personRepository.save(person);
    }
}
