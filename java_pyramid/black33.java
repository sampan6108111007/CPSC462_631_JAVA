public class black33 {

  public static void main(String den[]) {
    int black = 4;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = sampan; j <= black + 1; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= sampan * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int sampan = 1; sampan < black; sampan++) {
      for (int j = 1; j <= sampan + 2; j++) {
        System.out.print(" ");
      }
      for (int j = sampan; j <= (black - 1) * 2 - sampan; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
