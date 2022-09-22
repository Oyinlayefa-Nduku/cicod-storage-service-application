package com.project.cicodstorageservice.respository;

import com.project.cicodstorageservice.domain.Todo;
import org.springframework.data.repository.CrudRepository;

// This interface called TodoRepository performs a query
public interface TodoRepository extends CrudRepository<Todo, Long> {
    Todo findByTitle(String title);
}
