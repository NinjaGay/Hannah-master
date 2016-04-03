/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.chars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef;


/**
 *
 * @author Louzas
 */
public class Hannah extends Characters{
    
    private Texture hannahSprite;   
    
    public Hannah() {
        hannahSprite = new Texture("hannahSprite.png");
        super.setSprite(hannahSprite);
        super.setHealthPoints(100);
        super.setDamage(10); 
        super.setSpeed(5);
        super.setX(630);
        super.setY(220);
        super.bodyDef.type = BodyDef.BodyType.DynamicBody;
    }
    
    public void handleInput() {
        if(Gdx.input.isKeyPressed(Input.Keys.UP))
            moveUp();
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
            moveDown();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            moveRight();
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            moveLeft();
    }
    public void moveUp(){                   
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN) || 
           Gdx.input.isKeyPressed(Input.Keys.LEFT) || 
           Gdx.input.isKeyPressed(Input.Keys.RIGHT))
        {}           
        else        
            super.setY(super.getY() + super.getSpeed());       
    }
    public void moveDown(){
        if(Gdx.input.isKeyPressed(Input.Keys.UP) || 
           Gdx.input.isKeyPressed(Input.Keys.LEFT) || 
           Gdx.input.isKeyPressed(Input.Keys.RIGHT))
        {}           
        else
            super.setY(super.getY() - super.getSpeed());
    }
    public void moveRight(){
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN) || 
           Gdx.input.isKeyPressed(Input.Keys.LEFT) || 
           Gdx.input.isKeyPressed(Input.Keys.UP))
        {}           
        else
            super.setX(super.getX() + super.getSpeed());
    }
    public void moveLeft(){
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN) || 
           Gdx.input.isKeyPressed(Input.Keys.UP) || 
           Gdx.input.isKeyPressed(Input.Keys.RIGHT))
        {}           
        else
            super.setX(super.getX() - super.getSpeed());
    }
       
    @Override
    public void attack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void receiveAttack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void die() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //Getters & Setters
    public Texture getHannahSprite() {
        return hannahSprite;
    }
    public void setHannahSprite(Texture hannahSprite) {
        this.hannahSprite = hannahSprite;
    }  
        
}
