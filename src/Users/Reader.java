package Users;

import BookClasses.Book;
import Management.MemberRecord;

import java.util.ArrayList;

public class Reader extends Person {

    private ArrayList<Book> books;
    private MemberRecord record;

    public Reader(String name) {
        super(name);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public MemberRecord getRecord() {
        return record;
    }

    public void borrow_book() {}
    public void return_book() {}
    public void show_book() {}

    @Override
    public String whoYouAre() {
        return super.whoYouAre();
    }

    @Override
    public String toString() {
        return "Reader{" +
                "books=" + books +
                ", record=" + record +
                '}';
    }
}
