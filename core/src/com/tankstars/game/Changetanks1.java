package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;

public class Changetanks1 implements Screen {
    final TankStars game;
    Texture settings;


    Texture background;
    Texture arrow1;
    Texture arrow2;
    Texture tank;

    OrthographicCamera cam;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;

    public Changetanks1(TankStars a){
        this.game = a;
        settings = new Texture(Gdx.files.internal("settings.png"));

        background = new Texture(Gdx.files.internal("background.png"));
        arrow1 = new Texture(Gdx.files.internal("arrow1.png"));
        arrow2 = new Texture(Gdx.files.internal("arrow2.png"));
        tank = new Texture(Gdx.files.internal("tank1.png"));
        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(arrow1);
        sprite3 = new Sprite(arrow2);
        sprite4 = new Sprite(background);
        sprite5 = new Sprite(tank);

        sprite4.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        sprite5.setSize(660, 590);
        sprite5.setPosition(150,-60);
        sprite2.setSize(100,100);
        sprite2.setPosition(800,300);

        sprite3.setSize(100,100);
        sprite3.setPosition(50,300);

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
        sprite2.draw(game.batch);
        sprite3.draw(game.batch);
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



