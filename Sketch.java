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
    imgPig.resize(350, 275);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Display Minecraft background when the user presses "o", otherwise display black
    background(0);
    if (keyPressed){
      if (key == 'o') {
        image(imgOverworld, 0, 0);
      }
    }

    // Minecraft Torch cursor when the user presses the mouse button
    if (mousePressed) {
      image(imgTorch, mouseX - 45, mouseY);
    }
    // Minecraft Block cursor
    else if (mousePressed == false){
      image(imgBlock, mouseX - 55, mouseY);
    }
    
    // Minecraft Steve that moves according to the user pressing the arrow keys
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
  
  /**
   * Displays an image of a minecraft pig whenever the mouse is clicked (pressed and released)
   */
  public void mouseClicked() {
    image(imgPig, 150, 100);
  }

  /**
   * Changes the background to an image of the Nether when the user scrolls with the mouse wheel
   */
  public void mouseWheel() {
    image(imgNether, 0, 0);
  }

  /**
   * Changes Steve's X and Y coordinates when user presses/holds the arrows keys
   */
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
  
  /**
   * Stops Steve's X and Y coordinates changing when the user releases the arrows keys
   */
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