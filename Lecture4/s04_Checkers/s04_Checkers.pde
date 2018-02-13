void setup () {
 size (800,800);
  
  
}
int N = 8;
int incr;
checker first = new checker(0,0);
board board = new board (0,0);
void draw () {
  incr = width / N;
  background (255);
  board.drawing();
  first.drawing();
  
/*  if (mousePressed){
    fill(255,0,0);
    ellipse(mouseX, mouseY, 50, 50);
  }

*/  }
  
   

class checker {
  float x, y;
  
   checker (float a, float b){
    x = a;
    y = b; 
   }
   
   void drawing () {
  
   translate(50,50);
    for (float x = 0; x <= width; x += incr){
     fill(255,0,0);
     ellipse(x,y,incr,incr);
     ellipse(x,height-incr,incr,incr);
     ellipse(x,y+incr,incr,incr);
     ellipse(x,height-200,incr,incr);
    }
 }
   
}

class board {
 
  float x ,y;
  
  board (float a, float b) {

   x = a;
   y = b;
    
  }
    
  void drawing () {
    for (int x = 0; x < width; x += incr)
    for (int y = 0; y < height; y += incr){
      fill((x+y) / 100 % 2 == 0 ? 0 : 255);
      rect(x,y,incr,incr);
    }
    
  }
    
    
 
} 