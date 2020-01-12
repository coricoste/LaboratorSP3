import pack.Author;
import pack.Book;
import pack.Element;
import pack.Image;
import pack.ImageProxy;
import pack.Paragraph;
import pack.Section;
import pack.Table;

public class Main {

    public static void main(String[] args) {
        Book Carte1 = new Book("Carte1");
        Section capitol1 = new Section("Capitol1");
        capitol1.add(new Paragraph("text1"));
        capitol1.add(new Paragraph("text2"));
        capitol1.add(new Image("Image1"));
        capitol1.add(new ImageProxy("image1.jpg"));
        capitol1.add(new ImageProxy("image2.jpg"));
        Carte1.add(capitol1);
        Carte1.add(new Paragraph("paragraf1"));
        Carte1.print();
    }
}
