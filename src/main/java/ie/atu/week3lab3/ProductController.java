package ie.atu.week3lab3;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    List<Product> productsList = new ArrayList<Product>();

    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return productsList;
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody Product product) {
        productsList.add(product);
        return productsList;
    }
}
