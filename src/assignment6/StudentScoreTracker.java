package assignment6;

import java.util.*;

public class StudentScoreTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: number of elements
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        // Input: scores into an array
        int[] scores = new int[n];
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        // Convert array to ArrayList
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int score : scores) {
            scoreList.add(score);
        }
        
        // Output: Display elements inside ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }
        
        sc.close();
    }
}
