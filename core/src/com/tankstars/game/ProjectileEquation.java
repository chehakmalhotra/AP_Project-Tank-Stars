package com.tankstars.game;

import com.badlogic.gdx.math.Vector2;

public class ProjectileEquation
{
    public float gravity;
    public Vector2 startVelocity;
    public Vector2 startPoint;

    public ProjectileEquation(){
        gravity = 9.8f;
        startVelocity = new Vector2(200,0);
        startPoint = new Vector2(80,250);
    }

    public float getX(float t)
    {
        if (this.startVelocity!=null) return startVelocity.x*t + startPoint.x;
        else return 0;
    }


    public float getY(float t)
    {
        if(startVelocity!=null) return 0.5f*gravity*t*t + startVelocity.y*t + startPoint.y;
        else return 0;
    }
}
