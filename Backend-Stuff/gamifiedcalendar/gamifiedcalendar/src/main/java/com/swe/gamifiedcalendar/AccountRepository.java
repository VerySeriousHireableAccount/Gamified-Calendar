package com.swe.gamifiedcalendar;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long>{
    Account findById(long accountId);

    List<Task> 
}
