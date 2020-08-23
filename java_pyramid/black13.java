public class black13 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = 1; j < sampan * 2 - 1; j++) {
        System.out.print(" ");
      }
      for (int j = black * 2 - (sampan * 2 - 1); j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
