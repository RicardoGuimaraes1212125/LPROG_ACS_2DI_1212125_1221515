package portus.drones.lprog.menu;


import portus.drones.lprog.services.MissoesService;

import java.util.List;
import portus.drones.lprog.domain.Drone;
import portus.drones.lprog.domain.Modelo;

public class MenuMissoes implements Runnable {
    private final MissoesService missoesService;
    private final List<Drone> drones;
    private final List<Modelo> modelos;

    public MenuMissoes(List<Drone> drones, List<Modelo> modelos) {
        this.missoesService = new MissoesService();
        this.drones = drones;
        this.modelos = modelos;
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
            System.out.println("7. Ver distância total de uma missão");

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
                case "7":
                    mostrarDistanciaTotal();
                    break;
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

    private void mostrarDistanciaTotal() {
        System.out.print("Introduza o nome da missão: ");
        String nome = System.console().readLine();

        while (nome == null || nome.trim().isEmpty()) {
            System.out.print("Nome não pode estar vazio. Por favor, tente novamente: ");
            nome = System.console().readLine();
        }

        double total = missoesService.getDistanciaTotalPorMissao(nome.trim());

        if (total >= 0) {
            System.out.printf("Distância total da missão \"%s\": %.2f km\n", nome, total);
        } else {
            System.out.println("Missão não encontrada.");
        }
    }
}
