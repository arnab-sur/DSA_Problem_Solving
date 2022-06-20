//Print the sum of first n natural numbers.

class Sum_of_first_n_natural_numbers {
  public static void printSum(int n, int sum) {
    if(n == 0) {
      System.out.println(sum);
      return;
    }
    sum += n;
    printSum(n-1, sum);
  }
  
  public static void main(String[] args) {
    int n = 5, sum = 0;
    printSum(n, sum);
  }
}