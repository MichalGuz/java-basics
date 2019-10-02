package builder_bob_practice;

public class BuilderTool {
    private String tool;

    public BuilderTool(String tool){
        this.tool = tool;
    }

    public String getTool(){
        return tool;
    }

    @Override
    public String toString(){
        return "{ builder_bob_practice.BuilderTool = " + tool + "\'" + "}";
    }
}
