package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
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
    Texture cross;


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
        settings = new Texture(Gdx.files.internal("icons/settings.png"));

        background1 = new Texture(Gdx.files.internal("background.png"));
        background2 = new Texture(Gdx.files.internal("menus/Group 20.png"));

        button1 = new Texture(Gdx.files.internal("buttons/SavedGame1.png"));
        button2 = new Texture(Gdx.files.internal("buttons/SavedGame2.png"));
        button3 = new Texture(Gdx.files.internal("buttons/SavedGame3.png"));
        button4 = new Texture(Gdx.files.internal("buttons/SavedGame4.png"));
        cross = new Texture(Gdx.files.internal("Icons/close.png"));
        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(background1);
        sprite3 = new Sprite(background2);
        sprite4 = new Sprite(button1);
        sprite5 = new Sprite(button2);
        sprite6 = new Sprite(button3);
        sprite7 = new Sprite(button4);
        sprite8 = new Sprite(cross);

        sprite2.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        sprite3.setSize(393, 500);
        sprite3.setPosition(270,20);


        sprite4.setSize(256,70);
        sprite4.setPosition(345,375);

        sprite5.setSize(256,70);
        sprite5.setPosition(345,275);

        sprite6.setSize(256,70);
        sprite6.setPosition(345,175);

        sprite7.setSize(256,70);
        sprite7.setPosition(345,75);

        sprite1.setSize(60,60);
        sprite1.setPosition(20,470);

        sprite8.setSize(20,20);
        sprite8.setPosition(620,490);

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
        sprite8.draw(game.batch);
        game.batch.end();
        if(Gdx.input.isTouched()) {
            Vector2 tmp = new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle set = new Rectangle(20, 20, 60, 60);
            Rectangle cross = new Rectangle(615,40,20,20);
            if (set.contains(tmp.x, tmp.y)) {
                game.goToSettings(this);
            }
            if(cross.contains(tmp.x, tmp.y)){
               game.goToMainPage();
            }
        }
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







