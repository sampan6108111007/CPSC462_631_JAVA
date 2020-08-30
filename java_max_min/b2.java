public class b2 {

  public static void main(String args[]) {
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    double d = 0.1234;

    b = (byte) (b * 2);
    int a = c;
    b = (byte) s;
    long l = i;
    float f = l;
    double result = (f * b) + (i / c) - (d * s);

    System.out.println("boolean value = " + String.valueOf(true));
    System.out.println("byte value = " + b);
    System.out.println("char value = " + a);
    System.out.println("short value = " + s);
    System.out.println("Int value " + i);
    System.out.println("Long value " + l);
    System.out.println("Float value " + f);
    System.out.println("double value = " + result);
  }
}
