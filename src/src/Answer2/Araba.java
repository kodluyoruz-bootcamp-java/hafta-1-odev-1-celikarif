package Answer2;

public class Araba {
    public static void main(String[] args) {

    }

    String marka;
    String model;
    int yas;
    int beygir_gucu;

    //boş constructor
    public Araba() {
    }

    //1 parametreli constructor
    public Araba(String marka) {
        this.marka = marka;
    }

    //2 parametreli constructor
    public Araba(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    //3 parametreli constructor
    public Araba(String marka, String model, int yas) {
        this.marka = marka;
        this.model = model;
        this.yas = yas;
    }

    //Bütün parametreler tek constructor'da
    public Araba(String marka, String model, int yas, int beygir_gucu) {
        this.marka = marka;
        this.model = model;
        this.yas = yas;
        this.beygir_gucu = beygir_gucu;
    }

}
