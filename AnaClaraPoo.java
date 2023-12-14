class Aluno {

    String nome;
    int idade;
    double mediaNotas;
    String curso;
    boolean matriculado;
    int matricula;

    void realizarMatricula() {
        if (!matriculado) {
            matriculado = true;
            matricula = gerarMatricula();
            System.out.println(nome + " foi matriculado no curso de " + curso + ". Matrícula: " + matricula);
        } else {
            System.out.println(nome + " já está matriculado no curso de " + curso);
        }
    }

    int gerarMatricula() {
        return (int) (Math.random() * 10000);
    }

    void imprimirStatus() {
        System.out.println("Status de " + nome + ":");
        System.out.println("Idade: " + idade);
        System.out.println("Matriculado: " + (matriculado ? "Sim" : "Não"));
        System.out.println("Média de Notas: " + mediaNotas);
    }

   
    public static void main(String[] args) {
        // Instanciando objetos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 20;
        aluno1.mediaNotas = 8.5;
        aluno1.curso = "Engenharia";
        aluno1.matriculado = false;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 22;
        aluno2.mediaNotas = 9.0;
        aluno2.curso = "Medicina";
        aluno2.matriculado = false;

        aluno1.realizarMatricula();
        aluno1.imprimirStatus();

        aluno2.realizarMatricula();
        aluno2.imprimirStatus();
    }
}
