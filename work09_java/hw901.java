import java.io.*;
public class hw901 {
  public static void main (String args[]) throws IOException {
  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); 
  String getid = stdin.readLine();
    int i = 1;
    String b;
    String[] fields;
    String patternStr = ","; // this var may be removed
    FileReader fin = new FileReader("zipcode.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      if(fields[0].equals(getid)){
     System.out.println("zip : " + fields[1]);
      System.out.println("lat : " + fields[4]);
      System.out.println("lng : " + fields[5]);
      i = i + 1;
    }
    }
    fin.close();
  }
}

