/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.chars;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.BodyDef;

/**
 *
 * @author Louzas
 */
public abstract class Characters extends Sprite{
    
    private int healthPoints;
    private int damage;
    private int speed;   
    private Texture sprite;
     
    BodyDef bodyDef = new BodyDef();
           
    public abstract void attack();
    public abstract void receiveAttack();
    public abstract void die(); 

    //Getters & Setters
    public int getHealthPoints() {
        return healthPoints;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Texture getSprite() {
        return sprite;
    }
    public void setSprite(Texture sprite) {
        this.sprite = sprite;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    
    
    
    
}
