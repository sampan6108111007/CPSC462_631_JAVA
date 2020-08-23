public class black01 {

  public static void main(String den[]) {
    int black = 4;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = 2; j <= sampan; j++) {
        System.out.print(" ");
      }

      System.out.print(sampan + "" + sampan);

      for (int j = black; j >= (sampan + 1); j--) {
        System.out.print("**");
      }
      System.out.println(sampan + "" + sampan);
    }
  }
}
