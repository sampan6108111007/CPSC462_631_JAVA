public class black21 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = 0; j <= ((black * 2) - (sampan + 3)); j++) {
        System.out.print("*");
      }
      System.out.print(sampan);
      for (int j = sampan; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.println((black * 2) - (sampan + 2));
    }
  }
}
