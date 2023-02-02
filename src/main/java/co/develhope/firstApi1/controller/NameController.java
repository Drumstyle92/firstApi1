package co.develhope.firstApi1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Class containing the controller with the program's API calls.
 */
@RestController
public class NameController {
    /**
     * Instance variable of the StringBuilder class.
     *
     */
    StringBuilder name = new StringBuilder("Dino");

    /**
     * @return Returns a String of my name.
     * get method to get my name.
     */
    @GetMapping(value = "/name")
    public String getName(){

        return name.toString();

    }

    /**
     * @return returns my reverse name.
     * method that reverses my name.
     */
    @PostMapping(value = "/name")
    public String postNameReverse(){

        return name.reverse().toString();

    }
}
