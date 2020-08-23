public class black06 {

  public static void main(String den[]) {
    int black = 7;
    for (int sampan = black; sampan >= 1; sampan--) {
      for (int j = black; j > sampan; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= sampan * 2 - 1; j++) {
        System.out.print((j % 2));
      }
      System.out.println();
    }
  }
}
