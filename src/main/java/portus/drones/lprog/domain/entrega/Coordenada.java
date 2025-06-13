package portus.drones.lprog.domain.entrega;

/**
 * Represents a coordinate value (latitude or longitude).
 */
public class Coordenada {
    private double valor;


    /**
     * Constructs a Coordenada with a value.
     * @param valor the coordinate value
     */
    public Coordenada(double valor) {
        this.valor = valor;
    }

    /**
     * Returns the coordinate value.
     * @return the coordinate value
     */
    public double getValor() {
        return valor;
    }

    /**
     * Sets the coordinate value.
     * @param valor the new coordinate value
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Returns a string representation of the coordinate.
     * @return coordinate as string
     */
    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
