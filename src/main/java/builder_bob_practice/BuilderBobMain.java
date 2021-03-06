package builder_bob_practice;

import java.util.ArrayList;
import java.util.List;

public class BuilderBobMain {
    public static void main(String[] args) {
        List<BuilderTool> listOfTools = new ArrayList<>();
        listOfTools.add(new BuilderTool("hammer"));
        listOfTools.add(new BuilderTool("screwdriver"));


        BuilderBob robot = new BuilderBob.Builder()
                .name("Robot Bob")
                .id(1)
                .busy(true)
                .tools(listOfTools)
                .build();

        System.out.println(robot.toString());
    }
}
