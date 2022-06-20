//Set the 2nd bit(position = 1) of a number n = 0101 (in decimal 5)?
// OR with bitMask and n

class Set_Bit {
  public static void main(String[] args) {
    int n = 5;  //0101
    int pos = 1;
    int bitMask = 1 << pos;  // 0001 -> 0010

    int newNumber = bitMask | n;  // 0010 | 0101 = 0111 = 7
    System.out.println(newNumber);
  }
}