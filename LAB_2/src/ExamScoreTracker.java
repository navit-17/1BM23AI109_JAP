import java.util.Scanner;
public class ExamScoreTracker {
    public static void main(String[] args){
        final int NUM_STUDENTS = 5;
        int[] examScores = new int[NUM_STUDENTS];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < NUM_STUDENTS; i++){
            System.out.println("Enter marks for Student " + (i+1) + " ");
            examScores[i] = sc.nextInt();
        }
        int sum = 0;
        int highest_score = examScores[0];
        for(int score: examScores){
            sum += score;
            if(score > highest_score) {
                highest_score = score;
            }
        }
        System.out.println("The average marks of " + (NUM_STUDENTS) + " Students is: "+ sum/NUM_STUDENTS);
        System.out.println("The highest score is " + highest_score);
    }
}
