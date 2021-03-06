package builder_bob_practice;

import java.util.List;

public class BuilderBob {
    private String name;
    private int id;
    private boolean busy;
    private List<BuilderTool> tools;

    @Override
    public String toString() {
        return "{name = " + name + ", id = " + id + ", busy = " + busy + ", tools quantity = " + tools.size() + "}";
    }

    public static final class Builder {
        private String name;
        private int id;
        private boolean busy;
        private List<BuilderTool> tools;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder busy(boolean busy) {
            this.busy = busy;
            return this;
        }

        public Builder tools(List<BuilderTool> tools) {
            this.tools = tools;
            return this;
        }

        public BuilderBob build() {
            BuilderBob bob = new BuilderBob();
            bob.name = this.name;
            bob.id = this.id;
            bob.busy = this.busy;
            bob.tools = this.tools;
            return bob;
        }

    }
}
