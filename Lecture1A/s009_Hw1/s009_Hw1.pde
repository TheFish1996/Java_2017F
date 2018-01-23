/*
  Author: Jonathan Fishkin
  Cite: Worked with Omar Elshayeb

*/

void setup() {
  size(800,800);
}
final int BALL_DIAM = 50;
final int BALL_RAD = BALL_DIAM/2;
int x = BALL_RAD;
int y = BALL_RAD;
int dx = 0;
int dy = 0;
int MOVE_X = 3;
int MOVE_Y = 3;
void draw(){
  background(255,255,255);
  ellipse(x,y,BALL_DIAM,BALL_DIAM);
  fill(0,255,0);
  
   if (y <= BALL_RAD){
   dy = 0;
   dx = MOVE_X;
   x = x + dx;
  }
    
  if (x >= width - BALL_RAD){
    dx = 0;
    dy = MOVE_Y;
    y = y + dy;
  }
  
  if ( y >= height - BALL_RAD) { 
      dy = 0;
      dx = MOVE_X;
      x = x - dx;  
    }
    
  if (x <= BALL_RAD){
    dx = 0;
    dy = MOVE_Y;
    y = y - dy;
 }
 

 
   
    

  
  
 
}