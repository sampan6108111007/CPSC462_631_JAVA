import java.io.*;
public class hw902 {
  public static void main (String args[]) throws IOException {
  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); 
  String getzip = stdin.readLine();
    int i = 1;
    String b;
    String[] fields;
    String patternStr = ","; // this var may be removed
    FileReader fin = new FileReader("zipcode.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      if(fields[1].equals(getzip)){
      System.out.println("lat : " + fields[4]);
      System.out.println("lng : " + fields[5]);
      i = i + 1;
    }
    }
    fin.close();
  }
}

