package day30_inheritance.practiceTasks.bookTask;

public class TestBookObjects {

    public static void main(String[] args) {


        EBook eBook = new EBook("The Lord Of Ring","Action","J.K",15.50,"Ebook-ebup",1500);

        eBook.readBook();

        System.out.println(eBook);

        System.out.println("--------------------------------");

        AudioBook audioBook = new AudioBook("The Lord of ring", "Adventure","J.K",25.50,59.45,"Josh");

        System.out.println(audioBook);



    }

}
