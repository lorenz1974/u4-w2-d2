package u4w2d2;

public class Main {
    public static void main(String[] args) {

        System.out.println("------- Esercizio 1 -------");
        new ParoleDistinte(5);
        System.out.print("\n".repeat(2));

        System.out.println("------- Esercizio 2 -------");
        ListaOrdinata classeLista = new ListaOrdinata(5);

        System.out.println("-- Lista ordinata ----------");
        System.out.println(classeLista.creaLista(null));
        System.out.print("\n".repeat(2));

        System.out.println("-- Lista Combinata ----------");
        System.out.println(classeLista.creaListaCombinata());
        System.out.print("\n".repeat(2));

        System.out.println("-- Lista Pari e Dispari ----------");
        System.out.println("-- Pari ----------");
        System.out.println(classeLista.listaPariDispari(true, classeLista.listaCombinata));
        System.out.print("\n".repeat(1));
        System.out.println("-- Dispari ----------");
        System.out.println(classeLista.listaPariDispari(false, classeLista.listaCombinata));
        System.out.print("\n".repeat(2));
    }

}