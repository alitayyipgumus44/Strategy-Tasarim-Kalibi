package strategytasarimkalibi;

public class StrategyTasarimKalibi {

    public static void main(String[] args) {
        Calistir calistir = new Calistir(new Toplama());
        System.out.println("10 + 5 = " + calistir.islemiCalistir(10, 5));

        calistir = new Calistir(new Cikarma());
        System.out.println("10 - 5 = " + calistir.islemiCalistir(10, 5));

        calistir = new Calistir(new Carpma());
        System.out.println("10 * 5 = " + calistir.islemiCalistir(10, 5));
        
        calistir = new Calistir(new Bolme());
        System.out.println("10 / 5 = " + calistir.islemiCalistir(10, 5));
    }

}
