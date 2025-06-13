package portus.drones.lprog.domain.missao;

/**
 * Enum representing the state of a mission (missão).
 */
public enum EstadoMissao {
    PLANEADA("planeada"),
    EM_CURSO("em_curso"),
    CONCLUIDA("concluida");

    private final String value;

    EstadoMissao(String value) {
        this.value = value;
    }

    /**
     * Gets the string value of the state.
     * @return state as string
     */
    public String getValue() {
        return value;
    }

    /**
     * Returns the enum constant matching the given string.
     * @param text the string to match
     * @return the matching EstadoMissao
     * @throws IllegalArgumentException if no match is found
     */
    public static EstadoMissao fromString(String text) {
        for (EstadoMissao estado : EstadoMissao.values()) {
            if (estado.value.equalsIgnoreCase(text)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }

    /**
     * Returns the string representation of the state.
     * @return state as string
     */
    @Override
    public String toString() {
        return value;
    }
}
