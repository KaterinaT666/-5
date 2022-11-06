public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println(" Задание 1 ");
        int clientOS = 0;
        int clientAd = 1;
        if ( 0 != 1 ){
        System.out.println(" Установите версию приложения для iOS по ссылке ");
        if (1 != 0) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }
        // Задание 2
            System.out.println(" Задание 2 " );
        int clientDeviceYear =2015;
                    int earOfReleaseClientOS = 2013;
            int earOfReleaseClientAd = 2018;
                    if ( earOfReleaseClientOS < clientDeviceYear ) {
                        System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
                    }else {
                        System.out.println(" Установите версию приложения для iOS по ссылке ");
                    }if ( earOfReleaseClientAd < clientDeviceYear ) {
                            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
                        }else {
                System.out.println("Установите версию приложения для Android по ссылке ");
                    }
                    // Задание 3
                        System.out.println(" Задание 3 " );
                    int year = 2021;
                    if ( (  year % 400 == 0) ||(( year % 4 == 0) && ( year % 100 != 0 ))) {
                            System.out.println( year + " год является високосным ");
                    }else{
                        System.out.println( year + " год не является високосным");
                    }
            // Задание 4
            System.out.println(" Задание 4 " );
                    int deliveryDistance = 95;
                    if ( deliveryDistance <= 20)
                        System.out.println(" Потребуется 1 день ");
            if ( (deliveryDistance > 20) && ( deliveryDistance <= 60))
                System.out.println(" Потребуется 2 дня ");
            if (( deliveryDistance >= 60) && (deliveryDistance <= 100))
                System.out.println(" Потребуется 3 дня ");
            // Задание 5
            System.out.println(" Задание 5 " );
            int monthNumber = 7 ;

            switch (monthNumber) {
                case 1:
                    System.out.println(" Январь ");
                    break;
                case 2:
                    System.out.println(" Февраль ");
                    break;
                case 3:
                    System.out.println(" Март ");
                    break;
                case 4:
                    System.out.println(" Апрель ");
                    break;
                case 5:
                    System.out.println(" Май ");
                    break;
                case 6:
                    System.out.println(" Июнь ");
                    break;
                case 7:
                    System.out.println(" Июль ");
                    break;
                case 8:
                    System.out.println(" Август ");
                    break;
                case 9:
                    System.out.println(" Сентябрь ");
                    break;
                case 10:
                    System.out.println(" Октябрь ");
                    break;
                case 11:
                    System.out.println(" Ноябрь");
                    break;
                case 12:
                    System.out.println(" Декабрь ");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
            {int season = monthNumber;
                    switch (season) {
                        case 12:
                        case 1:
                        case 2:
                            System.out.println( season + " Зима");
                            break;
                        case 3:
                        case 4:
                        case 5:
                            System.out.println("Весна");
                            break;
                        case 6:
                        case 7:
                        case 8:
                            System.out.println("Лето");
                            break;
                        case 9:
                        case 10:
                        case 11:
                            System.out.println("Осень");
                            break;
                        default:
                            System.out.println("Такого месяца не существует");
                    }
            }
        }
    }
}