package portus.drones.lprog.menu;


public class MenuMissoes implements Runnable {

    @Override
    public void run() {
        String option;

        while (true) {
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("-------- Gerir missões --------");
            System.out.println("1. Upload missão a partir de ficheiro");
            System.out.println("2. Validar ficheiro de missões");
            System.out.println("3. Eliminar missão");
            System.out.println("4. Exportar missões para ficheiro");
            System.out.println("5. Retroceder");

            System.out.print("\n\nEscolha uma opção: ");

            option = System.console().readLine();

            switch (option) {
                case "1":
                    // Implementar lógica para adicionar drone
                    break;
                case "2":
                    // Implementar lógica para listar drones
                    break;
                case "3":
                    // Implementar lógica para atualizar drone
                    break;
                case "4":
                    // Implementar lógica para remover drone
                    break;
                case "5":
                    System.out.println("A voltar atrás...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
