package ie.atu.week3lab3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/Person")
public class PersonController {
    List<Person> productsList = new ArrayList<Person>();

    @GetMapping("/getPerson")
    public List<Person> getProducts() {
        return productsList;
    }

    @PostMapping("/createPerson")
    public List<Person> addProducts(@Valid @RequestBody Person person) {
        productsList.add(person);
        return productsList;
    }
}
