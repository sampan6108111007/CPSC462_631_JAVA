public class black15 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = sampan; j <= black; j++) {
        System.out.print(sampan);
      }
      for (int j = 1; j <= (sampan * 2 - 1); j++) {
        System.out.print(" ");
      }
      for (int j = sampan; j <= black; j++) {
        System.out.print(sampan);
      }
      System.out.println();
    }
  }
}
