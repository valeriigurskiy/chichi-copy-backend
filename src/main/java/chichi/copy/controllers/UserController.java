package chichi.copy.controllers;

import chichi.copy.services.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private MailSender mailSender;

    @GetMapping(value = "/user/{email}")
    public int test(@PathVariable String email){
        int num = (int) (Math.random()*(999999-100000))+100000;
        mailSender.send(email, "Activate your account", "Activation code: " + num);
        return num;
    }
}
