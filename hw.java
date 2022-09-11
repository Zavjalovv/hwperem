public class hw {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else if (age < 18) {
            System.out.println("Нужно еще подождать");

        }
        //hw 2
        int age1 = 23;
        if (age1 <= 7) {
            System.out.println("Вы не ходите в школу");
        } else if (age1 > 7 && age1 <= 18) {
            System.out.println(" Вы ходите в школу");
        } else if (age1 > 18 && age1 < 24) {
            System.out.println(" Вы ходите в институт");

        } else if (age1 >= 24) {
            System.out.println("Вам пора на работу");
        }

        //ex 3
        int vagonMax = 102;
        int seat = 60;
        System.out.println(vagonMax - seat);

     //ex 4
        int age4 = 5;
        if (age4 == 2 && age4 <=6) {
            System.out.println("Вы ходите в детский сад");
        } else if (age4 ==7 && age4 <= 18) {
            System.out.println("Вам нужно идти в школу");
        } else if (age4 > 18 && age4 < 24) {
            System.out.println(" Вы учитесь в университете");
        } else if (age4 > 24) {
            System.out.println("Вам пора на работу");
        }
        //ex 5

        int age5 = 4 ;
        if (age5 < 5) {
            System.out.println(" Ребенок не может кататься на аттракционе");
        } else if (age5 >= 5 && age5 <14) {
            System.out.println("Ребенок может кататься на атракционе только со взрослым");
        } else if (age5 > 14) {
            System.out.println(" Ребенок может кататься на аттракционе без взрослого");

        }
          int one = 1;
            int two = 2;
            int three = 3;
            if (one < 2) {
                System.out.println(" два больше");
            }  else if ( two < three){
                System.out.println( "Три больше");


        }

    }
