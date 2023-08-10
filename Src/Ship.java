import java.util.Arrays;

public class Ship {

    public static void main(String[] args) {

        int shatleNumber = 1;

        for (int i = 0; i < 100; i++) {

            System.out.println(shatleNumber);

            shatleNumber++;

            if(shatleNumber %10 == 4||shatleNumber %10 ==9){

                shatleNumber++;

            }if(shatleNumber /10 %10 == 4||shatleNumber /10 %10 ==9){

              shatleNumber = shatleNumber +10;
            }

        }

        System.out.println("Here are the code numbers of 100 spaceship");
    }

}
