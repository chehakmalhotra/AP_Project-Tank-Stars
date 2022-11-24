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
import org.w3c.dom.Text;

public class MainPage implements Screen {
    final TankStars game;
    Texture settings;
    Texture Newgame;
    Texture savedgames;
    Texture exitgame;
    Texture background;
    Texture tankoptions;
    Texture tank;
    Texture menu;
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
        settings = new Texture(Gdx.files.internal("icons/settings.png"));
        Newgame = new Texture(Gdx.files.internal("buttons/NewGame.png"));
        exitgame = new Texture(Gdx.files.internal("buttons/ExitGame.png"));
        background = new Texture(Gdx.files.internal("background.png"));
        tankoptions = new Texture(Gdx.files.internal("buttons/TankOptions.png"));
        menu = new Texture(Gdx.files.internal("menus/main.png"));
        tank = new Texture(Gdx.files.internal("abrams.png"));
        savedgames = new Texture(Gdx.files.internal("buttons/SavedGames.png"));
        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(Newgame);
        sprite3 = new Sprite(exitgame);
        sprite4 = new Sprite(background);
        sprite5 = new Sprite(tankoptions);
        sprite6 = new Sprite(tank);
        sprite7 = new Sprite(menu);
        sprite8 = new Sprite(savedgames);
        sprite4.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        //menu
        sprite7.setSize(500,540);
        sprite7.setPosition(550,0);
        //tank
        sprite6.setSize(500, 477);
        sprite6.setPosition(45,-20);
        //settings
        sprite1.setSize(60,60);
        sprite1.setPosition(20,470);
        //new game
        sprite2.setSize(266,70);
        sprite2.setPosition(650,420);
        //saved games
        sprite8.setSize(256,70);
        sprite8.setPosition(650,300);
        //tank options
        sprite5.setSize(256,70);
        sprite5.setPosition(650,180);
        //exit game
        sprite3.setSize(260,70);
        sprite3.setPosition(650,60);
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
        if(Gdx.input.isTouched()){
            Vector2 tmp =  new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle eg =new Rectangle(650,420,266,70);
            Rectangle ng =new Rectangle(650,60,260,70);
            Rectangle to =new Rectangle(650,300,256,70);
            Rectangle sg =new Rectangle(650,180,256,70);
            Rectangle set =new Rectangle(20,20,60,60);
            if(eg.contains(tmp.x,tmp.y)){
                game.goToHomePage();
            }
            if(ng.contains(tmp.x,tmp.y)){
                game.goToHomePage();
            }
            if(to.contains(tmp.x,tmp.y)){
                game.goToChangetanks1();
            }
            if(sg.contains(tmp.x,tmp.y)){
                game.goToHomePage();
            }
            if(set.contains(tmp.x,tmp.y)){
                game.goToSettings();
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
