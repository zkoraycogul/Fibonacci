import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt(),nBefore = 0, nCurent=1,nNext=0;


        for(int i=0;i<number;i++) {
            nNext = nCurent+nBefore;
            System.out.print(nNext + " ");
            nBefore = nCurent;
            nCurent = nNext;
        }

    }
}

