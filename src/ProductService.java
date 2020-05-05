import java.util.ArrayList;

public class ProductService {

    ArrayList<Product> availableProducts = new ArrayList<>();

    public void productLoader(String code) {

        Book b = new Book();
        b.setCode(code);
        b.setAuthor("Dave W.");
        b.setPrice(59.99);
        b.setDescription("Java Programming Book");
        availableProducts.add(b);
//        System.out.println(b.toString());

        // create a book "c" with the same code, author and description
        // but different price as of "b"
        Book b1 = new Book();
        b1.setCode("Java101");
        b1.setAuthor("Dave Walsh.");
        b1.setDescription("Java Programming Book");
        b1.setPrice(45.00);

        Book bk1 = new Book();
        bk1.setCode("Java101");
        bk1.setAuthor("Dave Walsh.");
        bk1.setDescription("Java Programming Book");
        bk1.setPrice(60.00);


        // print if books "b" and "c" are taken as equal if their code, author and description are equal
        // even if their price is different
        System.out.println("==========================================");
        System.out.println("Check if book \"b1\" and \"bk1\" are equal? " + b1.equals(bk1));
        System.out.println("==========================================");

        Book b2 = new Book();
        b2.setCode("Book 0001");
        b2.setAuthor("Kathy Sierra & Bert Bates");
        b2.setPrice(23.41);
        b2.setDescription("Head First Java Programming");
        availableProducts.add(b2);
//        System.out.println(b.toString());

        Book c = new Book();
        c.setCode("Book 8910");
        c.setAuthor("Dave W.");
        c.setPrice(49.99);
        c.setDescription("Python programming book");
        availableProducts.add(c);
//        System.out.println(c.toString());

        Software s = new Software();
        s.setCode("Program1234");
        s.setDescription("Spreadsheet");
        s.setPrice(999.99);
        s.setOs("Windows");
        s.setProgrammer("Fi");
        availableProducts.add(s);
//        System.out.println(s.toString());

        Software s1 = new Software();
        s1.setCode("Program1111");
        s1.setDescription("Spreadsheet");
        s1.setPrice(555.55);
        s1.setOs("Linux");
        s1.setProgrammer("Fi");
        availableProducts.add(s1);

        // print if softwares "s" and "s1" are taken as equal if their Programmee and description are equal
        // even if their price and platform are different
        System.out.println("==========================================");
        System.out.println("Check if Softwares \"s\" and \"s1\" are equal? " + s.equals(s1));
        System.out.println("==========================================");

        Software s2 = new Software();
        s2.setCode("Program1111");
        s2.setDescription("JavaScript");
        s2.setPrice(555.55);
        s2.setOs("Linux");
        s2.setProgrammer("Fi");
        availableProducts.add(s2);
        // print if softwares "s1" and "s2" are taken as nt equal as far as both programmer and description are equal
        // every thing but their descripition is the same.
        System.out.println("******************************************");
        System.out.println("Check if Softwares \"s1\" and \"s2\" are equal? " + s1.equals(s2));
        System.out.println("******************************************");


    }
    //    public ArrayList<Product> displayAll(String str){
    public void displayAll(String str){

        productLoader(str);
        // one can not create instance of abstract class
//        Product p = new Product();
//        System.out.println("Here are all the (" + (p.getCount()-1) + ") list of products we have:");
        System.out.println("--------------------------------------------------------------");
        for(int i = 0; i < availableProducts.size(); i++){
            System.out.println(availableProducts.get(i).toString());
        }
        System.out.println("Thank you!");
        // before overridding equals method

    }

}
