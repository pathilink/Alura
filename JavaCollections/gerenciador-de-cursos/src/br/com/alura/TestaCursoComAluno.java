package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Patrícia");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Loro", 34672);
		Aluno a2 = new Aluno("Link", 5617);
		Aluno a3 = new Aluno("Don", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}
		
//		for(Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno loro = new Aluno("Loro", 34672);
		System.out.println("E esse aluno, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(loro));
		
		System.out.println("O a1 é equals ao loro");
		//System.out.println(a1 == loro);
		System.out.println(a1.equals(loro));
		
		// obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode() == loro.hashCode());
		
	}

}
