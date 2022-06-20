//Print x^n (with stack height = logn)

class X_to_the_power_N_2 {
  public static int power(int x, int n) {
    if(x == 0)
      return 0;
    if(n == 0)
      return 1;
    // check if n is even or odd
    if(n%2 == 0)
      return power(x, n/2)*power(x, n/2);
    else
      return power(x, n/2)*power(x, n/2)*x;
  }
  
  public static void main(String[] args) {
    int x=2, n=5;
    int res = power(x, n);
    System.out.println(res);
  }
}