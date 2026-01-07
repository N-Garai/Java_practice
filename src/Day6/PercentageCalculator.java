//package Day6;
/*Create an abstract class Marks with abstract method getPercentage().
 Create class StudentA (3 subjects, each out of 100) and class StudentB (4 subjects, each out of 100). 
 It extend Marks and calculate their respective percentages.
 */
abstract class Marks{
    float total_mark;
    abstract float getPercentage(float total_mark);
}
class StudentA extends Marks{
    @Override
    float getPercentage(float total_mark) {
        return (total_mark/300)*100;
    }
}
class StudentB extends Marks{
    @Override
    float getPercentage(float total_mark) {
        return (total_mark/400)*100;
    }
}
public class PercentageCalculator {
    public static void main(String[] args) {
        StudentA studentA = new StudentA();
        float percentageA = studentA.getPercentage(250); // Example total marks for Student A
        System.out.println("Percentage of Student A: " + percentageA + "%");

        StudentB studentB = new StudentB();
        float percentageB = studentB.getPercentage(320); // Example total marks for Student B
        System.out.println("Percentage of Student B: " + percentageB + "%");
    }
}
