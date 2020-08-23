public class black32 {

  public static void main(String den[]) {
    int black = 3;
    for (int sampan = 1; sampan <= black * 2 - 1; sampan++) {
      for (int j = 1; j <= (black * 2 - sampan + 2); j++) {
        System.out.print(j);
      }
      for (int j = black; j <= black + sampan + 1; j++) {
        System.out.print("*");
      }
      System.out.println(black - (black - 2) + sampan);
    }
  }
}
