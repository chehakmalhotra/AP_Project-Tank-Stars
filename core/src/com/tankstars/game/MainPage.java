package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
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
    public MainPage(TankStars a){
        this.game = a;
        settings = new Texture(Gdx.files.internal("settings.png"));
        Newgame = new Texture(Gdx.files.internal("newgame.png"));
        exitgame = new Texture(Gdx.files.internal("exitgame.png"));
        background = new Texture(Gdx.files.internal("background.png"));
        tankoptions = new Texture(Gdx.files.internal("tankoptions.png"));
        tank = new Texture(Gdx.files.internal("tank.png"));
    }

    @Override
    public void show() {



    }

    @Override
    public void render(float delta) {

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
