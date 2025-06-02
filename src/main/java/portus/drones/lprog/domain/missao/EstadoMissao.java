package portus.drones.lprog.domain.missao;

public enum EstadoMissao {
    PLANEADA, EM_CURSO, CONCLUIDA;

    public static EstadoMissao fromString(String text) {
        if (text == null) return null;
        try {
            return valueOf(text.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.err.println("Warning: Unknown EstadoMissao string - " + text);
            return null;
        }
    }
}
