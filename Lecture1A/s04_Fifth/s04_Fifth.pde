void setup () {
// int x = 3;
// println( x + 3 / 2 * 3);

  int x = 0;
  while (x < 10) {
   print(x, "");
   x = x + 1;  // stops it from going infinite
    
  }
  
  for (int y = 0; y < 10; y = y + 1) {   // same as while loop, initial value, initial condition, and output
   print(y, ""); 
  }
  println("\n\n\n");
  
  
  
 exit(); 
}