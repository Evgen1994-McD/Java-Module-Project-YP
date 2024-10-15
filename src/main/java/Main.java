import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
Gonka gonka = new Gonka();


        System.out.println("Привет! Сегодня будет проводиться гонка - 24 часа ЛеМана!");
            for (int i = 0; i < 3; i++){
                System.out.print("Введите название машины:");
                String name = scan.next();
                int speed;
                while (true){
                    System.out.print("Введите скорость от 0 до 250 км/ч");
                    speed = scan.nextInt();
                    if (speed>=0 && speed<=250){
                        break;
                    }
                    else {
                        System.out.println("Неправильная скорость, повторите ввод:");
                    }


                }



                gonka.searchLeader(new AutoMobile(name, speed));



            }

        gonka.printLeader();






        }









        }