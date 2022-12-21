package com.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.security.Key;

import static java.lang.System.exit;

public class GamePage implements Screen  {
    public boolean playerflag= false;
    float width1 = 1;
    float width2 = 1;
    float width3 = 1;
    float width4 = 1;

    Tank tank1;
    Tank tank2;
    ShapeRenderer shape1;
    ShapeRenderer shape2;
    ShapeRenderer shape3;
    ShapeRenderer shape4;
    ShapeRenderer shape5;
    ShapeRenderer shape6;
    ShapeRenderer shape7;
    ShapeRenderer shape8;
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

    public Sprite trajectorySprite1;

    public Sprite trajectorySprite2;
    public ProjectileEquation projectileEquation;
    public ProjectileEquation projectileEquationright;

    public GamePage(TankStars a){
        this.GAME = a;
        grd = a.info.getGrd();
        shape1 = new ShapeRenderer();
        shape2 = new ShapeRenderer();
        shape3 = new ShapeRenderer();
        shape4 = new ShapeRenderer();
        shape5 = new ShapeRenderer();
        shape6 = new ShapeRenderer();
        shape7 = new ShapeRenderer();
        shape8 = new ShapeRenderer();
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
//        sprite7.setSize(246,50);
//        sprite7.setPosition(200,480);
        //vs
        sprite9.setSize(91,60);
        sprite9.setPosition(440,470);
        //healthbar
//        sprite8.setSize(256,52);
//        sprite8.setPosition(523,485);
        //tank1
        tank1x = 100F;
        tank1y = grd.get_y(tank1x);
        //sprite3.rotate(6);
        //tank2
        tank2x = 570F;
        tank2y = grd.get_y(tank2x);
        //sprite4.setSize(213,115);
        GAME.info.getTank2().getSprite3().flip(true,false);
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
//        sprite13.setSize(145,25);
//        sprite13.setPosition(150,160);
        cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.setToOrtho(false);
        //img = new Texture("abrams.png");
        targetTexture = new Texture("ellipse.png");

        trajectorySprite1 = new Sprite(targetTexture);
        trajectorySprite2 = new Sprite(targetTexture);
        //trajectorySprite.setSize(1, 1);
        //trajectorySprite.setPosition(5, 5);
        //sprite1= new Sprite(img);
        //sprite1.setSize(100,100);
        //sprite1.setPosition(80,150);
        projectileEquation=new ProjectileEquation(20,0,80,250);
        projectileEquationright=new ProjectileEquation(20,10,200,250);


        //guicam.position.set(480/2F, 320/2F, 0);

    }

//    public void setTank1(Tank tank1) {
//        this.tank1 = tank1;
//        player1.setTank(tank1);
//    }
//    public void setTank2(Tank tank2) {
//        this.tank2 = tank2;
//        player2.setTank(tank2);
//    }
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
    float projectilefinalx=0;
    float projectilefinaly=0;
    float projectilefinalxright=0;
    float projectilefinalyright=0;


    public void draw(){
        float t = 0f;
        float x=0f;
        float y=0f;
        for (int i = 0; i<40; i++) {
            if(projectileEquation!=null){
            x =  projectileEquation.getX(t);
            y =  projectileEquation.getY(t);
            if(i==39){
                projectilefinalx = x;
                projectilefinaly = y;
            }
            }
            //System.out.println("x: " + x + " y: " + y);
            GAME.batch.begin();
            GAME.batch.setColor(1, 0, 0, 1);

            GAME.batch.draw(trajectorySprite1, x, y, 10, 10);
            GAME.batch.end();


            t += 0.25f;
        }
        //projectilefinalx=(int)x;
        //projectilefinaly=(int)y;

        /*float x2=0f;
        float y2=0f;

        for (int i = 0; i<40; i++) {
            if(projectileEquationright!=null){
                x2 =  projectileEquationright.getX(t);
                y2 =  projectileEquationright.getY(t);
                if(i==39){
                    projectilefinalxright = x2;
                    projectilefinalyright = y2;
                }
            }
            //System.out.println("x: " + x + " y: " + y);
            GAME.batch.begin();
            GAME.batch.setColor(0, 1, 0, 1);

            GAME.batch.draw(trajectorySprite2, x2, y2, 10, 10);
            GAME.batch.end();


            t += 0.25f;*/
        }






