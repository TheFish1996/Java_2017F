/*
 
  Author : Jonathan Fishkin 
  Cite : Suhail Mansuri

*/

PShape earth;   // creates a object
PShape moon;
void setup(){
  size(800,800,P3D);

  noStroke();
  sphereDetail(1000);
  PImage img = loadImage("earth.jpg");
  PImage img1 = loadImage("moon.jpg");
  moon = createShape(SPHERE, 100);
  earth  = createShape(SPHERE, 300); // diameter = 600
  earth.setTexture(img);  // sets the image shape
  moon.setTexture(img1);
}
float a = 0;
final float DEG2RAD = PI / 180; // degree to radians
void draw(){
//  translate(width/2, height/2, -500);
//  earth.rotateY(0.01);
  background(0);
  pushMatrix();
  translate(width/2, height/2, -1800);
  rotateZ(23.5 * DEG2RAD); // rotate the earth by 23.5 degrees
  rotateY(a);
  shape(earth);
  popMatrix();
  
  pushMatrix(); 
  translate(width/2, height/2, -1800); 
  rotateZ(5.6 * DEG2RAD); 
  rotateY(a / 28.5);
  translate(0, 0, 600); // 600 x 4 = 2400, 4 diameters away
  shape(moon);
  popMatrix();
    
  a += 0.2;
}