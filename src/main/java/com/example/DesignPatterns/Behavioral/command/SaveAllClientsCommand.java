package com.example.DesignPatterns.Behavioral.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SaveAllClientsCommand implements Command {
    private final ClientWritePlatformService clientWritePlatformService;

    @Override
    public String execute() {
        return clientWritePlatformService.saveAll();
    }
}
