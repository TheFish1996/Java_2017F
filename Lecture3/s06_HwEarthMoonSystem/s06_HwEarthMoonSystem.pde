//session 3
PShape earth;   // creates a object
PShape moon;
void setup(){
  size(800,800,P3D);
// frameRate(1); slow down the action for debugging
  noStroke();
  sphereDetail(1000);
  PImage img = loadImage("earth.jpg");
  PImage img1 = loadImage("moon.jpg");
  moon = createShape(SPHERE, 135);
  earth  = createShape(SPHERE, 300);
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
  translate(width/2, height/2, -300);
  rotateZ(23.5 * DEG2RAD); // rotate the earth by 23.5 degrees
  rotateY(a);
  shape(earth);
  popMatrix();
  
  pushMatrix(); 
 
  translate(width/2, height/2, -300);
  rotateZ(5.6 * DEG2RAD); 
  rotateY(a / 28.5);
  translate(0, 0, -500);
  shape(moon);
  popMatrix();
  
  a += 0.3;
}