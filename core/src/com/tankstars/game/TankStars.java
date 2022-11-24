package com.tankstars.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
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
	}public void goToHomePage(){
		this.setScreen(new HomePage(this));
	}
	public void goToSettings(){
		this.setScreen(new Settings(this));
	}
	public void ret(Screen m){
		this.setScreen(m);
	}
	public void goToChangetanks1(){
		Changetanks1 ct1= new Changetanks1(this);
		setScreen(ct1);
	}
	public void goToChangetanks2(){
		Changetanks2 ct2= new Changetanks2(this);
		setScreen(ct2);
	}
	public void goToChangetanks3(){
		Changetanks3 ct3= new Changetanks3(this);
		setScreen(ct3);
	}

	public void goToResumePage(){
		ResumePage rp= new ResumePage(this);
		setScreen(rp);
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
