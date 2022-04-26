import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso de Java Script");
        curso2.setCargaHoraria(12);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java e sua descrição");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMateus = new Dev();
        devMateus.setNome("Camila");
        devMateus.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos" + devMateus.getConteudosInscritos());

        devMateus.progredir();

        System.out.println("Conteúdos Concluidos" + devMateus.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos" + devMateus.getConteudosInscritos());
        System.out.println("XP: " + devMateus.calcularXpTotal());


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos: " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devMateus.calcularXpTotal());



    }
}
