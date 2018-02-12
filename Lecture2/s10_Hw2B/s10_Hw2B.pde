/*


Author: Jonathan Fishkin
Cite: Suhail Mansuri
Note: The reverse sum is more accurate




*/
float sum1(float n){ //forward sum
  float sum = 0;
  for (float i = 1; i <= n; i++){
      float eq = i * i; 
      sum = sum + 1/eq;
//      println(i,sum);
  }
   return sqrt(6*sum);
}

float sum2(float n){ //reverse sum
  float sum = 0;
  for(float i = n; i > 0; i--){
    float eq = i * i;
    sum = sum + 1/eq;
    
  }
  
  return sqrt(6*sum);
}




void setup(){
  println(sum1(1));
  println(sum1(10));
  println(sum1(100));
  println(sum1(1000));
  println(sum1(10000));
  println(sum1(100000));
  
  println();
  
  println(sum2(1));
  println(sum2(10));
  println(sum2(100));
  println(sum2(1000));
  println(sum2(10000));
  println(sum2(100000));
  
  
  exit();
}