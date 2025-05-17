import java.util.Scanner;

public class Aluno {
	
		public String nome;
		public int idade;
		public String identidade;
		
		void defineIdentidade(String valor) {
			if (valor.length() >= 5){
				identidade = valor;
			} else{
				System.out.println("A identidade deve ter ao menos 5 caracteres");
			}
		}
		String pegaIdentidade() {
			return identidade;
    }

		public static void main(String[] args) {
			
			Aluno aluno1 = new Aluno();
			
			String aux = "";
			Scanner entrada = new Scanner(System.in);
			
			//aluno1 dados
			System.out.println("nome do aluno");
			aluno1.nome = entrada.nextLine();
			System.out.println("idade do aluno");
			aluno1.idade = entrada.nextInt();
			entrada.nextLine();
			System.out.println("identidade do aluno");
			aux = entrada.nextLine();
			aluno1.defineIdentidade(aux);
			System.out.println("o aluno1, de nome " + aluno1.nome + " tem idade " + aluno1.idade);
			System.out.println("identidade " + aluno1.pegaIdentidade());
			
			//aluno2 dados
			Aluno aluno2;
			aluno2 = new Aluno();
			System.out.println("nome do aluno");
			aluno2.nome = entrada.nextLine();
			System.out.println("idade do aluno");
			aluno2.idade = entrada.nextInt();
			entrada.nextLine();
			System.out.println("identidade do aluno");
			aux = entrada.nextLine();
			aluno2.defineIdentidade(aux);
			System.out.println("o aluno2, de nome" + aluno2.nome + "tem idade " + aluno2.idade);
			System.out.println("identidade " + aluno2.pegaIdentidade());
			
		}
}
	