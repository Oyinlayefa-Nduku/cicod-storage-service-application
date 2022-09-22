package com.project.cicodstorageservice.service;

import com.project.cicodstorageservice.domain.Todo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
// This interface called TodoService cotains the methods required to be able to save and get todos.
public interface TodoService {
    Todo saveTodo(String title, String description, MultipartFile file);

    byte[] downloadTodoImage(Long id);

    List<Todo> getAllTodos();
}
