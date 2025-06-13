package portus.drones.lprog.domain.entrega;

/**
 * Represents a location with latitude, longitude, and name.
 */
public class Localizacao {
    private Coordenada latitude;
    private Coordenada longitude;
    private String nome;


    /**
     * Default constructor for Localizacao.
     */
    public Localizacao() { }

    /**
     * Constructs a Localizacao with all fields.
     * @param latitude latitude coordinate
     * @param longitude longitude coordinate
     * @param nome location name
     */
    public Localizacao(Coordenada latitude, Coordenada longitude, String nome) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
    }

    /**
     * Returns the latitude coordinate.
     * @return latitude coordinate
     */
    public Coordenada getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude coordinate.
     * @param latitude latitude coordinate
     */
    public void setLatitude(Coordenada latitude) {
        this.latitude = latitude;
    }

    /**
     * Returns the longitude coordinate.
     * @return longitude coordinate
     */
    public Coordenada getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude coordinate.
     * @param longitude longitude coordinate
     */
    public void setLongitude(Coordenada longitude) {
        this.longitude = longitude;
    }

    /**
     * Returns the name of the location.
     * @return location name
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the name of the location.
     * @param nome location name
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Returns a string representation of the location.
     * @return string with location details
     */
    @Override
    public String toString() {
        return "{" +
                "latitude=" + latitude.toString() +
                ", longitude=" + longitude.toString() +
                ", nome='" + nome + '\'' +
                '}';
    }
}
