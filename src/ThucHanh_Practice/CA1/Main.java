package ThucHanh_Practice.CA1;

public class Main {
    public static void main(String[] args) {
        DataAccess dataAccess = DataAccess.getInstance();

        Client clientWeb = new Client("WebBro");
        Client clientMob = new Client("Mobile");

        dataAccess.getStream().addListener(clientWeb);
        dataAccess.getStream().addListener(clientMob);

        System.out.println("Thêm môn lập trình JV:");
        dataAccess.addMonHoc(new MonHoc("IT01", "Lập trình JV"));
        System.out.println("Cập nhật");
        dataAccess.updateMonHoc(0, new MonHoc("IT02", "Lập trình C#"));
        System.out.println("Thêm môn CSDL");
        dataAccess.addMonHoc(new MonHoc("IT03", "Cơ sở dữ liệu"));
        System.out.println("Xóa môn đầu tiên:");
        dataAccess.deleteMonHoc(0);
    }
}
