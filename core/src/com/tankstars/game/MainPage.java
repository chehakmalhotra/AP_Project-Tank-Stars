package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
    Texture background2;
    Texture resume;

    OrthographicCamera cam;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;
    Sprite sprite6;
    Sprite sprite7;
    Sprite sprite8;
    public MainPage(TankStars a){
        this.game = a;
        settings = new Texture(Gdx.files.internal("settings.png"));
        Newgame = new Texture(Gdx.files.internal("newgame.png"));
        exitgame = new Texture(Gdx.files.internal("exitgame.png"));
        background = new Texture(Gdx.files.internal("background.png"));
        tankoptions = new Texture(Gdx.files.internal("tankoptions.png"));
        background2= new Texture(Gdx.files.internal("Rectangle 1.png"));
        tank = new Texture(Gdx.files.internal("tank1.png"));
        resume= new Texture(Gdx.files.internal("resumegame.png"));
        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(Newgame);
        sprite3 = new Sprite(exitgame);
        sprite4 = new Sprite(background);
        sprite5 = new Sprite(tankoptions);
        sprite6 = new Sprite(tank);
        sprite7 = new Sprite(background2);
        sprite8 = new Sprite(resume);
        sprite4.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        sprite7.setSize(500,450);
        sprite7.setPosition(550,90);



        sprite6.setSize(500, 477);
        sprite6.setPosition(45,-20);

        sprite1.setSize(60,60);
        sprite1.setPosition(20,470);


        sprite2.setSize(300,61);
        sprite2.setPosition(600,420);

        sprite8.setSize(300,61);
        sprite8.setPosition(600,320);




        sprite5.setSize(300,61);
        sprite5.setPosition(600,220);

        sprite3.setSize(300,61);
        sprite3.setPosition(600,120);


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
        sprite7.draw(game.batch);
        sprite6.draw(game.batch);
        sprite1.draw(game.batch);
        sprite2.draw(game.batch);
        sprite8.draw(game.batch);
        sprite5.draw(game.batch);
        sprite3.draw(game.batch);
        game.batch.end();
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            game.goToChangetanks1();

        }
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            game.goToChangetanks2();

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
