public class IfElseIfExample {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) {
            System.out.println("Excellent! You got an A.");
        } else if (score >= 80) {
            System.out.println("Good job! You got a B.");
        } else if (score >= 70) {
            System.out.println("Not bad. You got a C.");
        } else if (score >= 60) {
            System.out.println("You passed with a D.");
        } else {
            System.out.println("You failed. Better luck next time.");
        }
    }
}
