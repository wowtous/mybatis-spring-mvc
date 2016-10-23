package org.darebeat.controller;

import org.darebeat.service.TableIpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by darebeat on 10/24/16.
 */
@Controller
public class fetchController {

    @Resource
    TableIpService service;

    @RequestMapping(value = "fetch")
    public String helloWorld(){
        return "fetch";
    }

    @RequestMapping(value = "get", method = RequestMethod.POST)
    public void get(HttpServletRequest request, HttpServletResponse response){
        String number = request.getParameter("num");
        String country = request.getParameter("country");
        String isp = request.getParameter("isp");

        String txt = service.printIp(number, country, isp);

        PrintWriter writer;
        try {
            response.setCharacterEncoding("UTF-8");
            writer = response.getWriter();
            writer.write(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
