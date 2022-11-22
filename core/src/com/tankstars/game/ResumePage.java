package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;

public class ResumePage implements Screen {
    final TankStars game;
    Texture settings;


    Texture background1;
    Texture background2;
    Texture button1;
    Texture button2;
    Texture button3;
    Texture button4;



    OrthographicCamera cam;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;
    Sprite sprite6;
    Sprite sprite7;


    public ResumePage(TankStars a){
        this.game = a;
        settings = new Texture(Gdx.files.internal("settings.png"));

        background1 = new Texture(Gdx.files.internal("background.png"));
        background2 = new Texture(Gdx.files.internal("background2.png"));

        button1 = new Texture(Gdx.files.internal("savedgame1.png"));
        button2 = new Texture(Gdx.files.internal("savedgame2.png"));
        button3 = new Texture(Gdx.files.internal("savedgame3.png"));
        button4 = new Texture(Gdx.files.internal("savedgame4.png"));

        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(background1);
        sprite3 = new Sprite(background2);
        sprite4 = new Sprite(button1);
        sprite5 = new Sprite(button2);
        sprite6 = new Sprite(button3);
        sprite7 = new Sprite(button4);


        sprite2.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        sprite3.setSize(600, 450);
        sprite3.setPosition(170,60);


        sprite4.setSize(330,61);
        sprite4.setPosition(300,400);

        sprite5.setSize(330,61);
        sprite5.setPosition(300,300);

        sprite6.setSize(330,61);
        sprite6.setPosition(300,200);

        sprite7.setSize(330,61);
        sprite7.setPosition(300,100);

        sprite1.setSize(60,60);
        sprite1.setPosition(20,470);








        cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.setToOrtho(false);






    }

    @Override
    public void show() {



    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 1);
        cam.update();
        game.batch.setProjectionMatrix(cam.combined);
        game.batch.begin();
        //game.batch.draw(hp,0,0);

        sprite2.draw(game.batch);
        sprite3.draw(game.batch);

        sprite4.draw(game.batch);
        sprite5.draw(game.batch);
        sprite6.draw(game.batch);
        sprite7.draw(game.batch);
        sprite1.draw(game.batch);




        game.batch.end();



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
    public void dispose() {

    }
}







