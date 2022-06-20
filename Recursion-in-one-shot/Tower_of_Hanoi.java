class Tower_of_Hanoi {
  public static void hanoi(int n, String s, String h, String d) {
    if(n==1) {
      System.out.println("Tranfering Disk "+ n + " from "+ s + " to " + d);
      return;
    }

    hanoi(n-1, s, d, h); //transfering n-1 disk from source to helper first
    System.out.println("Trnasfering Disk "+ n + " from "+ s + " to " + d);
    hanoi(n-1, h, s, d); //using helper as source tower and vice-versa
  }

  public static void main (String[] args) {
    int n = 3;
    hanoi(n, "Source Tower", "Helper Tower", "Destination Tower");
  }
}