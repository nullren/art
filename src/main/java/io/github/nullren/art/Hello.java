package io.github.nullren.art;

import processing.core.PApplet;
import processing.core.PFont;

public class Hello extends PApplet {
  public void settings() {
//    printArray(PFont.list());
    size(600, 600, P3D);
  }

  public void setup() {
//    PFont comicSans = createFont("ComicSansMS", 32);
//    textFont(comicSans);
    noStroke();
  }

  public void draw() {
    lights();
    background(0);
    // go to "middle" of scene
    translate(width/2, height/2, -height);
    // rotate due to mouse position
    float rz = map(mouseY, 0, height, 0, PI);
    float ry = map(mouseX, 0, width, 0, HALF_PI);
    rotateZ(rz);
    rotateY(ry);
    // add points
    for (int y = -1; y <= 1; y++) {
      for (int x = -1; x <= 1; x++) {
        for (int z = -1; z <= 1; z++) {
          pushMatrix();
          translate(300*x, 300*y, -300*z);
          box(60);
          popMatrix();
        }
      }
    }
  }

  public static void main(String[] args) {
    PApplet.runSketch(new String[]{"Hello"}, new Hello());
  }
}
