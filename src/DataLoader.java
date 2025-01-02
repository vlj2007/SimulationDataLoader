import java.util.concurrent.TimeUnit;

public class DataLoader implements Runnable{
    private String source;

    public DataLoader(String source) {
        this.source = source;
    }

    @Override
    public void run() {
        System.out.println("Начинаю загрузку данных из: " + source);
        try {
            // Симулируем время загрузки данных
            int loadTime = (int) (Math.random() * 5) + 1; // 1 до 5 секунд
            TimeUnit.SECONDS.sleep(loadTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Загрузка данных прервана!");
        }
        System.out.println("Загрузка данных из " + source + " завершена!");
    }
}
