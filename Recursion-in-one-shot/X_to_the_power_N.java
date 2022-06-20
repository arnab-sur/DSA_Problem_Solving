//Print x^n (with stack height = n)

class X_to_the_power_N {
  public static int power(int x, int n) {
    if(x == 0)
      return 0;
    if(n == 0)
      return 1;
    
    int pow = power(x, n-1);
    int ans = x*pow;
    return ans;
  }
  
  public static void main(String[] args) {
    int x=2, n=4;
    int res = power(x, n);
    System.out.println(res);
  }
}