//Get the 3rd bit(position = 2) of a number n = 0101 (in decimal 5)?
// AND with bitMask and n

class Get_Bit {
  public static void main(String[] args) {
    int n = 5;  //0101
    int pos = 2;
    int bitMask = 1 << pos;  // 0001 -> 0100

    if((bitMask & n) == 0) {  // 0100 & 0101 = 0100
      System.out.println("Bit is 0");
    }else {
      System.out.println("Bit is 1");
    }
  }
}