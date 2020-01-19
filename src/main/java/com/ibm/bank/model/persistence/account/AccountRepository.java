package com.ibm.bank.model.persistence.account;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface AccountRepository extends JpaRepository< Account, String>{

}
