package Answer1;

public class Main {
    public static void main(String[] args) {
        int sum =0;
        int sayac=0;

        for (int i = 0; i < 2000; i++)
            if ((i % 3 == 0 ) && (i % 5 == 0 ) && (i % 7 == 0) && (i % 53 == 0) )
                sum = sum + i;
        sayac++;
        System.out.println(" Cevap " +  sum/sayac);
    }
}
