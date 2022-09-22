import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int degree;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç derece ? : ");
        degree = inp.nextInt();

        if (degree <= 5 ) {
            System.out.println("Kayak Yapabilirsiniz.");
        }
            else if ((degree >= 5) && (degree <= 25 )) {
            if (degree <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz.");
            }

            if (degree <= 25) {
                System.out.println("Pikniğe Gidebilirsiniz.");
            }

            }else{
                System.out.println("Yüzmeye Gidebilirsiniz.");
            }
        }

    }