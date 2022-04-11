package com.modes.builder;

public class BuildMaleCharacter implements BuildCharacter{
    @Override
    public Attributes getCloth() {
        return new Cape();
    }

    @Override
    public Attributes getWeapon() {
        return new Sword();
    }

    @Override
    public Character getCharacter() {
        Character male_character = new Character();
        male_character.addAttribure(getCloth());
        male_character.addAttribure(getWeapon());
        return male_character;
    }
}
