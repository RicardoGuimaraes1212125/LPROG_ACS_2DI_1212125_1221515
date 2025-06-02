package portus.drones.lprog.menu;

import portus.drones.lprog.services.MissoesService;

public class MenuMissoes implements Runnable {
    private final MissoesService missoesService;

    public MenuMissoes() {
        this.missoesService = new MissoesService();
    }

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
            System.out.println("5. Listar missões carregadas");
            System.out.println("6. Retroceder");

            System.out.print("\n\nEscolha uma opção: ");

            option = System.console().readLine();

            switch (option) {
                case "1":
                    uploadMissaoFromFile();
                    break;
                case "2", "4", "3":
                    throw new UnsupportedOperationException("Not implemented.");
                case "5":
                    listarMissoes();
                    break;
                case "6":
                    System.out.println("A voltar atrás...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void uploadMissaoFromFile() {
        System.out.print("Introduza o caminho do ficheiro: ");
        String filePath = System.console().readLine();
        
        if (filePath == null || filePath.trim().isEmpty()) {
            System.out.println("Caminho do ficheiro não pode estar vazio.");
            return;
        }
        
        missoesService.loadMissoesFromFile(filePath.trim());
        
        System.out.println("\nPressione Enter para continuar...");
        System.console().readLine();
    }



    private void listarMissoes() {
        missoesService.listMissoes();
        
        System.out.println("\nPressione Enter para continuar...");
        System.console().readLine();
    }
}
