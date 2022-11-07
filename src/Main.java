import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Java Ifood");
        curso.setDescricao("Curso de java Oferecido pelo Ifood");
        curso.setCargaHoraria(90);

        mentoria.setTitulo("Java com SpringBoot");
        mentoria.setDescricao("Treinamento de java e spring");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Jornada Java");
        bootcamp.setDescricao("Aprenda Java na Pratica");
        bootcamp.getConteudos().add(curso);

        Dev devAugusto = new Dev();
        devAugusto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devAugusto.getConteudosinscritos());
        devAugusto.progredir();
        System.out.println("Conteudos Concluidos: " + devAugusto.getConteudosConcluidos());
        System.out.println("XP Total: " + devAugusto.calcularTotalXP());



    }
}