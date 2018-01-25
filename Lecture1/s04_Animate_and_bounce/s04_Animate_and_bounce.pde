void setup() {
  size(600,400);
  fill(255,0,0);
}

int x = 0;
int y = 0;
int speedX = 2, speedY = 0;
void draw () {
  background(0,0,255);
  rect(x,y,20,30);
  //x++; //++x; x = x+1; X+= 1;
  x += speedX;
  if (x >= 580) {
    speedX = -speedX;
  }
  if (x < 0) {
    speedX = -speedX;
  }
}