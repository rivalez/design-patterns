import Creational.Builder.ItemDTO;
import Creational.Builder.Size;

/**
 * Created by marek on 27.06.2017.
 */
public class Application {

    public static void main(String[] args) {
        ItemDTO exampleItemDTO = new ItemDTO.Builder()
                .withName("Gold")
                .withColor("Golden")
                .withAmount(100)
                .withSize(Size.BIG)
                .build();
    }
}
