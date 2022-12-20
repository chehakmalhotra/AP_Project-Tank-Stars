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
    private final TankStars GAME;
    private boolean tank1flag= false;
    private boolean tank2flag= false;

    private GamePage gamepage;

    private Texture settings;
    private Texture background;
    private Texture arrowL;
    private Texture arrowR;
    private Texture tank;
    private Texture menu;
    private Texture tinytank;
    private Texture choosetank;
    private Texture choose;
    private Texture play;
    private Texture banner;
    private OrthographicCamera cam;
    private Sprite sprite1;
    private Sprite sprite2;
    private Sprite sprite3;
    private Sprite sprite4;
    private Sprite sprite5;
    private Sprite sprite6;
    private Sprite sprite7;
    private Sprite sprite8;
    private Sprite sprite9;
    private Sprite sprite10;
    private Sprite sprite11;

    public Changetanks2(TankStars a){
        this.GAME = a;
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
        //sprite9 = new Sprite(choose);
        sprite10 = new Sprite(choose);
        sprite11 = new Sprite(banner);
        sprite4.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        //tinytank
        sprite7.setSize(157,150);
        sprite7.setPosition(680,240);
        //choose tank
        sprite8.setSize(300,47);
        sprite8.setPosition(615,430);
        //play
//        sprite9.setSize(256,70);
//        sprite9.setPosition(625,130);
        //choose
        sprite10.setSize(256,70);
        sprite10.setPosition(625,30);
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
        GAME.batch.setProjectionMatrix(cam.combined);
        GAME.batch.begin();
        //GAME.batch.draw(hp,0,0);
        sprite4.draw(GAME.batch);
        sprite6.draw(GAME.batch);
        sprite5.draw(GAME.batch);
        sprite2.draw(GAME.batch);
        sprite3.draw(GAME.batch);
        sprite1.draw(GAME.batch);
        sprite11.draw(GAME.batch);
        sprite7.draw(GAME.batch);
        sprite8.draw(GAME.batch);
       // sprite9.draw(GAME.batch);
        sprite10.draw(GAME.batch);
        GAME.batch.end();
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT)){
            GAME.goToChangetanks1();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT)){
            GAME.goToChangetanks3();
        }
        if(Gdx.input.isTouched()){
            Vector2 tmp =  new Vector2(Gdx.input.getX(), Gdx.input.getY());
           // Rectangle play = new Rectangle(590,450,256,70);
            Rectangle choose = new Rectangle(570,410,256,70);
            Rectangle arrowR = new Rectangle(925,200,30,30);
            Rectangle arrowL = new Rectangle(560,200,30,30);
            Rectangle set =new Rectangle(20,20,60,60);
//            if(play.contains(tmp.x,tmp.y)){
//                GAME.goToGAMEPage();
//            }
            if(choose.contains(tmp.x,tmp.y)){
                GAME.goToPlayers();
                createtank2(gamepage);
            }
            if(arrowR.contains(tmp.x,tmp.y)){
                GAME.goToChangetanks3();
            }
            if(arrowL.contains(tmp.x,tmp.y)){
                GAME.goToChangetanks1();
            }
            if(set.contains(tmp.x,tmp.y)){
                GAME.goToSettings(this);
            }

          }

    }

    public void createtank2(GamePage gamepage){
        gamepage.tank1= new Tank(100,100,"abrams");
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

    public boolean isTank1flag() {
        return tank1flag;
    }

    public void setTank1flag(boolean tank1flag) {
        this.tank1flag = tank1flag;
    }

    public boolean isTank2flag() {
        return tank2flag;
    }

    public void setTank2flag(boolean tank2flag) {
        this.tank2flag = tank2flag;
    }
}



