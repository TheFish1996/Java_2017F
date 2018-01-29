// f(x) = x*x
int f(int x){ 
  return x*x; 
}
float hypotenuse(float a, float b){
  return  sqrt(a*a + b*b); 
}
double factorial(int n){
 double x = 1;
 for (int i = n; i >= 1; i--)
   x *= i; //x = x * i
 return x;
}


void setup(){
  println(f(3));
  for (int i = 0; i < 5; i++)
    print(f(i)); // 014916
   println();
  
 float c = hypotenuse(3.0, 4.0); // 5.0  sqrt()
 double f = factorial(5); //5*4*3*2*1 = 120.0
 print(f);
 //factorial(50) can only do with larger numbers
}