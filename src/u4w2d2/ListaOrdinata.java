package u4w2d2;

import java.util.Set;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class ListaOrdinata {

    private int numeroElementi;

    private List<Integer> lista;
    private List<Integer> listaReverse;
    public List<Integer> listaCombinata;

    public ListaOrdinata(int numeroElementi) {
        this.numeroElementi = numeroElementi;
    }

    // Deve accettare interi o null quindi devo usare "Integer" e non "int"
    public List<Integer> creaLista(Integer numeroElementi) {
        Random random = new Random();

        // Crea la lista
        this.lista = new ArrayList<>();

        // Verifico se il metodo è stato chiamato con un numero di elementi
        // maggiore di 0, altrimenti usa il numero di elementi passato al costruttore
        numeroElementi = (numeroElementi == null || numeroElementi <= 0) ? this.numeroElementi : numeroElementi;

        // Mette i valori nella lista
        for (int i = 0; i < numeroElementi; i++) {
            this.lista.add(random.nextInt(100));
        }

        // Ordina la lista
        Collections.sort(this.lista);

        return this.lista;
    }

    private List<Integer> creaListaReverse() {

        // Crea la lista reverse dalla lista
        this.listaReverse = new ArrayList<>(this.lista);

        // Ordina la lista al contrario
        Collections.reverse(this.listaReverse);

        return this.listaReverse;
    }

    public List<Integer> creaListaCombinata() {

        // Crea la lista al contrario
        creaListaReverse();

        // Crea la lista combinata
        this.listaCombinata = new ArrayList<>();

        // Combina le due liste
        this.listaCombinata.addAll(this.lista);
        this.listaCombinata.addAll(this.listaReverse);

        return this.listaCombinata;
    }

    public List<Integer> listaPariDispari(boolean pari, List<Integer> lista) {

        List<Integer> listaPariDispari = new ArrayList<>();

        // Verifica se la lista passata è vuota e se è vuota ne crea una nuova
        if (lista.isEmpty() || lista == null) {
            lista = new ArrayList<>(creaLista(this.numeroElementi));
        }

        // Setta l'ofset per il ciclo for (meglio che usare %)
        int offset = pari ? 0 : 1;
        for (int i = 0 + offset; i < lista.size(); i += 2) {
            listaPariDispari.add(lista.get(i));
        }

        return listaPariDispari;
    }

}
