int increment = 0;

void Koch(int increment, float size){
  if (increment == 0){
   line(0,height/2,size,height/2);
   }
}
  Koch(increment - 1, size / 3);
  
void setup(){
  size(900,900);
}



void draw(){
  Koch(increment, width);
  
  
  
}