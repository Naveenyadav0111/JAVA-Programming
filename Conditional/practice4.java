package Conditional;

// nested if-else
public class practice4 {
    
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 40) {

            if (marks >= 60) {
                System.out.println("First Division");
            }
            else {
                System.out.println("Second Division");
            }

        }
        else {
            System.out.println("Fail");
        }
    }
}
    

