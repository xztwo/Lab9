import java.util.ArrayList;
import java.util.List;

@Table(title = "Eagle5678")
public class Eagle {
    private static final List<Eagle> eagleInstances = new ArrayList<>();

    public enum Types {
        КРУТОЙ, БОЛЬШОЙ, КРАСИВЫЙ, ВЕЛИКОЛЕПНЫЙ;
    }

    @Column
    private String name;

    @Column
    private float age;

    // @Column
    private Types type;

    @Column
    private int weight;

    public Eagle(String name, float age, Types type, int weight) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.weight = weight;
        eagleInstances.add(this);  // Добавляем текущий объект в список
    }

    public static List<Eagle> getAllInstances() {
        return eagleInstances;
    }
}