    int ye=5;
    int xe=20;

    int yer=5;
    int xer=-20;
    @Override
    public void render(float delta) {

        cam.update();
        GAME.batch.setProjectionMatrix(cam.combined);
        GAME.batch.begin();
        sprite2.draw(GAME.batch);
        sprite5.draw(GAME.batch);
        sprite6.draw(GAME.batch);
        //sprite7.draw(GAME.batch);
        sprite9.draw(GAME.batch);
        //sprite8.draw(GAME.batch);
        sprite11.draw(GAME.batch);
        sprite12.draw(GAME.batch);
        GAME.batch.end();
        grd.render(delta);

        GAME.batch.begin();
        sprite10.draw(GAME.batch);
        //sprite13.draw(GAME.batch);
        GAME.info.getTank1().getSprite3().draw(GAME.batch);
        GAME.info.getTank1().getSprite3().setPosition(tank1x,tank1y);
        GAME.info.getTank2().getSprite3().draw(GAME.batch);
        GAME.info.getTank2().getSprite3().setPosition(tank2x,tank2y);

        //sprite3.setOrigin(25, 100);
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT) && width1<=246 && !playerflag){
            try {
                tank1x = GAME.info.getTank1().moveRight(tank1x);
                tank1y = grd.get_y(tank1x);
                GAME.info.getTank1().getSprite3().setPosition(tank1x,tank1y);

            } catch (OutOfBounds e) {
                tank1x -= 1f;
            }
        }if(Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT) && width1<=246 && !playerflag){
            try {
                tank1x = GAME.info.getTank1().moveLeft(tank1x);
                tank1y = grd.get_y(tank1x);
                GAME.info.getTank1().getSprite3().setPosition(tank1x,tank1y);
            } catch (OutOfBounds e) {
                tank1x += 1f;
            }
        }
        //sprite4.setOrigin(sprite4.getWidth(),sprite4.getHeight());
        if(playerflag) {
            if (Gdx.input.isKeyPressed(Input.Keys.M) && width2<=246) {
                try {
                    tank2x = GAME.info.getTank2().moveLeft(tank2x);
                } catch (OutOfBounds e) {
                    tank2x+=1f;
                }
                tank2y = grd.get_y(tank2x);
                GAME.info.getTank2().getSprite3().setPosition(tank2x,tank2y);
            }
            if (Gdx.input.isKeyPressed(Input.Keys.N) && width2<=246) {
                try {
                    tank2x = GAME.info.getTank2().moveRight(tank2x);
                } catch (OutOfBounds e) {
                    tank2x-=1f;
                }
                tank2y = grd.get_y(tank2x);
                GAME.info.getTank2().getSprite3().setPosition(tank2x,tank2y);
            }
        }
        GAME.batch.end();
        //fuel start
        fuelbar1();
        fuelbar2();
        shape5.begin(ShapeRenderer.ShapeType.Filled);
        shape5.rect(200,500,246,30);
        shape5.setColor(Color.RED);
        shape5.end();
        shape6.begin(ShapeRenderer.ShapeType.Filled);
        shape6.setColor(Color.BLACK);
        shape6.rect(200,500,width3,30);
        shape6.end();
        shape7.begin(ShapeRenderer.ShapeType.Filled);
        shape7.rect(523,500,246,30);
        shape7.setColor(Color.RED);
        shape7.end();
        shape8.begin(ShapeRenderer.ShapeType.Filled);
        shape8.setColor(Color.BLACK);
        shape8.rect(523,500,width4,30);
        shape8.end();
        if(Gdx.input.isTouched()) {
            Vector2 tmp = new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Rectangle set = new Rectangle(20, 20, 60, 60);
            Rectangle menu = new Rectangle(900, 20, 60, 60);
            Rectangle fire = new Rectangle(550, 200, 104, 50);
            if (set.contains(tmp.x, tmp.y)) {
                GAME.goToSettings(this);
            }
            if (menu.contains(tmp.x, tmp.y)) {
                GAME.goToInGameMenu();
            }

            if (fire.contains(tmp.x, tmp.y)) {

                //if (tank2.getSprite3().getBoundingRectangle().contains(projectilefinalx, projectilefinaly)) {
                    if(!playerflag){
                        this.projectile1();
                        playerflag= true;
                        width2 = 1;
                    }
                    else{
                        this.projectile2();
                        playerflag=false;
                        width1 = 1;
                    }
                    //GAME.goToHomePage();
                //}
            }
        }
        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            ye=ye+1;

            if(playerflag)yer=yer+1;
            //System.out.println(ye);
        }

        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            ye=ye-1;

            if(playerflag)yer=yer-1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            xe=xe-1;

            if(playerflag)xer=xer+1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            xe=xe+1;

            if(playerflag)xer=xer-1;
        }




        if(!playerflag){trajectorystuff(projectileEquation, ye, xe, (int)tank1x+70, (int)tank1y+50);
            draw();}
        if(playerflag){trajectorystuff(projectileEquation, ye, -xe, (int)tank2x+70, (int)tank2y+50);
            draw();}
        //trajectorystuff(projectileEquationright, yer, xer, 800, 400);draw();

        if(width3==246){
            //sprite player1 wins
            GAME.goToMainPage();
        }
        if(width4==246){
            //sprite player2 wins
            GAME.goToMainPage();
        }
       

    }
    public void fuelbar1(){
        //for player1
        shape1.begin(ShapeRenderer.ShapeType.Filled);
        shape1.rect(200,450,246,30);
        shape1.setColor(Color.YELLOW);
        shape1.end();
        shape2.begin(ShapeRenderer.ShapeType.Filled);
        shape2.setColor(Color.BLACK);
        if((Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT) || Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT)) && width1<=246 && !playerflag){
            width1+=1;
        }
        shape2.rect(200,450,width1,30);
        shape2.end();
        //for player2
    }
    public void fuelbar2(){
        shape3.begin(ShapeRenderer.ShapeType.Filled);
        shape3.rect(523,450,246,30);
        shape3.setColor(Color.YELLOW);
        shape3.end();
        shape4.begin(ShapeRenderer.ShapeType.Filled);
        shape4.setColor(Color.BLACK);
        if((Gdx.input.isKeyPressed(Input.Keys.M) || Gdx.input.isKeyPressed(Input.Keys.N)) && width2<=246 && playerflag){
            width2+=1;
        }
        shape4.rect(523,450,width2,30);
        shape4.end();
        //fuel end
    }
    public void projectile1(){
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            float a = tank2y - 50;
            float b = tank2y + 50;
            float a1 = tank2x - 50;
            float b1 = tank2x + 50;
//                        System.out.println(projectilefinalx);
//                        System.out.println(projectilefinaly);
            if (projectilefinaly >= a && projectilefinaly <= b && projectilefinalx >= a1 && projectilefinalx <= b1) {
                width3+=1;
                tank2x+=2;
            }
        }
    }

    public void projectile2(){
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            float a = tank1y - 50;
            float b = tank1y + 50;
            float a1 = tank1x - 50;
            float b1 = tank1x + 50;
//                        System.out.println(projectilefinalx);
//                        System.out.println(projectilefinaly);
            if (projectilefinaly >= a && projectilefinaly <= b && projectilefinalx >= a1 && projectilefinalx <= b1) {
                width4+=1;
                tank1x-=2;
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
        img.dispose();
        targetTexture.dispose();

    }
}
