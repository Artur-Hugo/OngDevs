package AAA;

import java.util.ArrayList;
import java.util.Scanner;



public class Desenvolvimento extends Ong {

	
	
 
	
	

	




	 public Desenvolvimento() {
		// TODO Auto-generated constructor stub
	}









	String nome;
	String estado;
	 int idade;
	int num1;
	int num2;
	int num3 = 0;
	int num4=0;
	int num5=0;
	int num6=0;
	Scanner ler = new Scanner(System.in);
	
	
	
	
	
	
	
	
	
	public void ApresentacaoInicial() {
		
		System.out.println(".•*¨`*•. ☆ .•*¨`*•.\r\n"
				+ "Olá, nós somos a ONGdevs e esperamos que você esteja ótimo(a)!!!!\r\n"
				+ "✿•*¨`*•. (¯`v´¯) (¯`v´¯) .•*¨`*•✿\r\n"
				+ ". . . ✿•*¨`*•.¸(¯`v´¯)¸.•´*¨`*•✿ . . .\r\n");
		System.out.println("Iremos fazer algumas perguntas para que possamos te conhecer melhor :)");
		
		System.out.println();
		
		System.out.println("Por favor digite os seguintes dados para continuar" + "\nDigite o seu nome completo: ");
		nome=ler.nextLine();
		
		System.out.println("Por favor digite a sua idade");
		idade = ler.nextInt();
		
		
		ler.nextLine();
		System.out.println("Digite o seu estado: ");
		estado=ler.nextLine();
		
		Pessoa pessoa = new Pessoa(nome,idade , estado);
	}
	
	
	
	
	
	
	
	
	public void Apresentar() {
		
		System.out.println();
		
		System.out.println("Seja muito bem vindo(a)" +nome + "\nIremos falar um pouco sobre o nosso projeto:" +"\nVocê já ouviu falar sobre a ONGdesvs?"
		+"\nÉ um projeto que chegou para fazer a diferença na vida das pessoas, com fundamento de apresentar as ONGS.\nO intuito é trazer visibilidade para incriveis "
		+ "projetos e consequentemente causar um grande impacto social com a tecnologia, ajudando um ao outro");
	
			
			System.out.println("Você sabe o que é uma ONG ? 1-SIM || 2-NÃO ");
			num1=ler.nextInt();
			
			while(num1 < 1 || num1 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("1 - SIM| 2 - NÃO:");
				num1 = ler.nextInt();
				
			}
			if (num1==1 || num1==2) {
				System.out.println("As ONGs são consideradas entidades privadas, mas sem fins lucrativos, "
						+ "uma vez que sua finalidade é exclusivamente de auxiliar a sociedade."
						+ "Atuando por meio de voluntários que se colocam à disposição para ajudar o próximo, as ONGs são verdadeiras entidades que promovem o bem ");
			}
			
			
			System.out.println("\nVocê já ajudou alguma? 1-SIM || 2-NÃO  ");
			num2=ler.nextInt();
    	
			while(num2 < 1 || num2 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("1 - SIM| 2 - NÃO:");
				num2 = ler.nextInt();
				
			}
			
			if (num2==1) {
				System.out.println("Gostaria de ajudar mais alguma ? 1-SIM || 2-NÃO ");
				num3=ler.nextInt();
			}
			
			while(num3 < 1 || num3 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("1 - SIM| 2 - NÃO:");
				num3 = ler.nextInt();
				
			}
			
            if (num3==2) {
				
				System.out.println("Muito obrigado! Esperamos que retorne em breve caso mude de idéia :D ");
				
			}
			
			if (num3==1) {
				
				System.out.println("Deseja se tornar um apoiador de uma ONG? 1-SIM || 2-NÃO ");
				num5=ler.nextInt();
			}
			
			if (num5==2) {
				System.out.println("Muito obrigado! Esperamos que retorne em breve caso mude de idéia :D ");
			}
			
			if (num5==1) {
				System.out.println("Tem preferência por algum setor de apoio? "); //vetores ONG
				Setores();
			}
			
	}
	
	
	public void Setores() {
		System.out.println(" Digite as opções:");
		System.out.println("1 - Saúde  ");
		System.out.println("2 - Trabalho ");
		System.out.println("3 - Educação ");
		System.out.println("4 - Cidadania ");
		System.out.println("5 - Animais");
		
		
		num1 = ler.nextInt();
		
		
		switch (num1){
		case 1:
			System.out.println( getNome().get(0));
			System.out.println( getContato().get(0));
			System.out.println( getDescricao().get(0));
			System.out.println(getId().get(0));
			break;
			
		case 2:
			System.out.println( getNome().get(1));
			System.out.println( getContato().get(1));
			System.out.println( getDescricao().get(1));
			System.out.println(getId().get(1));
			break;
			
		
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
