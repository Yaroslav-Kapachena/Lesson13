import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int number = scanner.nextInt();

        try{
            if(number<18){
                throw new Exception("Your age is to small");
            }
        }catch (Exception ex){
            ex.getMessage();
            System.out.println(ex.getMessage());
        }

    }
}
