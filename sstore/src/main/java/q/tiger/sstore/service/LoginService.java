package q.tiger.sstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import q.tiger.sstore.model.Account;
import q.tiger.sstore.reposirory.AccountRepo;

@Service
public class LoginService {

    @Autowired
    private AccountRepo accountRepo;

    public boolean login(Account account){
        return accountRepo.search(account).size() == 1;
    }
}
