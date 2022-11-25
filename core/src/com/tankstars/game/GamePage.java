package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class GamePage implements Screen {
    final TankStars GAME;
    Texture ground;
    Texture background;
    Texture tank1;
    Texture tank2;
    Texture settings;
    Texture GAMEmenu;
    Texture healthbar1;
    Texture healthbar2;
    Texture fire;
    Texture vs;
    Texture fuel;
    Texture power;
    Texture angle;
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
    Sprite sprite12;
    Sprite sprite13;
    OrthographicCamera cam;
    public GamePage(TankStars a){
        this.GAME = a;
        ground = new Texture(Gdx.files.internal("Ground.png"));
        background = new Texture(Gdx.files.internal("GameBackground.png"));
        tank1 = new Texture(Gdx.files.internal("Abrams.png"));
        tank2 = new Texture(Gdx.files.internal("Frost.png"));
        settings = new Texture(Gdx.files.internal("Icons/settings.png"));
        GAMEmenu = new Texture(Gdx.files.internal("Icons/menu.png"));
        healthbar1 = new Texture(Gdx.files.internal("Icons/health1.png"));
        healthbar2 = new Texture(Gdx.files.internal("Icons/health2.png"));
        vs = new Texture(Gdx.files.internal("Icons/vs.png"));
        power = new Texture(Gdx.files.internal("Icons/power.png"));
        angle = new Texture(Gdx.files.internal("Icons/angle.png"));
        fuel = new Texture(Gdx.files.internal("Icons/fuel.png"));
        fire = new Texture(Gdx.files.internal("buttons/fire.png"));
        sprite1 = new Sprite(ground);
        sprite2 = new Sprite(background);
        sprite3 = new Sprite(tank1);
        sprite4 = new Sprite(tank2);
        sprite5 = new Sprite(settings);
        sprite6 = new Sprite(GAMEmenu);
        sprite7 = new Sprite(healthbar1);
        sprite8 = new Sprite(healthbar2);
        sprite9 = new Sprite(vs);
        sprite10 = new Sprite(fire);
        sprite11 = new Sprite(power);
        sprite12 = new Sprite(angle);
        sprite13 = new Sprite(fuel);
        sprite2.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        //ground
        sprite1.setSize(1000,300);
        sprite1.setPosition(0,-10);
        //settings
        sprite5.setSize(60,60);
        sprite5.setPosition(20,470);
        //menu
        sprite6.setSize(50,50);
        sprite6.setPosition(900,480);
        //healthbar
        sprite7.setSize(246,50);
        sprite7.setPosition(200,480);
        //vs
        sprite9.setSize(91,60);
        sprite9.setPosition(440,470);
        //healthbar
        sprite8.setSize(256,52);
        sprite8.setPosition(523,485);
        //tank1
        sprite3.setSize(120,115);
        sprite3.setPosition(150,220);
        sprite3.rotate(6);
        //tank2
        sprite4.setSize(213,115);
        sprite4.setPosition(570,250);
        sprite4.rotate(7);
        sprite4.flip(true,false);
        //fire
        sprite10.setSize(104,50);
        sprite10.setPosition(550,50);
        //power
        sprite11.setSize(78,50);
        sprite11.setPosition(50,250);
        //angle
        sprite12.setSize(78,50);
        sprite12.setPosition(120,250);
        //fuel
        sprite13.setSize(145,25);
        sprite13.setPosition(150,160);
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
        sprite2.draw(GAME.batch);
        sprite1.draw(GAME.batch);
        sprite5.draw(GAME.batch);
        sprite6.draw(GAME.batch);
        sprite7.draw(GAME.batch);
        sprite9.draw(GAME.batch);
        sprite8.draw(GAME.batch);
        sprite3.draw(GAME.batch);
        sprite4.draw(GAME.batch);
        sprite10.draw(GAME.batch);
        sprite11.draw(GAME.batch);
        sprite12.draw(GAME.batch);
        sprite13.draw(GAME.batch);
        GAME.batch.end();
        if(Gdx.input.isTouched()) {
            Vector2 tmp = new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle set = new Rectangle(20, 20, 60, 60);
            Rectangle menu = new Rectangle(900, 20, 60, 60);
            if (set.contains(tmp.x, tmp.y)) {
                GAME.goToSettings(this);
            }
            if (menu.contains(tmp.x, tmp.y)) {
                GAME.goToInGameMenu();
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
