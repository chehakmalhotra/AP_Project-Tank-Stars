package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import static java.lang.System.exit;

public class GamePage implements Screen  {
    Tank tank1 = new Tank(100, 100, "abrams");
    Tank tank2= new Tank(100, 100, "abrams");
    //private SpriteBatch batch = new SpriteBatch();
    private final TankStars GAME;
    private Ground grd;
    private Texture ground;
    private Texture background;
    //private Texture tankk1;
    private Texture tankk2;
    private Texture settings;
    private Texture GAMEmenu;
    private Texture healthbar1;
    private Texture healthbar2;
    private Texture fire;
    private Texture vs;
    private Texture fuel;
    private Texture power;
    private Texture angle;
    private Sprite sprite1;
    private Sprite sprite2;
    //private Sprite sprite3;
    private Sprite sprite4;
    private Sprite sprite5;
    private Sprite sprite6;
    private Sprite sprite7;
    private Sprite sprite8;
    private Sprite sprite9;
    private Sprite sprite10;
    private Sprite sprite11;
    private Sprite sprite12;
    private Sprite sprite13;
    //private float y;
    private OrthographicCamera cam;

    private float tank1x;
    private float tank1y;
    private float tank2x;
    private float tank2y;
    private Texture targetTexture;
    Texture img;

    public Sprite trajectorySprite;
    public ProjectileEquation projectileEquation;
    public GamePage(TankStars a){
        grd = new Ground();
        this.GAME = a;
        ground = new Texture(Gdx.files.internal("Ground.png"));
        background = new Texture(Gdx.files.internal("GameBackground.png"));
        //tankk1 = new Texture(Gdx.files.internal("abrams(1).png"));
        tankk2 = new Texture(Gdx.files.internal("frost(1).png"));
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
        //sprite3 = new Sprite(tankk1);
        sprite4 = new Sprite(tankk2);
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
       // tank1.
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
        tank1x = 100F;
        tank1y = grd.get_y(tank1x);
        //sprite3.setSize(120,115);
        if(tank1!=null)tank1.getSprite3().setPosition(tank1x,tank1y);
        //sprite3.rotate(6);
        //tank2
        tank2x = 570F;
        tank2y = grd.get_y(tank2x);
        //sprite4.setSize(213,115);
        sprite4.setPosition(tank2x,tank2y);

        sprite4.flip(true,false);
        //fire
        sprite10.setSize(104,50);
        sprite10.setPosition(550,300);
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
        //img = new Texture("abrams.png");
        targetTexture = new Texture("ellipse.png");

        trajectorySprite = new Sprite(targetTexture);
        //trajectorySprite.setSize(1, 1);
        //trajectorySprite.setPosition(5, 5);
        //sprite1= new Sprite(img);
        //sprite1.setSize(100,100);
        //sprite1.setPosition(80,150);
        projectileEquation=new ProjectileEquation();


        //guicam.position.set(480/2F, 320/2F, 0);

    }

    public void setTank1(Tank tank1) {
        this.tank1 = tank1;
    }

    @Override
    public void show() {

    }


   /* public void create () {

        //img = new Texture("abrams.png");
        targetTexture = new Texture("ellipse.png");

        trajectorySprite = new Sprite(targetTexture);
        //trajectorySprite.setSize(1, 1);
        //trajectorySprite.setPosition(5, 5);
        //sprite1= new Sprite(img);
        //sprite1.setSize(100,100);
        //sprite1.setPosition(80,150);
        projectileEquation=new ProjectileEquation();


        //guicam.position.set(480/2F, 320/2F, 0);

    }*/

