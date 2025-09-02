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
        // Array Multidimensional
        // Dado em formato tabular - linhas e colunas
        int [] [] sudoku = { {3, 6, 7},{4, 9, 8},{5, 2, 1} };
        System.out.println(sudoku[0][1]);
        System.out.println(sudoku[1][2]);
        System.out.println(sudoku[2][2]);

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] linhaSudoku : sudoku) {
            for (int numero : linhaSudoku) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }

}
