package com.kxland.gfcewe;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cewe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cewe extends Actor
{
    private int nyawa = 15;
    /**
     * Act - do whatever the Cewe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cewe(){
    	setImage("girl1.png");
    }
    
    public void act() 
    {
        // Add your action code here.
        /*
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-1);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+1);
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+1,getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-1,getY());
        }*/
       if(Greenfoot.mouseDragged(this)){ 
           MouseInfo m = Greenfoot.getMouseInfo();
           int posX = m.getX();
           int posY = m.getY();
           
           setLocation(posX, posY);
        }
    }
        
    public void setNyawa(int nyawa){
        this.nyawa = nyawa;
    }
    
    public int getNyawa(){
        return this.nyawa;
    }
    
    public void kurangiNyawa(){
        this.nyawa --;
    }
}
