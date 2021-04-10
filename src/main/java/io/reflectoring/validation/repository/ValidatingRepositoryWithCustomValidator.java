package io.reflectoring.validation.repository;

import io.reflectoring.validation.RequestWithCustomValidator;
import org.springframework.data.repository.CrudRepository;

public interface ValidatingRepositoryWithCustomValidator extends CrudRepository<RequestWithCustomValidator, Long> {
}
