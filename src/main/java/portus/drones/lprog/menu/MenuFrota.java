package portus.drones.lprog.menu;

import portus.drones.lprog.domain.Drone;
import portus.drones.lprog.domain.Modelo;
import portus.drones.lprog.services.FrotaService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuFrota implements Runnable {
    private final FrotaService frotaService = new FrotaService();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        String option;
        do {
            System.out.println("\n-------- PORTUS DRONES --------");
            System.out.println("1. Carregar Modelos de Ficheiro");
            System.out.println("2. Carregar Frota de Ficheiro");
            System.out.println("3. Listar Drones");
            System.out.println("4. Adicionar Drone Manualmente");
            System.out.println("5. Exportar Frota para Ficheiro");
            System.out.println("6. Listar Modelos");
            System.out.println("7. Consultar Modelo por Nome");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            option = sc.nextLine();
            switch (option) {
                case "1" -> {
                    System.out.print("Caminho do ficheiro de modelos: ");
                    String path = sc.nextLine();
                    try {
                        frotaService.carregarModelos(path);
                    } catch (Exception e) {
                        System.out.println("Erro ao carregar modelos: " + e.getMessage());
                    }
                }
                case "2" -> {
                    System.out.print("Caminho do ficheiro da frota: ");
                    String path = sc.nextLine();
                    try {
                        frotaService.carregarDrones(path);
                    } catch (Exception e) {
                        System.out.println("Erro ao carregar frota: " + e.getMessage());
                    }
                }
                case "3" -> frotaService.listarDrones();

                case "4" -> {
                    List<Modelo> modelos = frotaService.getModelos();
                    if (modelos.isEmpty()) {
                        System.out.println("Carregue primeiro os modelos (opção 1).");
                        break;
                    }

                    Drone d = new Drone();
                    System.out.print("Nome: ");
                    d.setNome(sc.nextLine());

                    System.out.println("Modelos disponíveis:");
                    for (int i = 0; i < modelos.size(); i++) {
                        System.out.println((i + 1) + ". " + modelos.get(i).getNome());
                    }

                    int escolha;
                    do {
                        System.out.print("Escolha um modelo [1-" + modelos.size() + "]: ");
                        escolha = Integer.parseInt(sc.nextLine());
                    } while (escolha < 1 || escolha > modelos.size());

                    d.setModelo(modelos.get(escolha - 1).getNome());

                    System.out.print("Número Série: ");
                    d.setNumeroSerie(Long.parseLong(sc.nextLine()));
                    System.out.print("Peso Base: ");
                    d.setPesoBase(Double.parseDouble(sc.nextLine()));
                    System.out.print("Bateria Atual: ");
                    d.setBateriaAtual(Double.parseDouble(sc.nextLine()));
                    System.out.print("Estado (ativo, manutencao, inativo, em_missao): ");
                    d.setEstado(sc.nextLine());
                    System.out.print("Horas de Voo: ");
                    d.setHorasVoo(Double.parseDouble(sc.nextLine()));
                    System.out.print("Última Manutenção (AAAA-MM-DD): ");
                    d.setUltimaManutencao(LocalDate.parse(sc.nextLine()));
                    System.out.print("Próxima Manutenção (AAAA-MM-DD): ");
                    d.setProximaManutencao(LocalDate.parse(sc.nextLine()));

                    frotaService.adicionarDrone(d);
                }

                case "5" -> {
                    System.out.print("Ficheiro destino: ");
                    String path = sc.nextLine();
                    try {
                        frotaService.exportarDrones(path);
                    } catch (Exception e) {
                        System.out.println("Erro ao exportar frota: " + e.getMessage());
                    }
                }

                case "6" -> frotaService.listarModelos();

                case "7" -> {
                    System.out.print("Nome do modelo a consultar: ");
                    String nome = sc.nextLine();
                    Modelo modelo = frotaService.getModeloPorNome(nome);
                    if (modelo != null) {
                        System.out.println(modelo);
                    } else {
                        System.out.println("Modelo não encontrado.");
                    }
                }
            }
        } while (!option.equals("8"));
    }
}
