package com.revature.repositories;

import com.revature.models.Account;
import com.revature.models.Transaction;
import com.revature.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


//    Optional<List<Account>> findByUser(User user);

    List<Account> findByUser(User user);

}
