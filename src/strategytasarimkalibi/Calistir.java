package strategytasarimkalibi;

public class Calistir {

    private Islem islem;

    public Calistir(Islem islem) {
        this.islem = islem;
    }

    public int islemiCalistir(int sayi1, int sayi2) {
        return islem.islemYap(sayi1, sayi2);
    }
}
