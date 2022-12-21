package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Tank {
    int fuel;
    int health;

    private Texture tankk1;

    private Sprite sprite3;
    String type;



    //Sprite sprite;
    public Tank(int fuel, int health, String type){
        this.fuel = fuel;
        this.health = health;
        this.type = type;
        this.tankk1= new Texture(Gdx.files.internal("abrams(1).png"));
        this.sprite3 = new Sprite(tankk1);
    }

    public void render(){

    }


    public Sprite getSprite3() {
        return sprite3;
    }

    public void setSprite3(Sprite sprite3) {
        this.sprite3 = sprite3;
    }
    public float moveRight(float a) throws OutOfBounds{
        a+=1f;
        if(a> Gdx.graphics.getWidth()){
            throw new OutOfBounds("Tank out of page");
        }
        return a;
    }

    public float moveLeft(float a) throws OutOfBounds{
        a-=1f;
        if(a< 0){
            throw new OutOfBounds("Tank out of page");
        }
        return a;
    }



}
