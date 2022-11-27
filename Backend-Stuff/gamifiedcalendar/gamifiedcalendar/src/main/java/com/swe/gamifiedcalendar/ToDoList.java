package com.swe.gamifiedcalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long toDoListID;

    protected ToDoList() {}
}