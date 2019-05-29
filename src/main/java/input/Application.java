package input;

public class Application {
    public static void main(String[] args) {
        Input input = new Input();
        input.inputString();
        input.inputInt();

        Alibaba alibaba = new Alibaba();
        alibaba.findTreasury();
    }
}
