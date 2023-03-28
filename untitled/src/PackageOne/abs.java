package PackageOne;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Uncomment below classes to send network request if needed.
// import java.net.HttpURLConnection;
// import java.net.URL;

class Main {
    public static void main(String args[] ) throws Exception {
        String inputData = "";
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            inputData += thisLine + "\n";
        }
        // Output the solution to the console
        System.out.println(codeHere(inputData));
    }
    public static String codeHere(String inputData) {
        // Use this function to write your solution;
        HashSet<String> set = new HashSet();


        return inputData;
    }
}
