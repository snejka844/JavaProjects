package com.company;

import java.util.Random;

enum Face{
    HEAD("HEAD"),
    TAIL("TAIL");

    private final String value;

    Face(String value) {
        this.value=value==null ? "HEAD":value;
    }

    @Override
    public String toString(){
        return String.format("Face: %s",value);
    }
}

public class Coin {

    private Random random;
    private Face face;

    public Coin(Face face) {
        setFace(face);
        random=new Random();
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face==null ? Face.HEAD : face;
    }

    //flip the coin at random
    public void flip(){
        if(random.nextBoolean()){
            face=Face.HEAD;
        }else{
            face=Face.TAIL;
        }
    }

    //Check if Heads
    public boolean isHeads(){
        return face==Face.HEAD;
    }

    @Override
    public String toString(){
        return face.toString();
    }
}
