package creational.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .builderCPU("i3-1332")
                .builderRam("2")
                .builderScreen("3")
                .builderStorage("4")
                .buid();
        computer.print();
    }
}
