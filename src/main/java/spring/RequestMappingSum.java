package spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class RequestMappingSum {
    @GetMapping("/sum")
    public int sum(@RequestParam int a,@RequestParam int b){
        return a+b;
    }
}


//запрос -/api/sum?a=param1&b=param2 (param1/2-параметры запроса)
