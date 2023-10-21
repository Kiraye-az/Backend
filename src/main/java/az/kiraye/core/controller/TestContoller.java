package az.kiraye.core.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@Slf4j
public class TestContoller {

  @GetMapping("/name")
  public String getName() {
    log.info("Allah belani versin");
    return "Salam qaqa";
  }


}
