public class black36 {

  public static void main(String den[]) {
    int black = 3;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = sampan; j <= black; j++) {
        System.out.print(j);
      }
      for (int j = 1; j <= sampan * 2 - 1; j++) {
        System.out.print("*");
      }
      for (int j = black; j >= sampan; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
    for (int sampan = black - 1; sampan >= 1; sampan--) {
      for (int j = sampan; j <= black; j++) {
        System.out.print(j);
      }
      for (int j = 1; j <= sampan * 2 - 1; j++) {
        System.out.print("*");
      }
      for (int j = black; j >= sampan; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
