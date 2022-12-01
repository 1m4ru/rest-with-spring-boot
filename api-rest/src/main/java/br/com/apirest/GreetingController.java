/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.apirest;

import br.com.apirest.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 1m4ru
 */
@RestController
public class GreetingController {
    
    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

@RequestMapping("/greeting")
public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")
                             String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
}
    

