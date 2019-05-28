package if_condition;

public class ExerciseWithIfCondition {
    int value = 15;

    public void process(){
        if(value > 10){
            System.out.println("The value is bigger than ten");
        } else if(value < 30){
            System.out.println("The value is bigger than 10 and less than 30");
        }
    }

}
