import java.util.Arrays;

public class Main_2 {
    public static void main(String[] args) {
        double[] result = StepEquation.solve(3, 5, 7);
        double[] result1 = StepEquation.solve(1, -4, 4);
        double[] result2 = StepEquation.solve(1, -49, -50);

        System.out.println("Phương trình có nghiệm là: " + Arrays.toString(result));
        System.out.println("Phương trình có nghiệm là: " + Arrays.toString(result1));
        System.out.println("Phương trình có nghiệm là: " + Arrays.toString(result2));
    }
}
