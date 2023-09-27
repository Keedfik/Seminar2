import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    Scanner scanner = new Scanner(System.in);

    /**
     * Запрашивает у пользователя число типа float
     * 
     * @param message Сообщение пользователю
     * @return Введенное число
     */
    public float getUserNumber(String message) {
        float userInput = 0;
        boolean flag = true;
        do {
            try {
                System.out.print(message);
                userInput = scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Error");
            }
        } while (flag);

        return userInput;
    }

}
