package com.swe.gamifiedcalendar;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{
    Task findById(long taskId);
}
