import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(mentoria);
    }
}
