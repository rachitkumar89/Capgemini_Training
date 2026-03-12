package dependencyInje;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Library {
    private int id;
    private String name;
    private Book book;
}
