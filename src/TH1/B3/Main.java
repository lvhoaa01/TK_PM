package TH1.B3;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("D:", "12/03/26");

        Folder s1 = new Folder("Design Pattern", "12/03/26");
        Folder s2 = new Folder("Lap Trinh Java", "12/03/26");
        FileItem s3 = new FileItem("NgonNguLapTrinhC.pdf", "12/03/26");
        Folder s4 = new Folder("LapTrinhThietBiDiDong", "12/03/26");

        //Folder1
        FileItem a1 = new FileItem("CreationalPattern.pptx", "12/03/26");
        FileItem a2 = new FileItem("StructuralPattern.pptx", "12/03/26");

        //Folder2
        FileItem b1 = new FileItem("LapTrinhJavaCoBan.docx", "12/03/26");
        FileItem b2 = new FileItem("LapTrinhJavaNangCao.pdf", "12/03/26");

        //Folder4
        FileItem d1 = new FileItem("CoBan.pptx", "12/03/26");
        FileItem d2 = new FileItem("NangCao.pptx", "12/03/26");

        root.addItem(s1);
        root.addItem(s2);
        root.addItem(s3);
        root.addItem(s4);

        s1.addItem(a1);
        s1.addItem(a2);

        s2.addItem(b1);
        s2.addItem(b2);

        s4.addItem(d1);
        s4.addItem(d2);

        System.out.println(d2.getPath());
    }
}
