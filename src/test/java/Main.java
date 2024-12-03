import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Eagle eagle =
        new Eagle("Орел1", 2.54F, Eagle.Types.КРАСИВЫЙ, 17);
        new Eagle("Орел2", 2.23F, Eagle.Types.БОЛЬШОЙ, 16);
        new Eagle("Орел3", 3.75F, Eagle.Types.КРУТОЙ, 15);
        new Eagle("Орел4", 3.75F, Eagle.Types.КРУТОЙ, 15);
        new Eagle("Орел5", 3.75F, Eagle.Types.КРУТОЙ, 15);
        // Создаем таблицу один раз
        Annotation.createTable(eagle);

        // Получаем все экземпляры Eagle и вставляем их в таблицу
        List<Eagle> eagles = Eagle.getAllInstances();
        for (Eagle e : eagles) {
            Annotation.insertIntoTable(e);
        }
    }
}
