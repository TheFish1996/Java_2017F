/*
  Author : Jonathan Fishkin
  Hw : 
  0. Cite my name
  1. Add bouncing in the y direction
  2. add gravity dy will increase by 1 every frame


*/



void setup () {
  size(800,600);
  
}
final int BALL_DIAM = 50;
final int BALL_RAD = BALL_DIAM/2;
int x = BALL_RAD;
int y = BALL_RAD;
int dx = 2;
void draw () {
  background(0,0,255);
  ellipse(x,y,BALL_DIAM,BALL_DIAM);
  x = x + dx; //x = x + 1; x+=1; ++x;
  if (x < BALL_RAD || x > 800 - BALL_RAD) {
    dx = -dx;
  
  }
  
}