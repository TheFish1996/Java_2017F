void setup () {
  
  float f = 1.5; // processing is messing with java here!!
  // float f = 1.5f;
  
  double pi = 3.14159265; //processing will truncate
  
  float a = 1.0 + 2.5; // 3.5 +, -, *, / work, bt approximately
  
  float b = 2.5 + 1.0; // commutative property holds
  
  //associativity DOES NOT hold
  // a + b + c != a + (b + c)
  
  /*
  
  1.23
   .008
   .007
   ======
   1.23
   
   */
   
  for (float bob = 0.0f; bob <= 10; bob += 0.1f)
   print(bob, "");
  println();
  
  float x = 0;
  for (int i = 0; i < 101; x+= 0.1f)
  println(x);
  
  exit();
  
}