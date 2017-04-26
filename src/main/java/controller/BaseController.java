package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laurel on 17/4/26.
 */
@Controller
public class BaseController {

    @RequestMapping(value="/")
    public String home() {
        return "test";
    }
}
