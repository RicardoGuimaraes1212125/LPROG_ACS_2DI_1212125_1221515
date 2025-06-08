package portus.drones.lprog.menu;

public class MenuPrincipal implements Runnable {

    /**
     * Runs this operation.
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
                case "1":
                    new MenuMissoes().run();
                    break;
                case "2":
                    new MenuFrota().run();
                    break;
                case "3":
                    return; // Sair do loop e encerrar o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}