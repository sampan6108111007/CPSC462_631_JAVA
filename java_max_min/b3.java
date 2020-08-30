public class b3 {

  public static void main(String args[]) {
    int max = 0;
    int min = 999;
    int total = 0;
    double average;
    for (int i = 0; i < args.length; i++) {
      if (Integer.parseInt(args[i]) > max) {
        max = Integer.parseInt(args[i]);
      }

      if (Integer.parseInt(args[i]) < min) {
        min = Integer.parseInt(args[i]);
      }
      total += Integer.parseInt(args[i]);
    }
    average = total / args.length;
    System.out.println("max=" + max);
    System.out.println("min=" + min);
    System.out.println("total=" + total);
    System.out.println("average=" + average);
  }
}
