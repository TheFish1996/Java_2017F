void setup(){
size(800,800);

}
final int N = 8;
int Z = 0;

void draw(){
background(255,255,255);
int y = 0;
int x = 0;
Z = 800 / N;
while (x < width){
  line(x,0,x,height);
  line(0,y,width,y);
  x = x + Z;
  y = y + Z;
}



  
}