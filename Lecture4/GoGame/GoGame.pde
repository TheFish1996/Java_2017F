/*
   Author : Jonathan Fishkin
   Cite : Suhail Mansuri


*/


void setup(){
 size(900,900); 


}
final int N = 9;
int[][] p = new int[8][8];
int dx;
boolean turn = false;
void draw(){
  background(0);
  dx =  width/N;
  for(int y = 0; y < height; y+= dx)
  for(int x = 0; x < width; x += dx)  
  {
   fill(139,69,19);
   rect(x,y,dx,dx); 
  }
  for(int i = 0; i < N-1; i++)
    for(int j = 0; j < N-1; j++)
      
      if(p[i][j] == 1){ 
        fill(255,255,255);
        ellipse((i*100)+100,(j*100)+100,dx,dx);
          
      }
      else if(p[i][j] == 2){
          fill(0,0,0);
          ellipse((i*100)+100,(j*100)+100,dx,dx);
      }
}


void mousePressed(){
  println(mouseX,mouseY);
  tilespace(mouseX,mouseY);
  turn = !turn;
}

void tilespace(int x, int y){
  if(turn){
      if(x >= 50 && x < 150 && y >= 50 && y < 150)
        p[0][0] = 1;
      else if(x >= 150 && x < 250 && y >= 50 && y < 150)
        p[1][0] = 1;
      else if(x >= 250 && x < 350 && y >= 50 && y < 150)
        p[2][0] = 1;
      else if(x >= 350 && x < 450 && y >= 50 && y < 150)
        p[3][0] = 1;
      else if(x >= 450 && x < 550 && y >= 50 && y < 150)
        p[4][0] = 1;
      else if(x >= 550 && x < 650 && y >= 50 && y < 150)
        p[5][0] = 1;
      else if(x >= 650 && x < 750 && y >= 50 && y < 150)
        p[6][0] = 1;
      else if(x >= 750 && x < 850 && y >= 50 && y < 150)
        p[7][0] = 1;
        
      else if(x >= 50 && x < 150 && y >= 150 && y < 250)
        p[0][1] = 1;
      else if(x >= 150 && x < 250 && y >= 150 && y < 250)
        p[1][1] = 1;
      else if(x >= 250 && x < 350 && y >= 150 && y < 250)
        p[2][1] = 1;
      else if(x >= 350 && x < 450 && y >= 150 && y < 250)
        p[3][1] = 1;
      else if(x >= 450 && x < 550 && y >= 150 && y < 250)
        p[4][1] = 1;
      else if(x >= 550 && x < 650 && y >= 150 && y < 250)
        p[5][1] = 1;
      else if(x >= 650 && x < 750 && y >= 150 && y < 250)
        p[6][1] = 1;
      else if(x >= 750 && x < 850 && y >= 150 && y < 250)
        p[7][1] = 1;

      else if(x >= 50 && x < 150 && y >= 250 && y < 350)
        p[0][2] = 1;
      else if(x >= 150 && x < 250 && y >= 250 && y < 350)
        p[1][2] = 1;
      else if(x >= 250 && x < 350 && y >= 250 && y < 350)
        p[2][2] = 1;
      else if(x >= 350 && x < 450 && y >= 250 && y < 350)
        p[3][2] = 1;
      else if(x >= 450 && x < 550 && y >= 250 && y < 350)
        p[4][2] = 1;
      else if(x >= 550 && x < 650 && y >= 250 && y < 350)
        p[5][2] = 1;
      else if(x >= 650 && x < 750 && y >= 250 && y < 350)
        p[6][2] = 1;
      else if(x >= 750 && x < 850 && y >= 250 && y < 350)
        p[7][2] = 1;
    
      else if(x >= 50 && x < 150 && y >= 350 && y < 450)
        p[0][3] = 1;
      else if(x >= 150 && x < 250 && y >= 350 && y < 450)
        p[1][3] = 1;
      else if(x >= 250 && x < 350 && y >= 350 && y < 450)
        p[2][3] = 1;
      else if(x >= 350 && x < 450 && y >= 350 && y < 450)
        p[3][3] = 1;
      else if(x >= 450 && x < 550 && y >= 350 && y < 450)
        p[4][3] = 1;
      else if(x >= 550 && x < 650 && y >= 350 && y < 450)
        p[5][3] = 1;
      else if(x >= 650 && x < 750 && y >= 350 && y < 450)
        p[6][3] = 1;
      else if(x >= 750 && x < 850 && y >= 350 && y < 450)
        p[7][3] = 1;
       
      else if(x >= 50 && x < 150 && y >= 450 && y < 550)
        p[0][4] = 1;
      else if(x >= 150 && x < 250 && y >= 450 && y < 550)
        p[1][4] = 1;
      else if(x >= 250 && x < 350 && y >= 450 && y < 550)
        p[2][4] = 1;
      else if(x >= 350 && x < 450 && y >= 450 && y < 550)
        p[3][4] = 1;
      else if(x >= 450 && x < 550 && y >= 450 && y < 550)
        p[4][4] = 1;
      else if(x >= 550 && x < 650 && y >= 450 && y < 550)
        p[5][4] = 1;
      else if(x >= 650 && x < 750 && y >= 450 && y < 550)
        p[6][4] = 1;
      else if(x >= 750 && x < 850 && y >= 450 && y < 550)
        p[7][4] = 1;       
       
      else if(x >= 50 && x < 150 && y >= 550 && y < 650)
        p[0][5] = 1;
      else if(x >= 150 && x < 250 && y >= 550 && y < 650)
        p[1][5] = 1;
      else if(x >= 250 && x < 350 && y >= 550 && y < 650)
        p[2][5] = 1;
      else if(x >= 350 && x < 450 && y >= 550 && y < 650)
        p[3][5] = 1;
      else if(x >= 450 && x < 550 && y >= 550 && y < 650)
        p[4][5] = 1;
      else if(x >= 550 && x < 650 && y >= 550 && y < 650)
        p[5][5] = 1;
      else if(x >= 650 && x < 750 && y >= 550 && y < 650)
        p[6][5] = 1;
      else if(x >= 750 && x < 850 && y >= 550 && y < 650)
        p[7][5] = 1;   
        
      else if(x >= 50 && x < 150 && y >= 650 && y < 750)
        p[0][6] = 1;
      else if(x >= 150 && x < 250 && y >= 650 && y < 750)
        p[1][6] = 1;
      else if(x >= 250 && x < 350 && y >= 650 && y < 750)
        p[2][6] = 1;
      else if(x >= 350 && x < 450 && y >= 650 && y < 750)
        p[3][6] = 1;
      else if(x >= 450 && x < 550 && y >= 650 && y < 750)
        p[4][6] = 1;
      else if(x >= 550 && x < 650 && y >= 650 && y < 750)
        p[5][6] = 1;
      else if(x >= 650 && x < 750 && y >= 650 && y < 750)
        p[6][6] = 1;
      else if(x >= 750 && x < 850 && y >= 650 && y < 750)
        p[7][6] = 1;   
        
      else if(x >= 50 && x < 150 && y >= 750 && y < 850)
        p[0][7] = 1;
      else if(x >= 150 && x < 250 && y >= 750 && y < 850)
        p[1][7] = 1;
      else if(x >= 250 && x < 350 && y >= 750 && y < 850)
        p[2][7] = 1;
      else if(x >= 350 && x < 450 && y >= 750 && y < 850)
        p[3][7] = 1;
      else if(x >= 450 && x < 550 && y >= 750 && y < 850)
        p[4][7] = 1;
      else if(x >= 550 && x < 650 && y >= 750 && y < 850)
        p[5][7] = 1;
      else if(x >= 650 && x < 750 && y >= 750 && y < 850)
        p[6][7] = 1;
      else if(x >= 750 && x < 850 && y >= 750 && y < 850)
        p[7][7] = 1;   
       
  }
  else{
      if(x >= 50 && x < 150 && y >= 50 && y < 150)
        p[0][0] = 2;
      else if(x >= 150 && x < 250 && y >= 50 && y < 150)
        p[1][0] = 2;
      else if(x >= 250 && x < 350 && y >= 50 && y < 150)
        p[2][0] = 2;
      else if(x >= 350 && x < 450 && y >= 50 && y < 150)
        p[3][0] = 2;
      else if(x >= 450 && x < 550 && y >= 50 && y < 150)
        p[4][0] = 2;
      else if(x >= 550 && x < 650 && y >= 50 && y < 150)
        p[5][0] = 2;
      else if(x >= 650 && x < 750 && y >= 50 && y < 150)
        p[6][0] = 2;
      else if(x >= 750 && x < 850 && y >= 50 && y < 150)
        p[7][0] = 2;
        
      else if(x >= 50 && x < 150 && y >= 150 && y < 250)
        p[0][1] = 2;
      else if(x >= 150 && x < 250 && y >= 150 && y < 250)
        p[1][1] = 2;
      else if(x >= 250 && x < 350 && y >= 150 && y < 250)
        p[2][1] = 2;
      else if(x >= 350 && x < 450 && y >= 150 && y < 250)
        p[3][1] = 2;
      else if(x >= 450 && x < 550 && y >= 150 && y < 250)
        p[4][1] = 2;
      else if(x >= 550 && x < 650 && y >= 150 && y < 250)
        p[5][1] = 2;
      else if(x >= 650 && x < 750 && y >= 150 && y < 250)
        p[6][1] = 2;
      else if(x >= 750 && x < 850 && y >= 150 && y < 250)
        p[7][1] = 2;

      else if(x >= 50 && x < 150 && y >= 250 && y < 350)
        p[0][2] = 2;
      else if(x >= 150 && x < 250 && y >= 250 && y < 350)
        p[1][2] = 2;
      else if(x >= 250 && x < 350 && y >= 250 && y < 350)
        p[2][2] = 2;
      else if(x >= 350 && x < 450 && y >= 250 && y < 350)
        p[3][2] = 2;
      else if(x >= 450 && x < 550 && y >= 250 && y < 350)
        p[4][2] = 2;
      else if(x >= 550 && x < 650 && y >= 250 && y < 350)
        p[5][2] = 2;
      else if(x >= 650 && x < 750 && y >= 250 && y < 350)
        p[6][2] = 2;
      else if(x >= 750 && x < 850 && y >= 250 && y < 350)
        p[7][2] = 2;
   
      else if(x >= 50 && x < 150 && y >= 350 && y < 450)
        p[0][3] = 2;
      else if(x >= 150 && x < 250 && y >= 350 && y < 450)
        p[1][3] = 2;
      else if(x >= 250 && x < 350 && y >= 350 && y < 450)
        p[2][3] = 2;
      else if(x >= 350 && x < 450 && y >= 350 && y < 450)
        p[3][3] = 2;
      else if(x >= 450 && x < 550 && y >= 350 && y < 450)
        p[4][3] = 2;
      else if(x >= 550 && x < 650 && y >= 350 && y < 450)
        p[5][3] = 2;
      else if(x >= 650 && x < 750 && y >= 350 && y < 450)
        p[6][3] = 2;
      else if(x >= 750 && x < 850 && y >= 350 && y < 450)
        p[7][3] = 2;
      
      else if(x >= 50 && x < 150 && y >= 450 && y < 550)
        p[0][4] = 2;
      else if(x >= 150 && x < 250 && y >= 450 && y < 550)
        p[1][4] = 2;
      else if(x >= 250 && x < 350 && y >= 450 && y < 550)
        p[2][4] = 2;
      else if(x >= 350 && x < 450 && y >= 450 && y < 550)
        p[3][4] = 2;
      else if(x >= 450 && x < 550 && y >= 450 && y < 550)
        p[4][4] = 2;
      else if(x >= 550 && x < 650 && y >= 450 && y < 550)
        p[5][4] = 2;
      else if(x >= 650 && x < 750 && y >= 450 && y < 550)
        p[6][4] = 2;
      else if(x >= 750 && x < 850 && y >= 450 && y < 550)
        p[7][4] = 2;       
     
      else if(x >= 50 && x < 150 && y >= 550 && y < 650)
        p[0][5] = 2;
      else if(x >= 150 && x < 250 && y >= 550 && y < 650)
        p[1][5] = 2;
      else if(x >= 250 && x < 350 && y >= 550 && y < 650)
        p[2][5] = 2;
      else if(x >= 350 && x < 450 && y >= 550 && y < 650)
        p[3][5] = 2;
      else if(x >= 450 && x < 550 && y >= 550 && y < 650)
        p[4][5] = 2;
      else if(x >= 550 && x < 650 && y >= 550 && y < 650)
        p[5][5] = 2;
      else if(x >= 650 && x < 750 && y >= 550 && y < 650)
        p[6][5] = 2;
      else if(x >= 750 && x < 850 && y >= 550 && y < 650)
        p[7][5] = 2;   
        
      else if(x >= 50 && x < 150 && y >= 650 && y < 750)
        p[0][6] = 2;
      else if(x >= 150 && x < 250 && y >= 650 && y < 750)
        p[1][6] = 2;
      else if(x >= 250 && x < 350 && y >= 650 && y < 750)
        p[2][6] = 2;
      else if(x >= 350 && x < 450 && y >= 650 && y < 750)
        p[3][6] = 2;
      else if(x >= 450 && x < 550 && y >= 650 && y < 750)
        p[4][6] = 2;
      else if(x >= 550 && x < 650 && y >= 650 && y < 750)
        p[5][6] = 2;
      else if(x >= 650 && x < 750 && y >= 650 && y < 750)
        p[6][6] = 2;
      else if(x >= 750 && x < 850 && y >= 650 && y < 750)
        p[7][6] = 2;   
        
      else if(x >= 50 && x < 150 && y >= 750 && y < 850)
        p[0][7] = 2;
      else if(x >= 150 && x < 250 && y >= 750 && y < 850)
        p[1][7] = 2;
      else if(x >= 250 && x < 350 && y >= 750 && y < 850)
        p[2][7] = 2;
      else if(x >= 350 && x < 450 && y >= 750 && y < 850)
        p[3][7] = 2;
      else if(x >= 450 && x < 550 && y >= 750 && y < 850)
        p[4][7] = 2;
      else if(x >= 550 && x < 650 && y >= 750 && y < 850)
        p[5][7] = 2;
      else if(x >= 650 && x < 750 && y >= 750 && y < 850)
        p[6][7] = 2;
      else if(x >= 750 && x < 850 && y >= 750 && y < 850)
        p[7][7] = 2;   
  }
}