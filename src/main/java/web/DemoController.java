package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sjchen on 2/7/17.
 */
@Controller
public class DemoController {

    @RequestMapping(value = "/nfirs-opt3-home-state",method = RequestMethod.GET)
    public String login() {
        return "nfirs-opt3-home-state";
    }

    @RequestMapping(value = "/nfirs-opt3-incident-manage",method = RequestMethod.GET)
    public String incidentManagement() {
        return "nfirs-opt3-incident-manage";
    }

    @RequestMapping(value = "/nfirs-opt3-incident-details",method = RequestMethod.GET)
    public String incidentDetails() {
        return "nfirs-opt3-incident-details";
    }


    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String submit() {
        RestTemplate restTemplate = new RestTemplate();
        return "nfirs-opt3-incident-details";
    }
}
