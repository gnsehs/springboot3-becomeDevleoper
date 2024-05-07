package me.shinsunyoung.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class TestController {
    @Autowired // testservice bean 주입
    TestService testservice;

    @GetMapping("/test")
    public List<Member> getAllMember() {
        List<Member> members = testservice.getAllMembers();
        return members;
    }
}
