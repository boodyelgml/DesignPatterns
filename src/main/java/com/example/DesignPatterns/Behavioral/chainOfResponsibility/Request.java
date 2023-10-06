package com.example.DesignPatterns.Behavioral.chainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Request {
    public String type;
    public String description;
}
