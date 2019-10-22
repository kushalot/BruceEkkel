
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Sr sravnnenie = new Sr();
        sravnnenie.formirovanie();
    }
}


   class Sr {
         void formirovanie() {
            int array[] = new int[25];
            Random rand = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = (rand.nextInt(20)) - 10;
                System.out.println(" [" + i + "] " + array[i]);
            }
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1)
                    System.out.println("last el " + array[i]);
                else if (array[i] < array[i + 1])
                    System.out.println(array[i] + "<" + array[i + 1]);
                else if (array[i] > array[i + 1])
                    System.out.println(array[i] + ">" + array[i + 1]);
                else if (array[i] == array[i + 1])
                    System.out.println(array[i] + "=" + array[i + 1]);
            }
        }
    }



