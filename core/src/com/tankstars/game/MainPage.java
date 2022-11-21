package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;
import org.w3c.dom.Text;

public class MainPage implements Screen {
    final TankStars game;
    Texture settings;
    Texture Newgame;
    Texture resumegame;
    Texture exitgame;
    Texture background;
    Texture tankoptions;
    Texture tank;

    OrthographicCamera cam;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;
    Sprite sprite6;
    public MainPage(TankStars a){
        this.game = a;
        settings = new Texture(Gdx.files.internal("settings.png"));
        Newgame = new Texture(Gdx.files.internal("newgame.png"));
        exitgame = new Texture(Gdx.files.internal("exitgame.png"));
        background = new Texture(Gdx.files.internal("background.png"));
        tankoptions = new Texture(Gdx.files.internal("tankoptions.png"));
        tank = new Texture(Gdx.files.internal("tank1.png"));
        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(Newgame);
        sprite3 = new Sprite(exitgame);
        sprite4 = new Sprite(background);
        sprite5 = new Sprite(tankoptions);
        sprite6 = new Sprite(tank);
        sprite4.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        sprite6.setSize(500, 477);
        sprite6.setPosition(100,-20);
        System.out.println(sprite6.getHeight());
        System.out.println(sprite6.getWidth());
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
        sprite6.draw(game.batch);
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
