public class black34 {

  public static void main(String den[]) {
    int black = 3;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = 1; j <= 6 - sampan; j++) {
        System.out.print(" ");
      }

      System.out.print(" * ");
      for (int j = 1; j <= (sampan * 2 - 1); j++) {
        System.out.print(sampan);
      }
      System.out.print(" * ");
      System.out.println();
    }

    for (int sampan = 2; sampan >= 1; sampan--) {
      for (int j = 1; j <= 6 - sampan; j++) {
        System.out.print(" ");
      }
      System.out.print(" * ");
      for (int j = 1; j <= (sampan * 2 - 1); j++) {
        System.out.print(sampan);
      }
      System.out.print(" * ");
      System.out.println();
    }
  }
}
