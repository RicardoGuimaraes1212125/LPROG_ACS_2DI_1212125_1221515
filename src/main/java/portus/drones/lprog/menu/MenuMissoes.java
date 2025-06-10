package portus.drones.lprog.menu;


import portus.drones.lprog.services.MissoesService;

public class MenuMissoes implements Runnable {
    private final MissoesService missoesService;

    public MenuMissoes() {
        this.missoesService = new MissoesService();
        missoesService.loadMissoesOnProgramStart();
    }

    @Override
    public void run() {
        String option;

        while (true) {
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("-------- Gerir missões --------");
            System.out.println("1. Carregar missão a partir de ficheiro");
            System.out.println("2. Eliminar missão");
            System.out.println("3. Listar missões");
            System.out.println("4. Exportar missões para ficheiro");
            System.out.println("5. Ver distância total de uma missão");
            System.out.println("6. Ver tempo estimado de uma missão");
            System.out.println("7. Validar uma missão");
            System.out.println("8. Retroceder");

            System.out.print("\n\nEscolha uma opção: ");

            option = System.console().readLine();

            switch (option) {
                case "1":
                    uploadMissoesFromFile();
                    break;
                case "2":
                    removeMissao();
                    break;
                case "3":
                    listMissoes();
                    break;
                case "4":
                    exportMissoesToFile();
                    break;
                case "5":
                    calculateMissaoDistance();
                    break;
                case "6":
                    calculateMissaoEstimatedTime();
                    break;
                case "7":
                    validateMissao();
                    break;
                case "8":
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

        missoesService.removeMissao(name);
    }

    private void listMissoes() {
        missoesService.listMissoes();
    }

    private void calculateMissaoDistance() {
        System.out.print("Introduza o nome da missão: ");
        String name = System.console().readLine();

        while (name == null || name.trim().isEmpty()) {
            System.out.print("Nome não pode estar vazio. Por favor, tente novamente: ");
            name = System.console().readLine();
        }

        double totalDistance = missoesService.calculateMissaoDistance(name.trim());

        if (totalDistance >= 0) {
            System.out.printf("Distância total da missão \"%s\": %.2f km\n", name, totalDistance);
        } else {
            System.out.println("Missão não encontrada.");
        }
    }

    private void calculateMissaoEstimatedTime() {
        System.out.print("Introduza o nome da missão: ");
        String name = System.console().readLine();

        while (name == null || name.trim().isEmpty()) {
            System.out.print("Nome não pode estar vazio. Por favor, tente novamente: ");
            name = System.console().readLine();
        }

        double estimatedTime = missoesService.calculateMissaoEstimatedTime(name);

        if (estimatedTime >= 0) {
            System.out.printf("Tempo estimado da missão \"%s\": %.2f horas\n", name, estimatedTime);
        } else {
            System.out.println("Missão não encontrada.");
        }
    }


    private void validateMissao() {
        System.out.print("Introduza o nome da missão: ");
        String name = System.console().readLine();

        while (name == null || name.trim().isEmpty()) {
            System.out.print("Nome não pode estar vazio. Por favor, tente novamente: ");
            name = System.console().readLine();
        }

        missoesService.validateMissao(name);
    }
}