    public void trajectorystuff(ProjectileEquation projectileEquation,int ye, int xe, int tank1x, int tank1y){

        if(projectileEquation!=null) {
            projectileEquation.gravity = -9.8f;
            projectileEquation.startVelocity.set(xe, ye);
            projectileEquation.startPoint = new Vector2(tank1x, tank1y);
        }
    }
    int projectilefinalx=0;
    int projectilefinaly=0;
    public void draw(){
        float t = 0f;
        float x=0f;
        float y=0f;

        for (int i = 0; i<40; i++) {
            if(projectileEquation!=null){
            x =  projectileEquation.getX(t);
            y =  projectileEquation.getY(t);
            }
            //System.out.println("x: " + x + " y: " + y);
            GAME.batch.begin();
            GAME.batch.setColor(1, 0, 0, 1);

            GAME.batch.draw(trajectorySprite, x, y, 10, 10);
            GAME.batch.end();


            t += 0.25f;
        }
        projectilefinalx=(int)x;
        projectilefinaly=(int)y;




    }

    int ye=5;
    int xe=20;
    @Override
    public void render(float delta) {

        cam.update();
        GAME.batch.setProjectionMatrix(cam.combined);
        GAME.batch.begin();
        sprite2.draw(GAME.batch);
        sprite5.draw(GAME.batch);
        sprite6.draw(GAME.batch);
        sprite7.draw(GAME.batch);
        sprite9.draw(GAME.batch);
        sprite8.draw(GAME.batch);
        sprite11.draw(GAME.batch);
        sprite12.draw(GAME.batch);
        GAME.batch.end();
        grd.render(delta);

        GAME.batch.begin();
        sprite10.draw(GAME.batch);
        sprite13.draw(GAME.batch);
        sprite4.draw(GAME.batch);
        tank1.getSprite3().draw(GAME.batch);
        //sprite3.setOrigin(25, 100);
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT) && tank1x<=Gdx.graphics.getWidth()){
            tank1x+= 1f;
            tank1y = grd.get_y(tank1x);
            tank1.getSprite3().setPosition(tank1x,tank1y);
        }if(Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT) && tank1x>=0){
            tank1x-= 1f;
            tank1y = grd.get_y(tank1x);
            tank1.getSprite3().setPosition(tank1x,tank1y);
        }
        //sprite4.setOrigin(sprite4.getWidth(),sprite4.getHeight());
        if(Gdx.input.isKeyPressed(Input.Keys.M) && tank2x<=Gdx.graphics.getWidth()){
            float beforey = tank2y;
            tank2x-= 1f;
            tank2y = grd.get_y(tank2x);
            double angle = -tank2y+beforey ;
            sprite4.setPosition(tank2x,tank2y);
//            sprite4.rotate((float) Math.atan(angle));
//            sprite4.setOrigin(0,0);
        }if(Gdx.input.isKeyPressed(Input.Keys.N)){
            float beforey = tank2y;
            tank2x+= 1f;
            tank2y = grd.get_y(tank2x);
            double angle = tank2y-beforey ;
            sprite4.setPosition(tank2x,tank2y);
//            sprite4.setRotation(20);
//            sprite4.setRotation((float) Math.atan(angle));
//            sprite4.setOrigin(0,0);
        }
//        sprite4.setRotation(0);
        GAME.batch.end();

        if(Gdx.input.isTouched()) {
            Vector2 tmp = new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle set = new Rectangle(20, 20, 60, 60);
            Rectangle menu = new Rectangle(900, 20, 60, 60);
            Rectangle fire = new Rectangle(550, 300, 104, 50);
            if (set.contains(tmp.x, tmp.y)) {
                GAME.goToSettings(this);
            }
            if (menu.contains(tmp.x, tmp.y)) {
                GAME.goToInGameMenu();
            }

            if (fire.contains(tmp.x, tmp.y)) {
                if (tank2.getSprite3().getBoundingRectangle().contains(projectilefinalx, projectilefinaly)) {
                    System.out.println("hit successfull");
                }
            }
        }




        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            if (tank2.getSprite3().getBoundingRectangle().contains(projectilefinalx, projectilefinaly)) {
                System.out.println("hit successfull");
            }

        }


        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            ye=ye+2;
            //System.out.println(ye);
        }

        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            ye=ye-2;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            xe=xe-2;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            xe=xe+2;
        }




        trajectorystuff(projectileEquation, ye, xe, (int)tank1x+70, (int)tank1y+50);

        draw();

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
        img.dispose();
        targetTexture.dispose();

    }
}
