package com.example.DesignPatterns;

import com.example.DesignPatterns.Structural.bridge.Nymar;
import com.example.DesignPatterns.Structural.bridge.PSG;
import com.example.DesignPatterns.Structural.bridge.Player;
import com.example.DesignPatterns.Structural.bridge.Team;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        Team team = new PSG();
        Player nymar = new Nymar();
        team.playMembers(List.of(nymar));
    }

}
