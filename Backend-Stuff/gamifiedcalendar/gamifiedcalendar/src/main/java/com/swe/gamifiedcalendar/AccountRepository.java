package com.swe.gamifiedcalendar;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long>{
    Account findById(long accountId);
}
