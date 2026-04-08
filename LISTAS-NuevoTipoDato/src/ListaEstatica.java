
public class ListaEstatica {
    private Persona[] elementos;
    private int tamActual;
    private final int MAX;

    public ListaEstatica(int capacidad) {
        this.MAX = capacidad;
        this.elementos = new Persona[MAX];
        this.tamActual = 0;
    }

    public void mostrar() {
        if (tamActual == 0) {
            System.out.println("Lista vacía.");
            return;
        }
        for (int i = 0; i < tamActual; i++) {
            System.out.println("[" + i + "] " + elementos[i]);
        }
    }

    public boolean meterValorPosicion(Persona p, int pos){
        if (tamActual < MAX && pos >= 0 && pos <= tamActual){
            for (int i = tamActual; i > pos; i--){
                elementos[i] = elementos[i-1];
            }
            elementos[pos] = p;
            tamActual++;
            return true;
        }
        return false;
    }

    public boolean eliminaValorPosicion(int pos){
        if(tamActual > 0 && pos >= 0 && pos < tamActual){
            for(int i = pos; i < tamActual-1; i++){
                elementos[i] = elementos[i+1];
            }
            tamActual--;
            return true;
        }
        return false;
    }

    public int getTamActual() {
        return tamActual;
    }
}