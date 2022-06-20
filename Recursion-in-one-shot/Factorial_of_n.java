//Print factorial of a number n.

class Factorial_of_n {
  public static void Factorial(int n, int fact) {
    if(n==0) {
      System.out.println(fact);
      return;
    }
    fact *= n;
    Factorial(n-1, fact);
  }
  
  public static void main (String[] args) {
    int n  = 5, fact = 1;
    Factorial(n, fact);
  }
}