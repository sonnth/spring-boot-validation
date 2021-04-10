package io.reflectoring.validation.service;

import javax.validation.Valid;

import io.reflectoring.validation.RequestWithCustomValidator;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
class ValidatingServiceWithGroups {

    @Validated(WhenCreate.class)
    void validateForCreate(@Valid RequestWithCustomValidator input){
      // do something
    }

    @Validated(WhenUpdate.class)
    void validateForUpdate(@Valid RequestWithCustomValidator input){
        // do something
    }

}
