//Print the fibonacci sequence till n th term.

class Fibonacci_till_n {
  public static void fib(int i, int j, int n) {
    if(n==0)
      return;
    
    System.out.print(i + " ");
    fib(j, i+j, n-1);
  }
  
  public static void main (String[] args) {
    int n=7, i=0, j=1;
    fib(i, j, n);
  }
}