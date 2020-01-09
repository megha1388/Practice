import com.excercise.second.SecondClass;
import com.excersise.first.FirstClass;

public class Exercise {

    public static void main(String[] args) {
        System.out.println("Java");
        Exercise exercise = new Exercise();
        exercise.mine("Program");
        exercise.yours("level");

        //Using FirstClass
        FirstClass addition = new FirstClass();
        addition.add();
        addition.add(10, 3);
        int result = addition.addReturn(20, 5);
        System.out.println(result);

        //Using Second Class
        SecondClass subtraction = new SecondClass();
        subtraction.sub(10, 5);
        result = subtraction.subReturn(30, 10);
        System.out.println(result);

        subtraction.sub(20, 30);
        subtraction.sub(10, 10);

    }

    public void yours(String param) {
        System.out.println("java method " + param);
    }

    public void mine(String arg) {
        System.out.println("Megha First " + arg);
    }


}
