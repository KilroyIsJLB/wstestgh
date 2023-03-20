package devops.kilroy.wstestgh;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api")
public class TestController {

    @Value("${variable.valeur}")
    String variable;
    @GetMapping("/items")
    public Iterable<String> getItems() {
        return Arrays.asList("value1", "value2", "values3");
    }

    @GetMapping("/items/{id}")
    public String getItem(@PathVariable int id) {
        return String.format("item%d", id);
    }

    @GetMapping("/itemsdb")
    public String getItemDb() {
        return String.format("variable=%s", variable);
    }
}
