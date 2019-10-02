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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuilderTool that = (BuilderTool) o;
        return getTool().equals(that.getTool());
    }
}
