//recursive function need 2 things.
// 1. Function must call itself
// 2. It must end somehow (termination condition)

/*
5! = 5 * 4!
4! = 4 * 3!
3! = 3 * 2!
2! = 2 * 1!
1! = 1 * 0! = 1 x 1 = 1

*/

double factorial(int n) { // n! = n * (n-1) * (n-2) * .... 1
// n! = n * (n-1)!
  if ( n < 1)
      return 1;
   return n * factorial(n-1);
   
}


// write recursively
//double count(int n) {
  
  
  
//}


void setup (){

println(factorial(5));


}