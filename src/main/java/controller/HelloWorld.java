package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laurel on 17/4/26.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloWorld {
    @RequestMapping(value = "/world")
    public String helloWorld() {
        return "hello";
    }
}
