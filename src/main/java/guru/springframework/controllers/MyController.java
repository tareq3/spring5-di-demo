package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    public String hello(){

        return "Hello!!!";
    }
}
