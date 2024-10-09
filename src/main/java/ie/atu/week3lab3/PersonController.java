package ie.atu.week3lab3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    List<Person> personList = new ArrayList<Person>();

    @GetMapping("/getPerson")
    public List<Person> getProducts() {
        return personList;
    }

    @PostMapping("/createPerson")
    public List<Person> addProducts(@Valid @RequestBody Person person) {
        personList.add(person);
        return personList;
    }
}
