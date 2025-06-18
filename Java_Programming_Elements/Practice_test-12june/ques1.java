
public class ques1 {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int distributed = pens/students;
        int non_distributed = pens%students;

        System.out.println("The Pen Per Student is " + distributed + " and the remaining pen not distributed is " + non_distributed);
    }
}
