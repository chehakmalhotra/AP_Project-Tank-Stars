package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;

public class ResumePage implements Screen {
    final TankStars game;
    Texture settings;


    Texture background;
    Texture background2;
    Texture button1;
    Texture button2;
    Texture button3;
    Texture button4;
    Texture button5;


    OrthographicCamera cam;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;
    Sprite sprite6;
    Sprite sprite7;
    Sprite sprite8;

    public ResumePage(TankStars a){
        this.game = a;
        settings = new Texture(Gdx.files.internal("settings.png"));

        background = new Texture(Gdx.files.internal("background.png"));
        background2 = new Texture(Gdx.files.internal("background2.png"));

        button1 = new Texture(Gdx.files.internal("savedgame1.png"));
        button2 = new Texture(Gdx.files.internal("savedgame2.png"));
        button3 = new Texture(Gdx.files.internal("savedgame3.png"));
        button4 = new Texture(Gdx.files.internal("savedgame4.png"));




        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(button1);
        sprite3 = new Sprite(button2);
        sprite4 = new Sprite(background);
        sprite5 = new Sprite(background2);
        sprite6 = new Sprite(button3);
        sprite7 = new Sprite(button4);
        sprite8 = new Sprite(button5);

        sprite4.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        System.out.println(sprite5.getHeight());
        System.out.println(sprite5.getWidth());
        sprite5.setSize(775, 600);
        sprite5.setPosition(90,-110);


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
        sprite4.draw(game.batch);
        sprite5.draw(game.batch);

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




