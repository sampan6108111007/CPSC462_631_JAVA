public class black08 {

  public static void main(String den[]) {
    int black = 7;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = 1; j < sampan; j++) {
        System.out.print(" ");
      }
      System.out.print(sampan + "" + (sampan + 1) + "" + (sampan + 2));
      for (int j = 0; j <= sampan; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
