package com.modes.builder;

public class BuildMaleCharWith_Arrow implements BuildCharacter{
    @Override
    public Attributes getCloth() {
        return new Cape();
    }

    @Override
    public Attributes getWeapon() {
        return new BowNArrow();
    }

    @Override
    public Character getCharacter() {
        Character character = new Character();
        character.addAttribure(getCloth());
        character.addAttribure(getWeapon());
        return character;
    }
}
