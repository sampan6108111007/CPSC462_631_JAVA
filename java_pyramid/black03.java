public class black03 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan < black; sampan++) {
      System.out.print(sampan + "" + (sampan + 4));
      for (int j = 1; j <= sampan + 4; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
