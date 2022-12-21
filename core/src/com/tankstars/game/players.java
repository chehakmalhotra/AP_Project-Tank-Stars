package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class players implements Screen {
    private Texture background;
    private Texture player1;

    private Changetanks1 changetanks1;
    private Changetanks2 changetanks2;
    private Changetanks3 changetanks3;
    private Texture player2;
    private Texture settings;
    private Texture play;
    private Sprite sprite1;
    private Sprite sprite2;
    private Sprite sprite3;
    private Sprite sprite4;
    private Sprite sprite5;
    private OrthographicCamera cam;
    private final TankStars GAME;
    public players(TankStars a){
        this.GAME = a;
        changetanks1 = new Changetanks1(a);
        changetanks2 = new Changetanks2(a);
        changetanks3 = new Changetanks3(a);
        background = new Texture(Gdx.files.internal("background.png"));
        player1 = new Texture(Gdx.files.internal("buttons/Player1.png"));
        player2 = new Texture(Gdx.files.internal("buttons/Player2.png"));
        play = new Texture(Gdx.files.internal("buttons/Play.png"));
        settings = new Texture(Gdx.files.internal("Icons/settings.png"));
        sprite1 = new Sprite(background);
        sprite2 = new Sprite(player1);
        sprite3 = new Sprite(player2);
        sprite4 = new Sprite(play);
        sprite5 = new Sprite(settings);

        sprite1.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        //settings
        sprite5.setSize(60,60);
        sprite5.setPosition(20,470);
        //player1
        sprite2.setSize(401,100);
        sprite3.setSize(401,100);
        sprite2.setPosition(100,300);
        sprite3.setPosition(500,300);
        sprite4.setSize(321,100);
        sprite4.setPosition(300,50);
        cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.setToOrtho(false);
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
        sprite2.draw(GAME.batch);
        sprite3.draw(GAME.batch);
        sprite4.draw(GAME.batch);
        sprite5.draw(GAME.batch);
        GAME.batch.end();
        if(Gdx.input.isTouched()) {
            Vector2 tmp = new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle set = new Rectangle(20, 20, 60, 60);
            Rectangle p1 = new Rectangle(100,170,401,100);
            Rectangle p2 = new Rectangle(500,170,401,100);
            Rectangle play = new Rectangle(320,420,321,100);
            if (set.contains(tmp.x, tmp.y)) {
                GAME.goToSettings(this);
            }
            if(p1.contains(tmp.x, tmp.y)){
                changetanks1.setTank1flag(true);
                changetanks2.setTank1flag(true);
                changetanks3.setTank1flag(true);
                GAME.goToChangetanks1();
            }
            if(p2.contains(tmp.x, tmp.y)){
                changetanks1.setTank2flag(true);
                changetanks2.setTank2flag(true);
                changetanks3.setTank2flag(true);
                GAME.goToChangetanks1();
            }
            if(play.contains(tmp.x, tmp.y)){
                GAME.goToGamePage();
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
