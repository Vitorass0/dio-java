public class ExemploFor {
    public static void main(String[] args) {
       String alunos[] = {"Jonas", "Brunna", "Maria", "José"};
        //for comum:
        // for (int i = 0; i < alunos.length; i++) {
        //     System.out.println("Nome do aluno: "+alunos[i]);
        // }
        //for each:
        for (String aluno : alunos) {
            System.out.println("Nome do aluno: "+aluno);
        }
    }
}