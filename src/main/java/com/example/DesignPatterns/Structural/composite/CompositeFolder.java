package com.example.DesignPatterns.Structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CompositeFolder implements Component {
    String name;
    List<Component> children = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Folder";
    }

    void childNames() {
        for (Component component : this.children) {
            System.out.println(component.getType() + " " + component.getName());
            if (component instanceof CompositeFolder) {
                for (Component subComponent : ((CompositeFolder) component).getChildren()) {
                    System.out.println("--" + subComponent.getName());
                }
            }
        }
    }
}
