package BackTracking;

import java.util.ArrayList;

public class SubSets {
    //static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    static ArrayList<int[]> ans = new ArrayList<>();
    public static void main(String[] args) {
        String s="hello";
        System.out.println(s.substring(0,0));
        System.out.println(s.substring(0,1));

        int[] arr = {1, 2, 3};
        ArrayList<Integer> currentList = new ArrayList<>(3);
        currentList.add(0);
        currentList.add(0);
        currentList.add(0);
        //int[] currentList = new int[arr.length];
        findSubSets(arr.length - 1, arr, currentList);
        //findSubSets(arr.length - 1, arr, currentList);
    }

static void findSubSets (int index, int[] arr, ArrayList<Integer> currentList) {
//static void findSubSets (int index, int[] arr, int[] currentList) {
        //base case
        if(index < 0) {
            //ans.add((ArrayList<Integer>) currentList.clone());
            //ans.add((int[]) currentList.clone());
            for(int n : currentList) {
                if(n != 0) {
                    System.out.print(n + " ");
                }
            }
            return;
        }

        //main logic
        //int n = ;
        /*currentList.add(arr[index]);
        findSubSets(index - 1, arr, currentList);
        currentList.remove(arr[index]);*/
        currentList.set(index, arr[index]);
        findSubSets(index - 1, arr, currentList);
        currentList.remove(index);
    }
}
