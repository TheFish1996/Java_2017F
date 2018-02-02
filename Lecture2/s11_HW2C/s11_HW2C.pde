float change = 0.02;
float x = 0;
float y = 0;

void curvature(float n){
 float Prev_x = -2*PI;
 float Prev_y = sin(Prev_x);
   for(x = Prev_x; x < n; x+= change){
     y = sin(x);
     line(Prev_x, Prev_y, x, y);
     Prev_x = x;
     Prev_y = y;
     
   }
  
}



void setup() {
  size(800,600);
}

void draw() {
  translate(width/2, height/2);
  scale(width/2/(2*PI), -height/(2));
  strokeWeight(0);
  curvature(2*PI);
  
}