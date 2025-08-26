public class ArrayStructure {
    public static void main(String[] args) {
        // Declarar e Inicializar
        String [] tarefas = {"Estudar Java", "Fazer Exercicios", "Tomar Café"};
        // Acessar posições do Array
        System.out.println(tarefas[0]);
        System.out.println(tarefas[1]);
        System.out.println(tarefas[2]);

        // Atualizar posições do Array
        tarefas [2] = "Limpar a Casa";
        System.out.println(tarefas[2]);

        // Tamanho do Array
        System.out.println("Você possui "+ tarefas.length + " tarefas.");

        // Percorrer / Interar Arrays
        for (int i = 0; i < tarefas.length; i++) {
            System.out.println(tarefas[i] + " ");
        }
        for (String tarefa : tarefas) {
            System.out.println(tarefa + " ");
        }
    }
}
