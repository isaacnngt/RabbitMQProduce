package br.com.isaac.producer.controllers;


import br.com.isaac.producer.services.StringServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/produces")
public class StringControllers {

    private final StringServices services;

    @GetMapping
    public ResponseEntity<String> produce(@RequestParam("message") String message) {

        services.produce(message);
        return ResponseEntity.ok().body("Sending Message");

    }

}
