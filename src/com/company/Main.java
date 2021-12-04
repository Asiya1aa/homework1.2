package com.company;

public class Main {

    public static void main(String[] args) {
        Mam mam = new Mam("kitty",2,35,1.67);
        System.out.println(mam.getName() + mam.getDog()+mam.getAge()+mam.getRost());
        mam.legenda("orenge");
        Me me = new Me("asiya", 1,1,05.4,"11 pro max ");
        System.out.println(me.getName() + me.getDog()+me.getAge()+me.getRost());
        me.legenda(90);
        Me you = new Me("amira", 0,565,54.43,"samsung A10 pro ");
        System.out.println(you.getName() + you.getDog()+you.getAge()+you.getRost());
        me.legenda(0);
    }
}
