import java.util.Scanner;

public class Task4 {
    Scanner scanner = new Scanner(System.in);

    /**
     * Метод запрашивает у пользователя данные типа String
     * 
     * @param message Сообщение пользователю
     * @return Введенные данные
     */
    public String getUserString(String message) throws Exception {
        String userInput;
        System.out.print(message);
        userInput = scanner.nextLine();
        if (userInput.isEmpty()) {
            throw new Exception("Empty string");
        }

        return userInput;
    }
}