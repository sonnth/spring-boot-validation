package io.reflectoring.validation.service;

import javax.validation.ConstraintViolationException;

import io.reflectoring.validation.Request;
import io.reflectoring.validation.service.ValidatingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ValidatingServiceTest {

  @Autowired
  private ValidatingService service;

  @Test
  void whenInputIsValid_thenThrowsNoException(){
    Request input = new Request();
    input.setNumberBetweenOneAndTen(5);
    input.setIpAddress("111.111.111.111");

    service.validateInput(input);

    // then no exception
  }

  @Test
  void whenInputIsInvalid_thenThrowsException(){
    Request input = new Request();
    input.setNumberBetweenOneAndTen(0);
    input.setIpAddress("invalid");

    assertThrows(ConstraintViolationException.class, () -> {
      service.validateInput(input);
    });
  }

}