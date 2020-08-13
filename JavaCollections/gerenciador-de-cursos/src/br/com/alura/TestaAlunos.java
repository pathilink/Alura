package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
//		Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		alunos.add("Link");
		alunos.add("Loro");
		alunos.add("Loro1");
		alunos.add("Loro2");
		
		boolean patEstaMatriculada = alunos.contains("Patrícia");
		alunos.remove("Loro2");
		System.out.println(patEstaMatriculada);
		
		System.out.println(alunos.size());
		
		alunos.add("Loro");
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);	
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
		

	}

}
