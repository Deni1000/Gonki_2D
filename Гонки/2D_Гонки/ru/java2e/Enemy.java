package ru.java2e;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy {
	int x;
	int y;
	int v;
	Image img = new ImageIcon("C:\\Users/User/workspace/F1/res/Lam.png").getImage();
	Road road;
	
	public Rectangle getRect()
	{
		return new Rectangle(x, y, 200, 100);
	}
	public Enemy(int x, int y, int v, Road road)
	{
		this.x = x;
		this.y = y;
		this.v = v;
		this.road = road;
		
		
	}
	public void move()
	{
		x = x - road.p.v + v; 
	}
	

}
