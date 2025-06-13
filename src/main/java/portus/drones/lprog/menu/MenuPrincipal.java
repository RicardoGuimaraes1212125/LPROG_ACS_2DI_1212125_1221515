package portus.drones.lprog.menu;

/**
 * Main menu for the Portus Drones application.
 * Provides navigation to mission and fleet management.
 */
public class MenuPrincipal implements Runnable {

    /**
     * Runs the main menu loop, allowing the user to select between missions, fleet, or exit.
     */
    @Override
    public void run() {
        String option;

        while (true) {
            System.out.println("-------- PORTUS DRONES --------");
            System.out.println("1. Missões");
            System.out.println("2. Frota");
            System.out.println("3. Sair");

            System.out.print("\n\nEscolha uma opção: ");

            option = System.console().readLine();

            switch (option) {
                case "1" -> new MenuMissoes().run();
                case "2" -> new MenuFrota().run();
                case "3" -> {
                    return; // Sair do loop e encerrar o programa
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}