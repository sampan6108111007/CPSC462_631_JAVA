public class black05 {

  public static void main(String den[]) {
    int black = 4;
    for (int sampan = 1; sampan <= black; sampan++) {
      for (int j = black - 1; j >= sampan; j--) {
        System.out.print(" ");
      }
      System.out.print(sampan);
      for (int j = 1; j < sampan; j++) {
        System.out.print("**");
      }
      System.out.println(sampan);
    }
    for (int sampan = 1; sampan < black; sampan++) {
      for (int j = 1; j <= sampan; j++) {
        System.out.print(" ");
      }
      System.out.print(black - sampan);
      for (int j = black - 1; j > sampan; j--) {
        System.out.print("**");
      }
      System.out.println(black - sampan);
    }
  }
}
