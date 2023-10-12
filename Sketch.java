import java.time.LocalDateTime;

import processing.core.PApplet;

public class Sketch extends PApplet {
  public void settings() {
    size(300, 300);
  }

  public void setup() {
    background(0, 200, 0);
    float flowerX = 15;
    float flowerY = 15;
    float petalSize = 10;
    float petalDistance = petalSize/2;
    
    boolean change1 = flowerX >= 20;
      if(change1) {
        background(230, 230, 41);
    boolean change2 = flowerX <= 20;
      if(change2) 
        background(51, 153, 255);
      }
  
    fill(255, 128,  0);
    ellipse(flowerX - petalDistance, flowerY - petalDistance,
            petalSize, petalSize);
    ellipse(flowerX + petalDistance, flowerY - petalDistance,
            petalSize, petalSize);
    ellipse(flowerX + petalDistance, flowerY + petalDistance,
            petalSize, petalSize);
    ellipse(flowerX - petalDistance, flowerY + petalDistance,
            petalSize, petalSize);
    
    fill(255, 0, 0);
    ellipse(flowerX, flowerY,
            petalSize, petalSize);

  System.out.println("The current time is " + hour() + ":" + minute());
  }
}
