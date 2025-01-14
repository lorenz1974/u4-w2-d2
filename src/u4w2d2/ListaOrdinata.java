package u4w2d2;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class ListaOrdinata {

    private int numeroElementi;

    private Set<Integer> lista;
    private Set<Integer> listaReverse;
    public List<Integer> listaCombinata;

    public ListaOrdinata(int numeroElementi) {
        this.numeroElementi = numeroElementi;
    }

    // Deve accettare interi o null quindi devo usare "Integer" e non "int"
    public Set<Integer> creaLista(Integer numeroElementi) {
        Random random = new Random();

        // Crea la lista
        this.lista = new TreeSet<>();

        // Verifico se il metodo è stato chiamato con un numero di elementi
        // maggiore di 0, altrimenti usa il numero di elementi passato al costruttore
        numeroElementi = (numeroElementi == null || numeroElementi <= 0) ? this.numeroElementi : numeroElementi;

        // Mette i valori nella lista
        while(this.lista.size() < numeroElementi) {
            this.lista.add(random.nextInt(101));
        }

        return this.lista;
    }

    private Set<Integer> creaListaReverse() {

        // Crea la lista reverse dalla lista
        this.listaReverse = ((TreeSet<Integer>) this.lista).descendingSet();
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

        List<Integer> listaArray;
        List<Integer> listaPariDispari = new ArrayList<>();

        // Verifica se la lista passata è vuota e se è vuota ne crea una nuova
        if (lista == null || lista.isEmpty()) {
            listaArray = new ArrayList<Integer>(creaLista(this.numeroElementi));
        } else {
            // Converto lista per poter accedere via indice
            listaArray = new ArrayList<>(lista);
        }

        // Setta l'offset per il ciclo for (meglio che usare %)
        int offset = pari ? 0 : 1;
        for (int i = offset; i < listaArray.size(); i += 2) {
            listaPariDispari.add(listaArray.get(i));
        }

        return listaPariDispari;
    }

}
