package q.tiger.sstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import q.tiger.sstore.model.Account;
import q.tiger.sstore.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;
    
    @GetMapping
    public String showLoginPage(@ModelAttribute Account account){
        return "login";
    }
    
    @PostMapping
    public String processLogin(Account account){
        if(loginService.login(account)){
            return "productList";
        }
       else{
           return "redirect:/login";
       }
    }

    
}
