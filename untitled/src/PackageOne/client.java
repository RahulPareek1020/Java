package PackageOne;

//private Date dob;
//public String Name;
  //      String univName;
//protected double score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class client {
    public static void main(String[] args) throws IOException {

        String inputData = "";
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            inputData += thisLine + "\n";
        }

        HashSet<String> set = new HashSet();


        int n = 2;
        String s = "-+*++-*++-";
        for(int i = 0; i < s.length();) {
            if(i + n <= s.length() ) {
                String x = s.substring(i, i + n);
                i += n;

                set.add(x);
            }
        }
        for(String d : set) {
            System.out.print(d + " ");
        }
        System.out.println(set);

        Student sach = new Student();
        sach.score = 100;
        sach.Name ="sach";
        sach.univName = "Topper";
    }
}
