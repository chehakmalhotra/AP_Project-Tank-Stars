package com.tankstars.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;
import java.util.Random;

public class Ground implements Screen {
    //final TankStars game;

    ShapeRenderer shape;
    private static int chosen;

    Ground(){
        shape = new ShapeRenderer();
        int a = (int) (Math.random()*3);
        setChosen(a);
    }
    private ArrayList<Float> coordinates = new ArrayList<>();

    public static void setChosen(int c) {
        chosen = c;
    }

    public void points(int a){
        setChosen(a);
        for(int i=1;i<=Gdx.graphics.getWidth();i++){
            if(chosen==0) {
                coordinates.add((float) (200 + 90 * ((Math.sin(0.003 * i + 11)) + (Math.cos(0.0099 * i + 5)))));
            }
            if(chosen==1){
                coordinates.add((float) (200+90*(Math.sin(0.0084*i)+Math.sin(-0.007*i))));
            }
            if(chosen==2){
                coordinates.add((float)(200+50*(Math.sin(0.005*i)+Math.sin(-0.008*i))));
            }
        }
    }
    public float get_y(float a){
//        int m = chosen;
//        return m;
        if(chosen==0){
         return (float) (200+90*((Math.sin(0.003*a+11))+(Math.cos(0.0099*a+5))));}
        else if(chosen==1){
            return (float) (200+90*(Math.sin(0.0084*a)+Math.sin(-0.007*a)));
        }
        else if(chosen==2){
            return (float)(200+50*(Math.sin(0.005*a)+Math.sin(-0.008*a)));
        }
        return 0;

    }
    public void explosion(float a){
         //a is x coordinate where contact happens

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
//        Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        this.points(chosen);
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(Color.BROWN);
        for(int i =0;i<Gdx.graphics.getWidth();i++){
            shape.rect(i,0,1,coordinates.get(i));
        }
        shape.end();
        //System.out.println(coordinates.get(100));
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose () {
        shape.dispose();
    }
}

