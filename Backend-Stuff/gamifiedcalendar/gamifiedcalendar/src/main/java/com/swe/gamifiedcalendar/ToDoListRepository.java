package com.swe.gamifiedcalendar;

import org.springframework.data.repository.CrudRepository;

public interface ToDoListRepository extends CrudRepository<ToDoList, Long>{
    ToDoList findById(long toDoListId);
}