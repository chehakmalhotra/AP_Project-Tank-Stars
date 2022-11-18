package com.tankstars.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class TankStars extends Game {
	SpriteBatch batch;
	Texture img;
	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new HomePage(this));
	}
	public void goToMainPage(){
		MainPage mp = new MainPage(this);
		setScreen(mp);
	}
	@Override
	public void render () {
		 super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		//img.dispose();
	}

}
