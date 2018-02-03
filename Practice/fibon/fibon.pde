int fib(int n){
 if (n <= 1)
  return n;   
 return fib(n-2) + fib(n-1);
  
}


void setup(){
  
println(fib(5));  
exit();

int num = 0;
int num2 = 1;

for(int x = 0; x < 5; x++){
int fibon = num + num2; // 1, 2, 3, 5
    num = num2; // 1, 1, 2, 3
    num2 = fibon; // 1, 2, 3, 5
 
  println(num+"");
  
}

  
}