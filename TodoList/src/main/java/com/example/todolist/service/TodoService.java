package com.example.todolist.service;

import com.example.todolist.dao.TodoDao;
import com.example.todolist.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    TodoDao todoDao; // 取得Dao物件

    public Iterable<Todo> getTodos () {
        return todoDao.findAll();
    }
}
