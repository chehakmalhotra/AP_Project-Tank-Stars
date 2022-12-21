package com.tankstars.game;

import com.badlogic.gdx.Game;

public class PlayerInfo {
    GamePage gamePage;
    Tank tank;
    Ground grd;

    PlayerInfo(GamePage gamePage,Tank tank, Ground grd){
        this.gamePage = gamePage;
        this.tank = tank;
        this.grd = grd;
    }

    public void setGamePage(GamePage gamePage) {
        this.gamePage = gamePage;
    }

    public void setGrd(Ground grd) {
        this.grd = grd;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Ground getGrd() {
        return grd;
    }

    public Tank getTank() {
        return tank;
    }

    public GamePage getGamePage() {
        return gamePage;
    }
}
