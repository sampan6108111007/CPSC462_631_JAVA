public class black22 {

  public static void main(String den[]) {
    int black = 5;
    for (int sampan = 1; sampan <= black; sampan++) {
      System.out.print("*");
      for (int j = 1; j < sampan; j++) {
        System.out.print(" ");
      }
      for (int j = sampan; j <= black * 2 - sampan; j++) {
        System.out.print(sampan);
      }
      for (int j = sampan; j > 1; j--) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
