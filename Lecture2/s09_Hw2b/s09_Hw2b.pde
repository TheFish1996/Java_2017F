/*
  Author: Jonathan Fishkin
  Cite: https://forum.processing.org/two/discussion/6165/the-koch-snowflake
  I had lots of trouble figuring this pattern out so i used the code provided on this forum
  
*/

float sixtyDegrees;
 
void setup() {
  size(600, 600);
  sixtyDegrees = PI/3.0;
  noLoop();
}
 
void draw() {
  background(255);
   
  float[] x = new float[3];
  float[] y = new float[3];
  for (int i = 0; i < 3; i++) {
    x[i] = width/2+cos(sixtyDegrees*i*2.0)*200.0;
    y[i] = height/2+sin(sixtyDegrees*i*2.0)*200.0;
  }
 
  Segment[] snowflake = new Segment[3];
  for (int i = 0; i < 3; i++) {
    float ang = sixtyDegrees*i*2.0+sixtyDegrees*2.5;
    snowflake[i] = new Segment(ang, x[i], y[i], x[(i+1)%3], y[(i+1)%3]);
  }
 
  for (int i = 0; i < 3; i++) {
    snowflake[i].subdivision();
    for (int j = 0; j < 4; j++) {
      snowflake[i].subd[j].subdivision();
      for (int k = 0; k < 4; k++) {
        snowflake[i].subd[j].subd[k].subdivision();
        for (int l = 0; l < 4; l++) {
          snowflake[i].subd[j].subd[k].subd[l].subdivision();
          for (int m = 0; m < 4; m++)
            snowflake[i].subd[j].subd[k].subd[l].subd[m].subdivision();
        }
      }
    }
  }
 
  for (int i = 0; i < 3; i++) {
    //line(x[i], y[i], x[(i+1)%3], y[(i+1)%3]);
    //snowflake[i].display();
    for (int j = 0; j < 4; j++) {
      //snowflake[i].subd[j].display();
      for (int k = 0; k < 4; k++) {
        //snowflake[i].subd[j].subd[k].display();
        for (int l = 0; l < 4; l++) {
          //snowflake[i].subd[j].subd[k].subd[l].display();
          for (int m = 0; m < 4; m++)
            snowflake[i].subd[j].subd[k].subd[l].subd[m].display();
        }
      }
    }
  }
}
 
class Segment {
  float ang, x1, x2, y1, y2;
  Segment[] subd = new Segment[4];
 
  Segment(float inAng, float inX1, float inY1, float inX2, float inY2) {
    ang = inAng;
    x1 = inX1;
    y1 = inY1;
    x2 = inX2;
    y2 = inY2;
  }
 
  void drawSegment() {
    line(x1, y1, x2, y2);
  }
 
  void subdivision() {
    float deltaX = (x2-x1)/3.0;
    float deltaY = (y2-y1)/3.0;
    float dist = sqrt(deltaX*deltaX+deltaY*deltaY);
 
    // Calculate the new points once
    // Imagine that they look like this:
    // .................
    // ....... 3 .......
    // ...... / \ ......
    // 1 --- 2   4 --- 5
    // .................
 
    float newX1 = x1;
    float newY1 = y1;
    float newX2 = newX1+deltaX;
    float newY2 = newY1+deltaY;
    float newX3 = newX2+cos(ang-sixtyDegrees)*dist;
    float newY3 = newY2+sin(ang-sixtyDegrees)*dist;
    float newX4 = newX2+deltaX;
    float newY4 = newY2+deltaY;
    float newX5 = newX4+deltaX;
    float newY5 = newY4+deltaY;
 
    subd[0] = new Segment(ang, newX1, newY1, newX2, newY2);
    subd[1] = new Segment(ang-sixtyDegrees, newX2, newY2, newX3, newY3);
    subd[2] = new Segment(ang+sixtyDegrees, newX3, newY3, newX4, newY4);
    subd[3] = new Segment(ang, newX4, newY4, newX5, newY5);
  }
 
  void display() {
    for (int i = 0; i < 4; i++) subd[i].drawSegment();
  }
}