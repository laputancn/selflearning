package com.laputan.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class RateController {
    @Value("${rate}")
    String rate;

    @Value("${tollstart}")
    String tollstart;

    @Value("${lanecount}")
    String lanecount;

    @Value("${connstring}")
    String connstring;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("reateAmount", rate);
        m.addAttribute("lans", lanecount);
        m.addAttribute("tollstart", tollstart);
        m.addAttribute("connstring", connstring);
        return "rateview";
    }
}
