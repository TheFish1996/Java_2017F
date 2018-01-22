void setup () {
 for (int i = 0; i < 10; i--) { // prints infinite integer because it gets infinitely smaller
   print(i);
 }
 
 for (int i =  1; i <=10; i++) // 12345678910
 print(i);
 
 
 for (int i = 1; i < 100; i = i * 2) //1,2,4,8,16,32,64
 print(i);
 
 for (int i =10; i > 0; i--) //20,18,16,14,.....
 print(i*2);
 
 
}