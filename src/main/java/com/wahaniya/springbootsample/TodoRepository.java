package com.wahaniya.springbootsample;
import org.springframework.data.repository.CrudRepository;
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
