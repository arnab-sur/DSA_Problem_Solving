// Clear the 3rd bit (position = 2) of a nuumber n = 0101 (in decimal 5)
// AND with NOT of bitMask and n
// ~ is used to get NOT of a binary number

class Clear_Bit {
  public static void main(String[] args) {
    int n = 5;  //0101
    int pos = 2;
    int bitMask = 1 << pos;  // 0001 -> 0100

    int newNumber = (~bitMask) & n;
    System.out.println(newNumber);
  }
}