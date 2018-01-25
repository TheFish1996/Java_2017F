void setup() {
 // <  >  <= >= == !=
 int sum = 0;
 for (int i = 1; i <= 10; i++){
 sum = sum + i;
 }
 println(sum);
 
 int prod = 1;
 for (int i = 1; i <= 5; i++){
   prod = prod * i;
   println(i, prod);
 }
 println(prod);
 
 
 exit();
}