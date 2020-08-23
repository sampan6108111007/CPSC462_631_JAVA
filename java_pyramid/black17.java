public class black17 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = 1; j <= black - 1; j++) {
        System.out.print(sampan + "" + (black * 2 - sampan));
      }
      System.out.println();
    }
  }
}
