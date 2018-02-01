/********************************************************
 * Written By: William Mckeever       					*
 * Date: 1/28/2018          							*
 * Class: GameObject         							*
 *               										*
 * The Abstracr class control's all the game objects 	*
 ********************************************************/

package DungeonCrawler1;

import java.awt.Graphics;

public abstract class GameObject {
	 
	 //Object x and y coordinates
	 protected int x, y;
	 //Object ID
	 protected ID id;
	 //Objects speed / direction
	 protected int speedX, speedY;
	 
	 /**
	  * GameObject constructor
	  *
	  * @param x coordinate
	  * @param y coordinate
	  * @param id of object
	  */
	 public GameObject(int x, int y, ID id) {
		  this.x = x;
		  this.y = y;
		  this.id = id;
	 }
	 
	 public abstract void tick();
	 
	 public abstract void render(Graphics g);
	 
	 /**
	  * Set x
	  * @param x coordinate to set
	  */
	 public void setX(int x) {
		 this.x = x;
	 }
	 
	 /**
	  * Set y
	  * @param y coordinate to set
	  */
	 public void setY(int y) {
		 this.y = y;
	 }
	 
	 /**
	  * Get x
	  * @return x coordinate
	  */
	 public int getX() {
		 return x;
	 }
	 
	 /**
	  * Get y
	  * @return y coordinate
	  */
	 public int getY() {
		 return y;
	 }
	 
	 /**
	  * Set id
	  * @param id coordinate to set
	  */
	 public void setID(ID id) {
		 this.id = id;
	 }
	 
	 /**
	  * Get id
	  * @return id coordinate
	  */
	 public ID getID() {
		 return id;
	 }
	 
	 /**
	  * Set speedX
	  * @param speedX to set
	  */
	 public void setSpeedX(int speedX) {
		 this.speedX = speedX;
	 }
	 
	 /**
	  * Set speedY
	  * @param speedY to set
	  */
	 public void setSpeedY(int speedY) {
		 this.speedY = speedY;
	 }
	 
	 /**
	  * Get speedX
	  * @return speedX of object
	  */
	 public int getSpeedX() {
		 return speedX;
	 }
	 
	 /**
	  * Get speedY
	  * @return speedY of object
	  */
	 public int getSpeedY() {
		 return speedY;
	 }
}
