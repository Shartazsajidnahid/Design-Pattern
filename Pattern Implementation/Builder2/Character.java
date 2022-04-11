package com.modes.builder;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private List<Attributes> attributesList = new ArrayList<Attributes>();

    public void addAttribure(Attributes attribute){
        attributesList.add(attribute);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Attributes attribute : attributesList) {
            cost += attribute.price();
        }
        return cost;
    }

    public void showCharacter(){

        for (Attributes attribute : attributesList) {
            System.out.print("Attribute : " + attribute.name());
            System.out.print(", Material : " + attribute.getMaterial().provideMaterial());
            System.out.println(", Price : " + attribute.price());
        }
    }
}
