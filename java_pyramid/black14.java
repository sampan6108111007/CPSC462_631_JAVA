public class black14 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = sampan; j > 1; j--) {
        System.out.print(" ");
      }
      System.out.print(sampan + "" + (sampan + 1));
      for (int j = black; j > sampan; j--) {
        System.out.print("  ");
      }
      System.out.println((sampan + 1) + "" + sampan);
    }
  }
}
