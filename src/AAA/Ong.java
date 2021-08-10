package AAA;

import java.util.ArrayList;
import java.util.List;



public class Ong {
	
	private List<String> nome = new ArrayList<String>();
	private ArrayList id = new ArrayList<>();
	private List<String> areaDaAtuacao = new ArrayList<String>();
	private List<String> contato = new ArrayList<String>();
	private List<String> descricao = new ArrayList<String>();
	
	
	public Ong(ArrayList<String> nome, ArrayList id, ArrayList<String> areaDaAtuacao, ArrayList<String> contato, ArrayList<String> descricao) {
		
		this.nome = nome;
		this.id = id;
		this.areaDaAtuacao = areaDaAtuacao;
		this.contato = contato;
		this.descricao = descricao;
	}

	public Ong() {
		
	}

	public List<String> getNome() {
		nome = new ArrayList<String>();
		nome.add("Tucca");
		nome.add("Cruzando histórias");
		nome.add("Generation Brasil");
		nome.add("Moradia e Cidadania");
		nome.add("AMPARA Animal");
		return nome;
	}
	


	public ArrayList<Integer> getId() {
		
		id.add(0);
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		return id;
	}


	public List<String> getAreaDaAtuacao() {
		areaDaAtuacao.add("Saúde");
		areaDaAtuacao.add("Trabalho");
		areaDaAtuacao.add("Educação");
		areaDaAtuacao.add("Cidadania");
		areaDaAtuacao.add("Animais");
		return areaDaAtuacao;
	}


	public List<String> getContato() {
		contato.add("(11) 2522-5712\r\n" + 
				"https://www.tucca.org.br/");
		
		contato.add("(11) 97033-6229");
		contato.add("0800 707 1027\r\n" + 
				"https://brazil.generation.org/");
		contato.add("https://moradiaecidadaniamg.org.br/sobre-nos");
		contato.add("https://amparanimal.org.br/");
		return contato;
	}


	public List<String> getDescricao() {
		descricao.add("A TUCCA (Associação para Crianças e Adolescentes com Câncer) foi"
				+ " fundada em 1998 por médicos,pais de pacientes e representantes da sociedade civil, "
				+ "com a proposta de elevar as taxas de cura e melhorar a qualidade de vida de crianças e adolescentes "
				+ "carentes com câncer.");
		
		descricao.add("Cruzando histórias - Uma organização civil que escuta, acolhe e desenvolve mulheres que estão sem trabalho e renda.");
		descricao.add("Generation Brasil - Nossa missão é transformar sistemas de educação para o emprego de maneira a preparar, colocar e apoiar pessoas em carreiras transformadoras que, de outra forma, seriam inacessíveis.");
		descricao.add("ONG Moradia e Cidadania - teve origem no Comitê da Ação da Cidadania criado em 1993 pelos empregados da Caixa Econômica Federal. É responsável por iniciativas como: educação, geração de trabalho e renda e apoio às ações de combate à fome e à miséria para comunidades de baixa renda");
		descricao.add("	AMPARA Animal - A AMPARA Animal (Associação de Mulheres Protetoras dos Animais Rejeitados e Abandonados) é uma OSCIP sem fins lucrativos que ajuda abrigos e protetores independentes com ração, medicamentos e atendimento veterinário.");
		
		return descricao;
	}
	
	
	
	
	
	
	
	

}
