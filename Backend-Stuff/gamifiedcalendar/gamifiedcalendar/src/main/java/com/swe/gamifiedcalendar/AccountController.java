package com.swe.gamifiedcalendar;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
class AccountController {

    private final AccountRepository repository;

    AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Accounts/Tasks/{id}")
    Account tasksForAccount(@PathVariable Long id) {
        return repository.findById(id).get();
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/Accounts")
    List<Account> all() {
        return (List<Account>) repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/Accounts")
    Account newAccount(@RequestBody Account newAccount) {
        return repository.save(newAccount);
    }

    @DeleteMapping("/Accounts/{id}")
    void deleteAccount(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
