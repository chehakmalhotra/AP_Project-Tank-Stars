package com.tankstars.game;

public class Player {
    Tank tank1;
    Tank tank2;
    Ground grd;

    Player(){
        this.setGrd();
    }
    private void setGrd(){
        grd = Ground.getInstance();
    }

    public Ground getGrd() {
        return grd;
    }

    public void setTank2(Tank tank2) {
        this.tank2 = tank2;
    }

    public Tank getTank1() {
        return tank1;
    }

    public Tank getTank2() {
        return tank2;
    }
    public void setTank1(Tank tank1){
        this.tank1 = tank1;
    }
}
