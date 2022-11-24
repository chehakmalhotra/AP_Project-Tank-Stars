package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Settings implements Screen {
    final TankStars GAME;
    Texture background;
    Texture cross;
    Texture musicN;
    Texture soundY;
    Texture soundN;
    Texture musicY;
    Texture menu;
    OrthographicCamera cam;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;
    Sprite sprite6;
    Sprite sprite7;
    boolean flag1 = true;
    boolean flag2 = true;
    public Settings(TankStars a){
        this.GAME = a;
        background = new Texture(Gdx.files.internal("background.png"));
        cross = new Texture(Gdx.files.internal("Icons/close.png"));
        soundN = new Texture(Gdx.files.internal("buttons/SoundOFF.png"));
        soundY = new Texture(Gdx.files.internal("buttons/SoundON.png"));
        musicN = new Texture(Gdx.files.internal("buttons/MusicOFF.png"));
        musicY = new Texture(Gdx.files.internal("buttons/MusicON.png"));
        menu = new Texture(Gdx.files.internal("menus/settings.png"));

        sprite1 = new Sprite(background);
        sprite2 = new Sprite(cross);
        sprite3 = new Sprite(soundN);
        sprite4 = new Sprite(soundY);
        sprite5 = new Sprite(musicN);
        sprite6 = new Sprite(musicY);
        sprite7 = new Sprite(menu);

        sprite1.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        //menu
        sprite7.setSize(371,468);
        sprite7.setPosition(300,30);
        //cross
        sprite2.setSize(20,20);
        sprite2.setPosition(620,470);
        //music
        sprite6.setSize(266,70);
        sprite6.setPosition(370,270);
        //sprite5 music no
        sprite5.setSize(266,70);
        sprite5.setPosition(370,270);
        //sound
        sprite4.setSize(266,70);
        sprite4.setPosition(370,180);
        //sound no
        sprite3.setSize(266,70);
        sprite3.setPosition(370,180);
        cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.setToOrtho(false);
    }

    public void setFlag1(boolean flag1) {
        this.flag1 = flag1;
    }

    public void setFlag2(boolean flag2) {
        this.flag2 = flag2;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        cam.update();
        GAME.batch.setProjectionMatrix(cam.combined);
        GAME.batch.begin();
        sprite1.draw(GAME.batch);
        sprite7.draw(GAME.batch);
        sprite2.draw(GAME.batch);
        sprite6.draw(GAME.batch);
        sprite4.draw(GAME.batch);
        if(Gdx.input.isTouched()){
            Vector2 tmp =  new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle music = new Rectangle(370,600,266,70);
            if(music.contains(tmp.x,tmp.y)){
                this.setFlag1(false);
                sprite5.draw(GAME.batch);
            }
        }
        GAME.batch.end();
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
