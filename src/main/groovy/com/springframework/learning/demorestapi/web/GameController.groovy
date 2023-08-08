package com.springframework.learning.demorestapi.web

import com.springframework.learning.demorestapi.domain.Games
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class GameController {

//    @RequestMapping(method = RequestMethod.GET, path = "/games")
    @GetMapping("/games")
    List<Games> retrieveGameList() {
        return Arrays.asList(
                new Games(1, "Super Mario", "Action", "Nintendo"),
                new Games(2, "Zelda", "Action", "Nintendo"),
                new Games(3, "Mario Odyssey", "Action", "Nintendo")
        )
    }

    @RequestMapping("/hello")
    String sayHello() {
        return "Hello Sowjanya!"
    }
}
