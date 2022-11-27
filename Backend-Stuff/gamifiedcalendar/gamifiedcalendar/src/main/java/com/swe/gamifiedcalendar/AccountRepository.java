package com.swe.gamifiedcalendar;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer>{
    Account findById(int accountId);
}
