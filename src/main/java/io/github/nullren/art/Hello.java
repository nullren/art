package io.github.nullren.art;

import processing.core.PApplet;
import processing.core.PFont;

public class Hello extends PApplet {
  public void settings() {
    printArray(PFont.list());
    size(640, 480);
  }

  public void setup() {
    PFont comicSans = createFont("ComicSansMS", 32);
    textFont(comicSans);
    fill(0);
  }

  public void draw() {
    background(204);
    text("Hello", mouseX, mouseY);
  }

  public static void main(String[] args) {
    PApplet.runSketch(new String[]{"Hello"}, new Hello());
  }
}
