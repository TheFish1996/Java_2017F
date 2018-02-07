/*

  Author : Jonathan Fishkin
  
*/


void setup(){
 size(750,750); 
  
}
double increment = 75;
void draw(){
  float x1 = 0;
  float x2 = 0;
  float y1 = 0;
  float y2 = 0;
  
  for (float x = 0; x < width; x += increment){
        x1 = x;
 
    for (float y = 0; y < height; y += increment){

        y2 = y;
     line(x1,y1,x2,y2); 
    }
    
  }
  
  
  
}