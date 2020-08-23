public class black11 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = black; j > sampan; j--) {
        System.out.print(" ");
      }
      System.out.print(sampan);
      for (int j = 1; j < sampan; j++) {
        System.out.print(" ");
      }
      System.out.println(sampan);
    }
  }
}
