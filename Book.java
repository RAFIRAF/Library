import java.util.Date;

/**
 * Created by Rafal on 02017-05-27.
 */
public class Book {
    public static int ids;
    private final int id;
    private String title;
    private String publisher;
    private String count;
    private Date releaseDate;
    public Book(){
        this.id = ids++;
    }
}
