package if_condition;

public class LoopWhileWithIf {
    int value = 0;

    public void simpleLoop(){
        while(true){
            System.out.println("Value is " + value);

            if(value==15){
                System.out.println("End of the loop");
                break;
            }
            value++;

            System.out.println("loop is running");
        }
    }
}
