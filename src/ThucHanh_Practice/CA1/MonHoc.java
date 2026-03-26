package ThucHanh_Practice.CA1;

public class MonHoc {
    private String maMH;
    private String tenMH;

    public MonHoc(String maMH, String tenMH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMH='" + maMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                '}';
    }
}
