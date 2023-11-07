package com.gomugomu.backend.controller;

import com.gomugomu.backend.entity.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v2")
public class TodoController {
    List todoList = new ArrayList<Todo>();
    @GetMapping("/todo/{id}")
    public HashMap<String, Todo> fetchTodo(@PathVariable("id") Long id){
        HashMap<String,Todo> map = new HashMap();
        Todo todo = new Todo();
        map.put("data",todo);
        return map;
    }

    @DeleteMapping("/todo/{id}")
    public HashMap deleteTodo(@PathVariable("id") Long id){
        HashMap<String,Object> map = new HashMap<>();
        map.put("data",new Todo());
        return map;
    }

    @GetMapping("/todo")
    public HashMap fetchAllTodo(){
        HashMap<String,Object>  map = new HashMap<String,Object>();
        map.put("data",this.todoList);
        map.put("user",12);
        return map;
    }

    @PatchMapping("/todo/{id}")
    public HashMap updateTodo(@PathVariable("id") Long todoId, @RequestBody Todo todo){
        Todo tempTodo = null;
        for(Object item : this.todoList){
            Todo itemCast = (Todo) item;
            if(itemCast.getId() == todoId){
                tempTodo = itemCast;
            }
        }
        if(Objects.nonNull(tempTodo)){
            Long id = new Random().nextLong();
            Long createdBy = new Random().nextLong();
            todo.setCreatedBy(createdBy.toString());
            todo.setId(id);
            this.todoList.add(todo);
        }
        HashMap<String,Object> map = new HashMap();
        map.put("data",todo);
        return map;
    }

    @PostMapping("/todo")
    public HashMap createTodo(@RequestBody Todo todo){
        Long id = new Random().nextLong();
        Long createdBy = new Random().nextLong();
        todo.setCreatedBy(createdBy.toString());
        todo.setId(id);
        this.todoList.add(todo);
        HashMap<String,Object> map = new HashMap<>();
        map.put("data",new Todo());
        return map;
    }
}
