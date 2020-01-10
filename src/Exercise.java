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
        addition.add(30, 50);
        addition.add(10, 3);
        int result = addition.addReturn(20, 5);
        System.out.println(result);
        FirstClass multiplication = new FirstClass();
        multiplication.multiply(2, 5);


        //Using Second Class
        SecondClass subtraction = new SecondClass();
        subtraction.sub(10, 5);
        result = subtraction.subReturn(30, 10);
        System.out.println(result);

        subtraction.sub(20, 30);
        subtraction.sub(10, 10);

        SecondClass division = new SecondClass();
        result = division.divides(8, 2);
        System.out.println(result);
    }

    public void yours(String param) {
        System.out.println("java method " + param);
    }

    public void mine(String arg) {
        System.out.println("Megha First " + arg);
    }


}
