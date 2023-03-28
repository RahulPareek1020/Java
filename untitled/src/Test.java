import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int n = 4;
        int[][] mat = new int[n][n];

        //boolean x = canPlaceAQueen(2,2, n, mat);
        int count = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(canPlaceAQueen(i, j, i, j, n, mat)) {
                    mat[i][j] = 1;
                    count++;
                    break;
                }
            }
        }


        ArrayList<String> input = new ArrayList<>() {
              {
                  add(0,"abc");
                  add(1,"def");
                  add(2,"ghi");
              }
        };


        Character[] currentList = new Character[input.size()];
        letterPhone(0, input.size(), currentList , input);
        String[] g = new String[3];
        generateNumber(3, 0, g);

        String s = "[])";
        Validate(s);
        int[] A = {0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,-3,0,2,0,0,0,0,0,0,0,0,0,0,0,-3,
                0,0,0,0,0,0,0,0,0,0,1,0,0,0,-2,3,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,-3,0,0,0,0,0,0,0,0,-2,0,0,0,0,0,2,0,-2,0,0,0,0,0,0,-2,0,0,0,0,0,-2,0,0,
                -2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,3,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,
                0,0,0,0,0,-3,0,0,0,0,0,0,-3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0
                ,0,0,0,0,0,0,0,-2,0,0,3,0,-1,0,0,2,0,-2,0,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,-3,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,0,3,0,0,0,0,0,1,0,0,0
                ,0,0,1,-1,3,0,0,0,0,0,0,0,0,0,0,-3,0,0,0,0,-3,0,-2,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,1,0,2,0,3,0,0,0,0,0,0,0,0,0,2,0,-3,3,3,0,0,0
                ,0,0,0,2,0,0,0,0,0,0,0,-3,0,0,0,-3,0,0,-3,0,0,0,0,0,0,0,-1,0,0,0,0,-1,0,0,0,0,0,0,0,0,0};
        int aLen = A.length;
        int[] dp = new int[aLen];


        dp[0] = A[0] > 0 ? A[0] : 0;

        int maxAns = dp[0];

        for(int i = 1; i < aLen; i++) {
            dp[i] = (dp[i - 1] == 0 ? 1 : dp[i - 1]) * A[i];
            maxAns = Math.max(maxAns, dp[i]);
        }

        for(int i = 0; i < aLen; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.print(" maxAns " +maxAns);
    }


    static boolean canPlaceAQueen(int x, int y, int i, int j, int N, int[][] mat) {

        if(i < 0 || j < 0 || i > N || j > N) {
            return true;
        }

        if(mat[i][j] == 1) {
            return false;
        }
int p = x, q = y;
        boolean e = canPlaceAQueen(x, y,p - 1, q - 1, N, mat);
        boolean f = canPlaceAQueen(x, y, p - 1, y, N, mat);
        boolean g = canPlaceAQueen(x, y,x - 1, y + 1, N, mat);
        boolean k = canPlaceAQueen(x, y, x, y - 1, N, mat);

        return e && f && g && k;
    }

    static void letterPhone(int index, int n, Character[] currList, ArrayList<String> input) {
        if(index == n) {
            System.out.println(Arrays.toString(currList));
            return;
        }

        String s = input.get(index);

        for(int i = 0; i < s.length(); i++) {
            currList[index] = s.charAt(i);
            letterPhone(index + 1, n, currList, input);
        }
    }

    static void generateNumber(int n, int index, String[] currList) {
        //currList = new ArrayList();
        if(n == index) {
            for (String d : currList){
                System.out.print(d + " ");
            }
            System.out.println();
            return;
        }

        currList[index] = "1";
        generateNumber(n, index + 1, currList);

        currList[index] = "2";
        generateNumber(n,  index + 1, currList);
    }

    static boolean Validate(String s) {

        char openRound = '(', closeRound = ')', openSquare = '[', closeSquare = ']', openCurly = '{', closeCurly = '}';
        Stack<Character> stack = new Stack();
        boolean ans = true;

        for(int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(currChar == openRound || currChar == openSquare || currChar == openCurly)  {
                stack.push(currChar);
            }
            else{
                char top = stack.peek();
                if(currChar == closeCurly && top == openCurly) {
                    stack.pop();
                }
                else if(currChar == closeRound && top == openRound) {
                    stack.pop();
                }
                else if(currChar ==  closeSquare && top == openSquare) {
                    stack.pop();
                }
                else {
                   return false;

                }
            }
        }
        return true;
    }
}
