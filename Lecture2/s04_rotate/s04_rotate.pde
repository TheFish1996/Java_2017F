void setup(){
 size (800,800); 
  
}
float ang = 1;
void draw(){
 background(255,0,0);
   translate(width/2, height/2);
   rotate(ang);
   line (0,0, 400,0);
   ang += 0.01;
  
}