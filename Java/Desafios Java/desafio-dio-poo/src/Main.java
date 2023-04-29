import br.com.dio.desafio.dominio.*;

import javax.annotation.processing.SupportedSourceVersion;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Aprendendo java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Kotlin");
        curso1.setDescricao("Aprendendo Kotlin");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Aprendendo JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Ampliando suas habilidades em Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JavaDev");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devThiago.getConteudoInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("Conteúdos inscritos" + devThiago.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + devThiago.getConteudoConcluidos());
        System.out.println("XP: "+ devThiago.calcularTotalXp());
        System.out.println("---------------------------------- \n");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos inscritos" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + devCamila.getConteudoConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());
        System.out.println("---------------------------------- \n");




    }


}