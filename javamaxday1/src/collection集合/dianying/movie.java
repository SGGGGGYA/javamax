package collection集合.dianying;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class movie {
    private String name;
    private double score;
    private String actor;
    private double price;

}
