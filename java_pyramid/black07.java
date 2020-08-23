public class black07 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = 1; j <= black - sampan; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= sampan; j++) {
        System.out.print(j);
      }
      System.out.print(sampan);
      for (int j = sampan; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
