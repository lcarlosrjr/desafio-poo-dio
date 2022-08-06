import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso();
        c1.setTitulo("Curso de Java");
        c1.setDescricao("Descrição curso de java");
        c1.setCargaHoraria(8);

        Curso c2 = new Curso();
        c2.setTitulo("Curso de Javascript");
        c2.setDescricao("Descrição curso de Javascript");
        c2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(c1);
        bootcamp1.getConteudos().add(c2);
        bootcamp1.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Irineu");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Irineu: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Irineu: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Irineu: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXo());

        System.out.println("-----------");

        Dev dev2 = new Dev();
        dev2.setNome("Joaquim");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Joaquim: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joaquim: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joaquim: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXo());
    }
}
