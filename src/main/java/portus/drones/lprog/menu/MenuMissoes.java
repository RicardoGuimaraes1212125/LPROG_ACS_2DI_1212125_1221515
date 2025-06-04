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
            System.out.println("5. Listar missões");
            System.out.println("6. Retroceder");

            System.out.print("\n\nEscolha uma opção: ");

            option = System.console().readLine();

            switch (option) {
                case "1":
                    uploadMissoesFromFile();
                    break;
                case "2":
                    validateMissoesFile();
                    break;
                case "3":
                    removeMissao();
                    break;
                case "4":
                    exportMissoesToFile();
                case "5":
                    listMissoes();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void uploadMissoesFromFile() {
        System.out.print("Introduza o caminho do ficheiro: ");
        String filePath = System.console().readLine();


        while (filePath == null || filePath.trim().isEmpty()) {
            System.out.print("Caminho do ficheiro não pode estar vazio. Por favor, tente novamente: ");
            filePath = System.console().readLine();
        }
        
        missoesService.loadMissoesFromFile(filePath.trim());
    }

    private void validateMissoesFile() {
        System.out.print("Introduza o caminho do ficheiro: ");
        String filePath = System.console().readLine();

        while (filePath == null || filePath.trim().isEmpty()) {
            System.out.print("Caminho do ficheiro não pode estar vazio. Por favor, tente novamente: ");
            filePath = System.console().readLine();
        }

//        missoesService.validateMissoesFile(filePath.trim());
    }


    private void exportMissoesToFile() {
        System.out.print("Introduza o caminho do ficheiro onde exportar: ");
        String filePath = System.console().readLine();

        while (filePath == null || filePath.trim().isEmpty()) {
            System.out.print("Caminho do ficheiro não pode estar vazio. Por favor, tente novamente: ");
            filePath = System.console().readLine();
        }
        missoesService.exportMissoesToFile(filePath.trim());

    }

    private void removeMissao(){
        System.out.print("Introduza o nome da missao: ");
        String name = System.console().readLine();


        while (name == null || name.trim().isEmpty()) {
            System.out.print("Nome não pode estar vazio. Por favor, tente novamente: ");
            name = System.console().readLine();
        }

        missoesService.clearMissao(name);
    }

    private void listMissoes() {
        missoesService.listMissoes();
    }
}
