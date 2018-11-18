import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }


     static void task1()
     {
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
         int x = rand.nextInt(10);


         do
         {
             System.out.println("Введите число от 0 до 90");
             for (int i = 0; i < 3; i++) {
                int a = sc.nextInt();

                    if (a > x)
                    {
                        System.out.println("Указанное число больше загаданного");
                    }
                    else if (a < x)
                    {
                        System.out.println("Указанное число меньше загаданного");
                    }
                    else if (a == x)
                    {
                        System.out.println("Указанное число равно загаданному");
                        break;
                    }

             }



             System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет");
         }while (sc.nextInt() == 1);
     }


    static void task2()
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(words.length);
        String word = words[x];
        String b;

        do {System.out.println("Введите слово");
           b = sc.nextLine();
            for (int i = 0; i <15 ; i++) {
                if ((i<word.length()) && (i < b.length()))
                {
                    if (word.charAt(i) == b.charAt(i))
                    {
                        System.out.print(word.charAt(i));
                    }
                    else
                    {
                        System.out.print('#');
                    }
                }
                else
                    System.out.print('#');
                }
            System.out.println();
        } while (!word.equals(b));

    }
}

