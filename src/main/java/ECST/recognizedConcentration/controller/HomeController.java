package ECST.recognizedConcentration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // http://localhost:8080/로 로컬 실행할때 index.html을 띄운다.
    @GetMapping("/")
    public String index() {
        return "index";
    }
}