package Modelo;

public class Tarea {
    
    private String nombre;
    private boolean completada;

    /**
     * Constructor. Una tarea nueva siempre empieza como "pendiente".
     */
    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    // --- Getters y Setters ---
    
    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    /**
     * ¡Este es el método "mágico"!
     * La JList automáticamente llama a toString() para saber qué texto mostrar.
     * Así, el estado se actualiza solo en la lista.
     */
    @Override
    public String toString() {
        if (completada) {
            return "[COMPLETADA] " + nombre;
        } else {
            return "[Pendiente] " + nombre;
        }
    }
}