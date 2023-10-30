package az.kiraye.core.controller;

import az.kiraye.core.model.entity.User;
import az.kiraye.core.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TestContoller {

    UserRepository userRepository;

    @GetMapping("/name")
    public String getName() {
        log.info("Allah belani versin");
        System.out.println(userRepository.findAllUsers());
        return "Salam qaqa";
    }

    @GetMapping("/name/{id}")
    public User findById(@PathVariable("id")Integer id){
        return userRepository.findUserById(id);
    }



}
