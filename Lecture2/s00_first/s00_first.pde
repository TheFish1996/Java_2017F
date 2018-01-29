void setup(){
  size(800,600);
}


void draw(){
/*  if (height < width){
   ellipse(width/2, height/2, height, height);
  }
 else {
   ellipse(width/2, height/2, width, width);
  }
}
 int d = Math.min(width,height);  
*/
  int d = height < width ? height : width; // d  = height if this case is true, else its width
  ellipse(width/2, height/2, d, d);
  

  }