package io.reflectoring.validation.service;

import javax.validation.Valid;

import io.reflectoring.validation.Request;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
class ValidatingService {

    void validateInput(@Valid Request input){
      // do something
    }

}
