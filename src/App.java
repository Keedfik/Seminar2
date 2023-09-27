public class App {
    public static void main(String[] args) throws Exception {

                System.out.println("\nTask 1.\n");
                Task1 task1 = new Task1();
                System.out.println("Метод getUserNumber вернул число: " + task1.getUserNumber("Введите число типа float: "));
        
                System.out.println("\nTask 2.\n");
                Task2 task2 = new Task2();
                int[] intArray1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                int[] intArray2 = { 0, 1, 2, 3 };
                task2.run(intArray1);
                task2.run(intArray2);
        
                System.out.println("\nTask 3.\n");
                Task3 task3 = new Task3();
                task3.run();
        

                System.out.println("\nTask 4.\n");
                Task4 task4 = new Task4();
                System.out.println(
                        "Метод getUserString вернул строку: \"" + task4.getUserString("Введите данные типа String: ") + "\"");
        
    }
}
