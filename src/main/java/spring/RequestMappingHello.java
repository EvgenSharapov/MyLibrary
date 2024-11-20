package spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RequestMappingHello {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "World")String name){
        return "Hello, "+name;
    }
}
//запрос-  /api/hello?name=Spring   Вывод- Hello, Spring
