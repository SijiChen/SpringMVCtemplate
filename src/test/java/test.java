import hello.EmQuote;
import hello.Quote;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;

/**
 * Created by sjchen on 2/11/17.
 */
public class test {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url="http://gturnquist-quoters.cfapps.io/api/random";
        Object o = restTemplate.getForObject(url,Object.class);
        LinkedHashMap linkedHashMap = (LinkedHashMap) o;
        Object oo=linkedHashMap.get("value");
        Quote q=restTemplate.getForObject(url, Quote.class);
        EmQuote emQuote=restTemplate.getForObject(url,EmQuote.class);
        restTemplate.postForObject(url,emQuote,EmQuote.class);
        System.out.println(q);
    }
}
