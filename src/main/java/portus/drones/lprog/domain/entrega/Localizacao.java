package portus.drones.lprog.domain.entrega;

public class Localizacao {
    private Coordenada latitude;
    private Coordenada longitude;
    private String nome;


    public Localizacao() { }

    public Localizacao(Coordenada latitude, Coordenada longitude, String nome) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
    }

    public Coordenada getLatitude() {
        return latitude;
    }

    public void setLatitude(Coordenada latitude) {
        this.latitude = latitude;
    }

    public Coordenada getLongitude() {
        return longitude;
    }

    public void setLongitude(Coordenada longitude) {
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "latitude=" + latitude.toString() +
                ", longitude=" + longitude.toString() +
                ", nome='" + nome + '\'' +
                '}';
    }
}
