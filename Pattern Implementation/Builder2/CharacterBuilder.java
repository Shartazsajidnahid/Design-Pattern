package com.modes.builder;

public class CharacterBuilder {


    public Character buildfemaleChar (){
        Character femalechar = new Character();

        femalechar.addAttribure(new Gown());
        femalechar.addAttribure(new BowNArrow());

        return femalechar;
    }

    public Character buildmaleChar (){
        Character malechar = new Character();

        malechar.addAttribure(new Cape());
        malechar.addAttribure(new Sword());

        return malechar;
    }

    public Character buildmaleCharWithArrow (){
        Character maleCharWithArrow = new Character();

        maleCharWithArrow.addAttribure(new Cape());
        maleCharWithArrow.addAttribure(new BowNArrow());

        return maleCharWithArrow;
    }
}
