package portus.drones.lprog.domain.missao;

public enum EstadoMissao {
    PLANEADA("planeada"),
    EM_CURSO("em_curso"),
    CONCLUIDA("concluida");

    private final String value;

    EstadoMissao(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EstadoMissao fromString(String text) {
        for (EstadoMissao estado : EstadoMissao.values()) {
            if (estado.value.equalsIgnoreCase(text)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }

    @Override
    public String toString() {
        return value;
    }
}
