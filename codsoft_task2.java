
import java.util.*;
public class codsoft_task2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number of subjects");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter subject"+" "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
          sum=sum+arr[i];
        }
        double avg = ((double)sum / n);
avg=(int)avg;
        String grade="";
        if (avg >= 80 && avg <= 100) {
            grade = "A";
        } else if (avg >= 60 && avg < 80) {
            grade = "B";
        } else if (avg >= 30 && avg < 60) {
            grade = "C";
        } else if (avg >= 0 && avg < 30) {
            grade = "F";
        } else {
            grade = "Invalid"; // Handles any unexpected values (e.g., negative or > 100)
        }
    System.out.println("The total marks obtained in all the subjects is "+sum);
    System.out.println(("The average percentage is "+avg+"%"));
    System.out.println("You have got "+grade+" grade");
sc.close();
    }
}

