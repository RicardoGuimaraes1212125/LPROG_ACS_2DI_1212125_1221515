package portus.drones.lprog.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds the lists of all drones and models in the fleet.
 */
public class Frota {
    /**
     * Static list of all drones in the fleet.
     */
    public static final List<Drone> drones = new ArrayList<>();
    /**
     * Static list of all models in the fleet.
     */
    public static final List<Modelo> modelos = new ArrayList<>();
}
