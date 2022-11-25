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

public class Changetanks2 implements Screen {
    final TankStars game;
    Texture settings;
    Texture background;
    Texture arrowL;
    Texture arrowR;
    Texture tank;
    Texture menu;
    Texture tinytank;
    Texture choosetank;
    Texture choose;
    Texture play;
    Texture banner;
    OrthographicCamera cam;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;
    Sprite sprite6;
    Sprite sprite7;
    Sprite sprite8;
    Sprite sprite9;
    Sprite sprite10;
    Sprite sprite11;

    public Changetanks2(TankStars a){
        this.game = a;
        settings = new Texture(Gdx.files.internal("Icons/settings.png"));
        background = new Texture(Gdx.files.internal("background.png"));
        arrowL = new Texture(Gdx.files.internal("icons/right.png"));
        arrowR = new Texture(Gdx.files.internal("icons/left.png"));
        tank = new Texture(Gdx.files.internal("frost.png"));
        menu = new Texture(Gdx.files.internal("menus/Rectangle 16.png"));
        tinytank = new Texture(Gdx.files.internal("icons/Frost.png"));
        choosetank = new Texture(Gdx.files.internal("buttons/ChooseTank.png"));
        choose = new Texture(Gdx.files.internal("buttons/Choose.png"));
        play = new Texture(Gdx.files.internal("buttons/Play.png"));
        banner = new Texture(Gdx.files.internal("icons/Frostban.png"));
        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(arrowL);
        sprite3 = new Sprite(arrowR);
        sprite4 = new Sprite(background);
        sprite5 = new Sprite(tank);
        sprite6 = new Sprite(menu);
        sprite7 = new Sprite(tinytank);
        sprite8 = new Sprite(choosetank);
        sprite9 = new Sprite(choose);
        sprite10 = new Sprite(play);
        sprite11 = new Sprite(banner);
        sprite4.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        //tinytank
        sprite7.setSize(157,150);
        sprite7.setPosition(680,240);
        //choose tank
        sprite8.setSize(300,47);
        sprite8.setPosition(615,430);
        //play
        sprite9.setSize(256,70);
        sprite9.setPosition(625,130);
        //choose
        sprite10.setSize(256,70);
        sprite10.setPosition(625,50);
        //menu
        sprite6.setSize(500,540);
        sprite6.setPosition(550,0);
        //tank
        sprite5.setSize(884, 477);
        sprite5.setPosition(-95,-25);
        //banner
        sprite11.setSize(400,95);
        sprite11.setPosition(100,400);
        //arrowR
        sprite2.setSize(30,30);
        sprite2.setPosition(920,295);
        //arrowL
        sprite3.setSize(30,30);
        sprite3.setPosition(560,295);
        //settings
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
        sprite4.draw(game.batch);
        sprite6.draw(game.batch);
        sprite5.draw(game.batch);
        sprite2.draw(game.batch);
        sprite3.draw(game.batch);
        sprite1.draw(game.batch);
        sprite11.draw(game.batch);
        sprite7.draw(game.batch);
        sprite8.draw(game.batch);
        sprite9.draw(game.batch);
        sprite10.draw(game.batch);
        game.batch.end();
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT)){
            game.goToChangetanks1();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT)){
            game.goToChangetanks3();
        }
        if(Gdx.input.isTouched()){
            Vector2 tmp =  new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle play = new Rectangle(590,450,256,70);
            Rectangle choose = new Rectangle(590,370,256,70);
            Rectangle arrowR = new Rectangle(925,200,30,30);
            Rectangle arrowL = new Rectangle(560,200,30,30);
            Rectangle set =new Rectangle(20,20,60,60);
            if(play.contains(tmp.x,tmp.y)){
                game.goToHomePage();
            }
            if(choose.contains(tmp.x,tmp.y)){
                game.goToHomePage();
            }
            if(arrowR.contains(tmp.x,tmp.y)){
                game.goToChangetanks3();
            }
            if(arrowL.contains(tmp.x,tmp.y)){
                game.goToChangetanks1();
            }
            if(set.contains(tmp.x,tmp.y)){
                game.goToSettings(this);
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



