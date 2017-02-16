package web;

import hello.EmQuote;
import hello.Quote;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sjchen on 2/7/17.
 */
@Controller
public class DemoController {

    public static Logger logger= LogManager.getLogger(DemoController.class);
    @RequestMapping(value = "/nfirs-opt3-home-state",method = RequestMethod.GET)
    public String login() {
        logger.info("test log into");
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
        String url="http://gturnquist-quoters.cfapps.io/api/random";
        Object o = restTemplate.getForObject(url,Object.class);
        Quote q=restTemplate.getForObject(url, Quote.class);
        EmQuote emQuote=restTemplate.getForObject(url,EmQuote.class);
        System.out.println(q);
        return "nfirs-opt3-incident-details";
    }
}
