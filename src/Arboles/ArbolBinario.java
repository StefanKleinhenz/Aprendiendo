package Arboles;

public class ArbolBinario {

    Nodo raiz;
    int tamArbol;

    ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {

        Nodo nuevoNodo = new Nodo(valor);

        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            Nodo puntero = raiz;
            Nodo padre = null;

            while (puntero != null) {
                padre = puntero;
                if (valor < puntero.valor) {
                    puntero = puntero.izq;
                } else {
                    puntero = puntero.derecho;
                }
            }
            if (valor < padre.valor) {
                padre.izq = nuevoNodo;
            } else {
                padre.derecho = nuevoNodo;
            }
        }

    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(7);
        arbol.insertar(8);

        arbol.preOrder(arbol.raiz);
        System.out.println(arbol.existe(8));

    }

    public boolean existe(int valor) {

        if (raiz == null) {
            System.out.println("No existen nodos, cree primero uno");
            return false;

        } else {

            if (valor == raiz.valor) {

                return true;

            } else {

                Nodo puntero = raiz;
                Nodo padre = null;

                while (puntero != null) {

                    if (valor < puntero.valor) {
                        puntero = puntero.izq;

                        if (puntero == null)
                            return false;

                        if (valor == puntero.valor) {
                            return true;
                        }
                    }
                    if (valor > puntero.valor) {
                        puntero = puntero.derecho;

                        if (puntero == null)
                            return false;

                        if (valor == puntero.valor) {
                            return true;
                        }

                    }

                }


                return false;

            }

        }

    }

    public int obtener(int id) {

        return 0;
    }

    public boolean esHoja() {

        return false;
    }

    public boolean esVacio() {

        return false;
    }

    public void preOrder(Nodo nodo) {

        System.out.println(nodo.valor);

        if (nodo.izq != null) {
            preOrder(nodo.izq);
        }

        if (nodo.derecho != null) {
            preOrder(nodo.derecho);

        }

    }

    public void inOrder() {

    }

    public void postOrder() {

    }

    public void eliminar(int id) {

    }

    class Nodo {

        private int valor;
        private Nodo izq;
        private Nodo derecho;

        Nodo(int valor) {
            this.valor = valor;
            this.izq = null;
            this.derecho = null;
        }

        public int getValor() {
            return valor;
        }

        public Nodo getIzq() {
            return izq;
        }

        public Nodo getDerecho() {
            return derecho;
        }

        @Override
        public String toString() {
            return "Nodo [derecho=" + derecho + ", izq=" + izq + ", valor=" + valor + "]";
        }

    }

}
