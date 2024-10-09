package ie.atu.week3lab3;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    List<Person> productsList = new ArrayList<Person>();

    @GetMapping("/getProducts")
    public List<Person> getProducts() {
        return productsList;
    }

    @PostMapping("/addProducts")
    public List<Person> addProducts(@RequestBody Person person) {
        productsList.add(person);
        return productsList;
    }
}
