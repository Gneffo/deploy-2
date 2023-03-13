package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/somma")
public class BasicController {

    @GetMapping("")
    public int getSum(){
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        return a + b;
    }

}