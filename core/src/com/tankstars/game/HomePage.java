package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;

public class HomePage implements Screen {
    final TankStars game;
    OrthographicCamera cam;
    Texture hp;
    Sprite sprite;
    public HomePage(TankStars a) {
        this.game = a;
        hp = new Texture(Gdx.files.internal("HomePage (2).png"));
        sprite = new Sprite(hp);
        sprite.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.setToOrtho(false);
        //cam.
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
        sprite.draw(game.batch);
        game.batch.end();
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            game.goToMainPage();
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
