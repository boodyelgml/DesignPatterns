package com.example.DesignPatterns.Behavioral.command;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final SaveAllClientsCommand saveAllClientsCommand;

    @PostMapping("save")
    public String saveAll() {
        return saveAllClientsCommand.execute();
    }
}
