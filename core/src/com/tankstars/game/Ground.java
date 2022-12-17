package com.tankstars.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;

public class Ground implements Screen {
    final TankStars game;
    Ground(TankStars ts){
        this.game = ts;
        shape = new ShapeRenderer();
    }
    ShapeRenderer shape;
    ArrayList<Float> coordinates = new ArrayList<>();

    public void create() {

    }
    public void points(){
        double a = 0.5* Gdx.graphics.getHeight();
        //randome integer*height
        double h = 0.16*Gdx.graphics.getHeight();//randome int*height
        for(int i=1;i<=Gdx.graphics.getWidth();i++){
            coordinates.add((float) (h+a*(Math.sin(0.01*i))));
        }
        //System.out.println(coordinates.size());
    }



//    public void render(){
//        Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        this.points();
//        shape.begin(ShapeRenderer.ShapeType.Filled);
//        shape.setColor(Color.RED);
//        for(int i =0;i<Gdx.graphics.getWidth();i++){
//            shape.rect(i,0,1,coordinates.get(i));
//        }
//        shape.end();
//    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        this.points();
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(Color.RED);
        for(int i =0;i<Gdx.graphics.getWidth();i++){
            shape.rect(i,0,1,coordinates.get(i));
        }
        shape.end();

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

