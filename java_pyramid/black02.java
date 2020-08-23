public class black02 {

  public static void main(String den[]) {
    int black = 4;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = sampan; j <= sampan + 2; j++) {
        System.out.print(j);
      }
      for (int j = 1; j <= sampan + 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
