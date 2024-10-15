import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
Gonka gonka = new Gonka();

        System.out.println("Привет! Сегодня будет проводиться гонка - 24 часа ЛеМана!");
        for (int i = 0; i < 3; i++){
            try{
                System.out.print("Введите название машины:");
                String name = scan.next();
                int speed;
                while (true){
                    try {
                        System.out.print("Введите скорость от 0 до 250 км/ч");
                        speed = scan.nextInt();
                        if (speed>=0 && speed<=250){
                            break;
                        }
                        else {
                            System.out.println("Скорость не верная, должна быть от 0 до 250, повторите ввод:");
                        }

                    } catch (Exception e) {
                        System.out.println("Неправильный формат ввода. Повторите попытку:");
                        scan.next(); // Удаляю данные чтобы не было ошибки
                    }

                }

                try{
                    gonka.searchLeader(new AutoMobile(name, speed));

                } catch (Exception e) {
                    System.out.println("Возникла ошибка при определении лидера: " + e.getMessage());
                }
            } catch (Exception e) {
                System.out.println("Возникло ошибеп во время ввода данных: " + e.getMessage());
            }

        }
        gonka.printLeader();
    }
}
