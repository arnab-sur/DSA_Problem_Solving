// Update_Bit is summation of Clear_Bit (if bit is 1, change it to 0) and Set_Bit (if bit is 0, change it to 1)

// Update the 2nd bit (positon = 1) of a number n to 1, where n = 0101 (in decimal 5)?
// For this question we proceed Set_Bit process

class Update_Bit {
  public static void main(String[] args) {
    int n = 5, newNumber = 0;  //0101
    int pos = 1;
    System.out.println("\nUpdate the bit to? (1 for Set, 0 for Clear) : ");
    int op = 1;
    int bitMask = 1 << pos;  // 0001 -> 0010

    if(op == 1) {
      //Set operation
      System.out.println("Setting " + (pos+1) + " no. bit to 1 : ");
      
      newNumber = bitMask | n;  // 0010 | 0101 = 0111 = 7
    }else{
      //Clear operation
      System.out.println("Clearing " + (pos+1) + " no. bit to 0 :");
      newNumber = (~bitMask) & n;
    }
    System.out.println("Answer is " + newNumber);
  }
}
