package creational.builder;

public class Computer {
    public String ram, cpu, storage, screen;
    public Computer(Builder builder){
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.storage = builder.storage;
        this.screen = builder.screen;
    }
    public void print(){
        System.out.println(this.cpu + " " + this.ram + " " + this.storage + " " + this.storage);
    }
    public static class Builder{
        public String ram = "", cpu = "", storage = "", screen = "";
        public Builder builderRam(String ram){
            this.ram = ram;
            return this;
        }
        public Builder builderCPU(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder builderStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder builderScreen(String screen){
            this.screen = screen;
            return this;
        }

        public Computer buid(){
            return new Computer(this);
        }
    }
}
