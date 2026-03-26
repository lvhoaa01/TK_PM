package ThucHanh_Practice.A2;

public class MyStringBuilder {
    private String str;
    public MyStringBuilder(){
        this.str = "";
    }

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public MyStringBuilder addString(String s){
        this.str += s;
        return this;
    }

    public MyStringBuilder addFloat(float f){
        this.str += f;
        return this;
    }

    public MyStringBuilder addBool(boolean b){
        this.str += b;
        return this;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "str='" + str + '\'' +
                '}';
    }
}
