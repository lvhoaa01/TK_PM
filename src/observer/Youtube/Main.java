package observer.Youtube;

public class Main {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();

        Subcriber n1 = new Subcriber("Audi");
        Subcriber n2 = new Subcriber("Keller");

        youtube.attach(n1);
        youtube.attach(n2);

        youtube.uploadVideo("Fine-tuning && RAG");
    }
}
