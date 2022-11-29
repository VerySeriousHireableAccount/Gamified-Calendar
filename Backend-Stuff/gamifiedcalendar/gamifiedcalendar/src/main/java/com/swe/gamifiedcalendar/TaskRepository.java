package com.swe.gamifiedcalendar;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long>{
    Task findById(long taskId);

    void deleteById(long taskId);

    List<Task> findAllByUsername(String username);
}
