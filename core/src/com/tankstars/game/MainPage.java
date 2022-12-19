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
    private final TankStars GAME;
    private Texture settings;
    private Texture NewGAME;
    private Texture savedGAMEs;
    private Texture exitGAME;
    private Texture background;
    private Texture tank;
    private Texture menu;

    private OrthographicCamera cam;
    private Sprite sprite1;
    private Sprite sprite2;
    private Sprite sprite3;
    private Sprite sprite4;
    private Sprite sprite5;
    private Sprite sprite6;
    private Sprite sprite7;
    private Sprite sprite8;





    public MainPage(TankStars a){
        this.GAME = a;
        settings = new Texture(Gdx.files.internal("icons/settings.png"));
        NewGAME = new Texture(Gdx.files.internal("buttons/NewGame.png"));
        exitGAME = new Texture(Gdx.files.internal("buttons/ExitGame.png"));
        background = new Texture(Gdx.files.internal("background.png"));
        menu = new Texture(Gdx.files.internal("menus/main.png"));
        tank = new Texture(Gdx.files.internal("abrams.png"));
        savedGAMEs = new Texture(Gdx.files.internal("buttons/SavedGames.png"));
        sprite1 = new Sprite(settings);
        sprite2 = new Sprite(NewGAME);
        sprite3 = new Sprite(exitGAME);
        sprite4 = new Sprite(background);
        sprite6 = new Sprite(tank);
        sprite7 = new Sprite(menu);
        sprite8 = new Sprite(savedGAMEs);
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
        //new GAME
        sprite2.setSize(266,70);
        sprite2.setPosition(650,380);
        //saved GAMEs
        sprite8.setSize(256,70);
        sprite8.setPosition(650,250);
//        //tank options
//        sprite5.setSize(256,70);
//        sprite5.setPosition(650,180);
        //exit GAME
        sprite3.setSize(260,70);
        sprite3.setPosition(650,120);
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
        GAME.batch.setProjectionMatrix(cam.combined);
        GAME.batch.begin();
        //GAME.batch.draw(hp,0,0);
        sprite4.draw(GAME.batch);
        sprite7.draw(GAME.batch);
        sprite6.draw(GAME.batch);
        sprite1.draw(GAME.batch);
        sprite2.draw(GAME.batch);
        sprite8.draw(GAME.batch);
        //sprite5.draw(GAME.batch);
        sprite3.draw(GAME.batch);
        GAME.batch.end();
        if(Gdx.input.isTouched()){
            Vector2 tmp =  new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle eg =new Rectangle(650,320,266,70);
            Rectangle ng =new Rectangle(650,60,260,70);
           // Rectangle to =new Rectangle(650,300,256,70);
            Rectangle sg =new Rectangle(650,180,256,70);
            Rectangle set =new Rectangle(20,20,60,60);
            if(eg.contains(tmp.x,tmp.y)){
                GAME.goToHomePage();
            }
            if(ng.contains(tmp.x,tmp.y)){
                GAME.goToPlayers();
            }
//            if(to.contains(tmp.x,tmp.y)){
//                GAME.goToChangetanks1();
//            }
            if(sg.contains(tmp.x,tmp.y)){
                GAME.goToResumePage();
            }
            if(set.contains(tmp.x,tmp.y)){
                GAME.goToSettings(this);
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
