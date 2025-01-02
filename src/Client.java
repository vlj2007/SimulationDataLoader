public class Client {
    public static void main(String[] args) {
        // Создаем массив источников данных
        String[] dataSources = {"Источник 1", "Источник 2", "Источник 3", "Источник 4", "Источник 5"};

        // Запускаем загрузку данных из каждого источника в отдельном потоке
        for (String source : dataSources) {
            Thread loaderThread = new Thread(new DataLoader(source));
            loaderThread.start();
        }

        // Ждем завершения всех потоков (можно реализовать более сложное ожидание)
        try {
            Thread.sleep(10000); // Ждем 10 секунд, чтобы дать время потокам на завершение
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Все загрузки данных завершены.");
    }
}
