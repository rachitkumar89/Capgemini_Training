package dependencyInje;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class Library1 {
    private  int id;
    private String name;
    private List<Book> books;

}
