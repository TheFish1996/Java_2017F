void setup(){
  size(800,800);  
}

final int N = 8;
int dx;
void draw(){
  dx = width / N;
  for (int y = 0; y < height; y+= dx)
  for (int x = 0; x < width; x+= dx){
    fill((x+y) / 100 % 2 == 0 ? 0: 255);
    rect(x,y,dx,dx);
  }
}

void mousePressed(){
  float move = dx / 2;
  println(mouseX, mouseY);
  fill(255,0,0);
  translate(move,move);
  ellipse(mouseX/dx*dx, mouseY/dx*dx, dx, dx);
 
  
  
}