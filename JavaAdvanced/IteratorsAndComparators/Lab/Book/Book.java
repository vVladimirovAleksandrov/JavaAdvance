package JavaAdvance.JavaAdvanced.IteratorsAndComparators.Lab.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    public String getTitle() {
        return title;
    }
    private void setTitle(String title) {
        this.title = title;
    }
    
    private int year;
    public int getYear() {
        return year;
    }
    private void setYear(int year) {
        this.year = year;
    }

    private List<String> aouthor;
    public List<String> getAouthor() {
        return aouthor;
    }
    private void setAouthor(String... aouthor) {
        this.aouthor = new ArrayList<>(Arrays.asList(aouthor));
    }

    public Book(String title, int year, String... aouthor) {
        this.setTitle(title);
        this.setYear(year);
        this.setAouthor(aouthor);
    }

    @Override
    public int compareTo(Book other) {
        int result = this.getTitle().compareTo(other.getTitle());

        if(result == 0) {
            result = Integer.compare(this.getYear(), other.getYear());
        }

        return result;
    }
}
