package patterns.singleton;

public class TestSingleton {

    // Приватная статическая переменная для хранения единственного экземпляра
    private static TestSingleton instance;

    // Приватный конструктор, чтобы предотвратить создание объекта извне
    private TestSingleton() {
    }

    // Публичный статический метод для получения единственного экземпляра
    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }
}