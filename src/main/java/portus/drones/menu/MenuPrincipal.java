package portus.drones.menu;

public class MenuPrincipal implements Runnable {

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        String option;

        do {
            System.out.println("-------- PORTUS DRONES --------");
            System.out.println("1. Adicionar Drone");
            System.out.println("2. Listar Drones");
            System.out.println("3. Atualizar Drone");
            System.out.println("4. Remover Drone");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            option = System.console().readLine();

            System.out.println(option);
        } while (!option.equals("5"));
    }
}