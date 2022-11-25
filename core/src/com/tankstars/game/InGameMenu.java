package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class InGameMenu implements Screen {
    final TankStars game;
    Texture background;
    Texture menu;
    Texture ground;
    Texture mainmenu;
    Texture resume;
    Texture savegame;
    Sprite sprite1;
    Sprite sprite2;
    Sprite sprite3;
    Sprite sprite4;
    Sprite sprite5;
    Sprite sprite6;
    OrthographicCamera cam;
    public InGameMenu(TankStars a){
        this.game = a;
        ground = new Texture(Gdx.files.internal("Ground.png"));
        background = new Texture(Gdx.files.internal("GameBackground.png"));
        mainmenu = new Texture(Gdx.files.internal("buttons/MainMenu.png"));
        savegame = new Texture(Gdx.files.internal("buttons/SaveGame.png"));
        resume = new Texture(Gdx.files.internal("buttons/Resume.png"));
        menu = new Texture(Gdx.files.internal("menus/Group 7.png"));

        sprite2 = new Sprite(background);
        sprite1 = new Sprite(ground);
        sprite3 = new Sprite(mainmenu);
        sprite4 = new Sprite(savegame);
        sprite5 = new Sprite(resume);
        sprite6 = new Sprite(menu);
        sprite2.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        //ground
        sprite1.setSize(1000,300);
        sprite1.setPosition(0,-10);
        //menu
        sprite6.setSize(291,368);
        sprite6.setPosition(330,70);
        //3-main 5- resume 4 - save
        sprite3.setSize(228,60);
        sprite3.setPosition(380,125);
        sprite4.setSize(228,60);
        sprite4.setPosition(380,225);
        sprite5.setSize(228,60);
        sprite5.setPosition(380,325);
        cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.setToOrtho(false);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        cam.update();
        game.batch.setProjectionMatrix(cam.combined);
        game.batch.begin();
        sprite2.draw(game.batch);
        sprite1.draw(game.batch);
        sprite6.draw(game.batch);
        sprite5.draw(game.batch);
        sprite3.draw(game.batch);
        sprite4.draw(game.batch);
        game.batch.end();
        if(Gdx.input.isTouched()) {
            Vector2 tmp = new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle resume = new Rectangle(380,135,228,60);
            Rectangle mainmenu = new Rectangle(380,335,228,60);
            Rectangle saveGame = new Rectangle(380,235,228,60);
            if(mainmenu.contains(tmp.x, tmp.y)){
                game.goToMainPage();
            }
            if(resume.contains(tmp.x, tmp.y)){
                game.goToGamePage();
            }
            if(saveGame.contains(tmp.x,tmp.y)){
                game.goToResumePage();
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
