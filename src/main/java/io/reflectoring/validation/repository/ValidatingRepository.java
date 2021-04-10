package io.reflectoring.validation.repository;

import io.reflectoring.validation.Request;
import org.springframework.data.repository.CrudRepository;

public interface ValidatingRepository extends CrudRepository<Request, Long> {
}
