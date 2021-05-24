package app;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		List<Pessoas> pessoa = new ArrayList<>(100);
		
		Professor p1 = new Professor("jose","Recife",1);
		Professor p2 = new Professor("vanessa","Olinda",2);
		Professor p3 = new Professor("joao","paulista",3);
		
		Estudante e1 = new Estudante("fabricio", "Recife");
		Estudante e2 = new Estudante("amanda", "Olinda");
		Estudante e3 = new Estudante("davi", "paulista");
	
		Curso c1 = new Curso("Administração");
		Curso c2 = new Curso("Matematica");
		Curso c3 = new Curso("Programação");
		
	
		p1.addCurso(c1);
		p2.addCurso(c2);
		e1.addCursoNota("Administração", 7);
		e2.addCursoNota("Literatura", 8);
		
		
		System.out.println("Professor : "
		+ p1.getNome() + "\n" + "Curso : " + c1.getNome() + "\n"+ "Alunos: " + "\n" + "- "+ e1.getNome() 
		+ "\n" + "- " + e2.getNome());
		System.out.println();

		System.out.println("Professor : "
		+ p2.getNome() + "\n" + "Curso : " + c2.getNome() + "\n"+ "Alunos: " + "\n" + "- "+ e1.getNome() 
		+ "\n" + "- " + e2.getNome());
		System.out.println();
		
		System.out.println("Professor : "
				+ p3.getNome() + "\n" + "Curso : " + c3.getNome() + "\n"+ "Alunos: " + "\n" + "- "+ e1.getNome() 
				+ "\n" + "- " + e2.getNome() + "\n" + "- " + e3.getNome());
		
		
		
	}

}
