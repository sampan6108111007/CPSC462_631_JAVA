public class black29 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      System.out.print(sampan + "*" + (sampan + 2));
      for (int j = 1; j <= sampan + 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
