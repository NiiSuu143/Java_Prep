import java.util.*;
import java.util.Arrays;

public class Activity_Seleciton {
    public static void main(String[] args) {    // O(n)
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // if there is given an unsorted end time then
        // difinitely need sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++) {
            activities[i][0] = i;   // store index
            activities[i][1] = start[i];    // store start time
            activities[i][2] = end[i];  // store end time
        }
        
        // lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];   // store 1st activity ending time

        for(int i=1; i<end.length; i++) {
            if(activities[i][1] >= lastEnd) {   // if it is true then they are non-overlapping activity
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum activity = "+maxAct);
        for(int i=0; i<ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
