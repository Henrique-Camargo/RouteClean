package dev.rick.RoutesClean.infrastructure.controller;

import dev.rick.RoutesClean.infrastructure.persistence.ClientEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @PostMapping("/criar")
    public String clientCriado(){
        return "cliente criado";
    }

}
