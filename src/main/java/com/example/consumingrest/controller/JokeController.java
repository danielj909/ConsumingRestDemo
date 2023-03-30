package com.example.consumingrest.controller;

import com.example.consumingrest.entity.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class JokeController {

    private final RestTemplate restTemplate;

    @Autowired
    public JokeController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/")
    public String getRandomJoke(Model model) {
        Joke joke = restTemplate.getForObject(
                "https://official-joke-api.appspot.com/random_joke", Joke.class);
        model.addAttribute("joke", joke);
        if (joke == null) {
            model.addAttribute("joke", null);
        }
        return "joke";
    }
}