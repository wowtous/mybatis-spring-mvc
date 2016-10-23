package org.darebeat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by darebeat on 10/24/16.
 */
@Controller
public class helpController {
    @RequestMapping(value = "help")
    public String helloWord(){
        return "help";
    }
}
