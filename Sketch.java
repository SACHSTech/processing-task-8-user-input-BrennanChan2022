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
  PImage imgBlock;
  PImage imgTorch;
  PImage imgPig;

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

    imgBlock = loadImage("block.png");
    imgBlock.resize(110, 110);

    imgTorch = loadImage("torch.png");
    imgTorch.resize(100, 100);

    imgPig = loadImage("pig.png");
    imgPig.resize(200, 200);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(0);
    if (keyPressed){
      if (key == 'o') {
        image(imgOverworld, 0, 0);
      }
    }

    if (mousePressed) {
      image(imgTorch, mouseX - 45, mouseY);
    }
    else if (mousePressed == false){
      image(imgBlock, mouseX - 55, mouseY);
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
  public void mouseClicked() {
    image(imgPig, 150, 100);
  }

  public void mouseWheel() {
    image(imgNether, 0, 0);
  }

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