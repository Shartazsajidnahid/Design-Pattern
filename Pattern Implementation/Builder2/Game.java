package com.modes.builder;

public class Game {
    public void drive(){

        BuildCharacter female_characterBuilder = new BuildFemaleCharacter();
        Character femaleChar = female_characterBuilder.getCharacter();

        System.out.println("Female Character");
        femaleChar.showCharacter();
        System.out.println("Total Cost: " + femaleChar.getCost());

        BuildCharacter male_characterBuilder = new BuildMaleCharacter();
        Character maleChar = male_characterBuilder.getCharacter();
        System.out.println("\n\nMale Character");
        maleChar.showCharacter();
        System.out.println("Total Cost: " + maleChar.getCost());

        BuildCharacter male_builder_arrow = new BuildMaleCharWith_Arrow();
        Character maleCharWithArrow = male_builder_arrow.getCharacter();
        System.out.println("\n\nMale Character With Arrow");
        maleCharWithArrow.showCharacter();
        System.out.println("Total Cost: " + maleCharWithArrow.getCost());
    }
}
