package treinojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/* new aluno é uma instancia(criação de objeto)*/
		/* aluno1 é uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*joao*/
		
		aluno1.setNome("Joao Pedro");
		aluno1.setIdade(30);
		aluno1.setDataNascimento("02/01/2002");
		aluno1.setRegistroGeral("20914750");
		aluno1.setNumeroCPF("15474201621");
		aluno1.setNomeMae("Elizete Mendes Martins");
		aluno1.setNomePai("Wemerson da silva");
		aluno1.setDataMatricula("12/01/2012");
		aluno1.setNomeEscola("Escola estadual dom cabral");
		aluno1.setSerieMatriculado("8 ano ensino fundamental");
		
			
		System.out.println("Aluno 1 nome é = " + aluno1.getNome());
		System.out.println("Aluno 1 idade é = " + aluno1.getIdade());
		System.out.println("Aluno 1 a data de nascimento é  = " + aluno1.getDataNascimento());
		System.out.println("o RG do aluno 1 é = " + aluno1.getRegistroGeral());
			
		System.out.println("--------------------------------------------");	
		Aluno aluno2 = new Aluno(); /*pedro*/
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(28);
		aluno2.setDataNascimento("06/01/2003");
		
		System.out.println("Aluno 2 nome é = " + aluno2.getNome());
		System.out.println("Aluno 2 idade é = " + aluno2.getIdade());
		System.out.println("Aluno 2 a data de nascimento é  = " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno(); /*Alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose", 50);
		
	}

}
