public class Main {
    public static void main(String[] args) {

        Telefon samsungS10e = new Telefon();
        samsungS10e.navn = "Samsung s10e";
        samsungS10e.stoerrelse = 5.8;
        samsungS10e.batteri = 3400;
        samsungS10e.pris = 3999;
        samsungS10e.androidOne = false;

        Telefon iphone11ProMax = new Telefon();
        iphone11ProMax.navn = "Iphone 11 Pro Max";
        iphone11ProMax.stoerrelse = 6.5;
        iphone11ProMax.batteri = 3500;
        iphone11ProMax.pris = 9799;
        iphone11ProMax.androidOne = false;

        Telefon googlePixel3a = new Telefon ();
        googlePixel3a.navn = "Google Pixel 3a";
        googlePixel3a.stoerrelse = 5.6;
        googlePixel3a.batteri = 3000;
        googlePixel3a.pris = 3299;
        googlePixel3a.androidOne = true;




        if (samsungS10e.stoerrelse < 6 && samsungS10e.batteri >= 3000 && samsungS10e.pris < 4500 && samsungS10e.androidOne == true) {
            System.out.println("Rasmus køber " + samsungS10e.navn);
        } else {
            System.out.println("Rasmus køber ikke " + samsungS10e.navn);
        }
        if (iphone11ProMax.stoerrelse < 6 && iphone11ProMax.batteri >= 3000 && iphone11ProMax.pris < 4500 && iphone11ProMax.androidOne == true) {
            System.out.println("Rasmus køber " + iphone11ProMax.navn);
        } else {
            System.out.println("Rasmus køber ikke " + iphone11ProMax.navn);
        }
        if (googlePixel3a.stoerrelse < 6 && googlePixel3a.batteri >= 3000 && googlePixel3a.pris < 4500 && googlePixel3a.androidOne == true) {
            System.out.println("Rasmus køber " + googlePixel3a.navn);
        } else {
            System.out.println("Rasmus køber ikke " + googlePixel3a.navn);
        }
    }
}
