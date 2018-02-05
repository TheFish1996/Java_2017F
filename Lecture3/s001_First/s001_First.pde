//session 3
PShape earth;   // creates a object

void setup(){
  size(800,800,P3D);
// frameRate(1); slow down the action for debugging
  noStroke();
  sphereDetail(1000);
  PImage img = loadImage("earth.jpg");
  earth  = createShape(SPHERE, 500);
  earth.setTexture(img);  // sets the image shape
  
}
float a = 0;
final float DEG2RAD = PI / 180; // degree to radians
void draw(){
  translate(width/2, height/2, -500);
//  earth.rotateY(0.01);
  pushMatrix();
  rotateZ(23.5 * DEG2RAD); // rotate the moon by 23.5 degrees
  rotateY(a);
  shape(earth);
  popMatrix();
  
  // do the moon here
  a += 0.01;
}