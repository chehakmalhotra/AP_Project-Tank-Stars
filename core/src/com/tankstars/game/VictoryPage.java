package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;

public class VictoryPage implements Screen {
    final TankStars game;
    OrthographicCamera cam;
    Texture vp;
    Texture bg;
    Texture tank;//have to store what tank the user decides to use so we call that in victory and defeat
    Texture win;
    Texture settings;
    Texture newgame;
    Texture background;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;
    public VictoryPage(TankStars a){
        this.game = a;
        background = new Texture(Gdx.files.internal("background.png"));
        newgame = new Texture(Gdx.files.internal("newgame.png"));
        settings = new Texture(Gdx.files.internal("settings.png"));
        win = new Texture(Gdx.files.internal(("Victory banner.png")));
        tank = new Texture(Gdx.files.internal(("tank1.png")));//basically the tank we choose
        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(newgame);
        sprite3 = new Sprite(tank);
        sprite4 = new Sprite(background);
        sprite5 = new Sprite(win);
        sprite4.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        sprite1.setSize(60,60);
        sprite5.setSize(270,200);
        //sprite5.setColor(0,0,1,5);
        sprite1.setPosition(20,470);
        sprite5.setPosition(120,300);
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
        sprite4.draw(game.batch);
        sprite1.draw(game.batch);
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
