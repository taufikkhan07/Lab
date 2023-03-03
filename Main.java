package March_02_Lab;
import java.util.*;
class Library{
    int bookId;
    String bookName;
    String bookAuthor;
    Library(){
        }
    ArrayList<ArrayList> books=new ArrayList<>();
    public  void addBook(int bookId,String bookName,String bookAuthor){
        ArrayList<String> book=new ArrayList<>(
                              Arrays.asList(bookId+"",bookName,bookAuthor));
        books.add(book);
    }
    public  void dispanceBook(){
        for(int i=0;i<books.size();i++)
        System.out.println(books.get(i).toString());
    }
}
class Main{
    public static void main(String[] args){
        Library obj=new Library();
        obj.addBook(1,"Coding","Ankit");
        obj.addBook(2,"Coding2","Taufik");
        obj.dispanceBook();
        }
}
