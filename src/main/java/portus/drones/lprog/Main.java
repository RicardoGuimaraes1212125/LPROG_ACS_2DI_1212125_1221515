package portus.drones.lprog;

import portus.drones.lprog.menu.MenuPrincipal;

/**
 * Entry point for the Portus Drones application.
 */
public class Main{
    /**
     * Main method. Starts the application by running the main menu.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.run();
    }
}