package com.modes.builder;

public class Game {
    public void drive(){
        CharacterBuilder characterBuilder = new CharacterBuilder();

        Character femaleChar = characterBuilder.buildfemaleChar();
        System.out.println("Female Character");
        femaleChar.showCharacter();
        System.out.println("Total Cost: " + femaleChar.getCost());

        Character maleChar = characterBuilder.buildmaleChar();
        System.out.println("\n\nMale Character");
        maleChar.showCharacter();
        System.out.println("Total Cost: " + maleChar.getCost());
    }
}
