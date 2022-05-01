import processing.core.PApplet;
import processing.core.PImage;  

/**
 * Description: A drawing program that demonstrates various user input capabilities in processing
 * @author: B. Chan
 */

public class Sketch extends PApplet {
	// Declare global variables
	PImage imgOverworld;
  PImage imgNether;
  PImage imgSteve;

  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  float SteveX = 0;
  float SteveY = 300;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(900, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Assign images to global image variables
    imgOverworld = loadImage("mc overworld.png");
    imgOverworld.resize(900, 500);

    imgNether = loadImage("mc nether.png");
    imgNether.resize(900, 500);

    imgSteve = loadImage("STEVE.png");
    imgSteve.resize(96, 200);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  image(imgOverworld, 0, 0);

    if (keyPressed) {
      if (key == 'n') {
        image(imgNether, 0, 0);
      } 
    }
    
    image(imgSteve, SteveX, SteveY);
    if (upPressed) {
      SteveY--;
    }
    if (downPressed) {
      SteveY++;
    }
    if (leftPressed) {
      SteveX--;
    }
    if (rightPressed) {
      SteveX++;
    }
  }
  
  // define other methods down here.
  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }
  
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }
}