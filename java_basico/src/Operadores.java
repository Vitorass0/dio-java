//package edu.Vitor.java_basico; estava assim, mas n tava pegando 
public class Operadores {
    public static void main(String[] args)  {
        int nota1 = 7;
        String resultado1 = nota1 >= 7 ? "Aprovado" : "Reprovado";
        // Operador ternário é uma forma simplificada de fazer um if else
        // O operador tenário é a mesma coisa disso: 
        // String resultado1;
        // if(nota1 >= 7) {
        //     resultado1 = "Aprovado";
        // } else {
        //     resultado1 = "Reprovado";
        // }

        System.out.println("Primeiro exemplo: "+resultado1);

        int nota2 = 4;
        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2>=5 && nota2<7 ? "Recuperação" : "Reprovado";

        System.out.println("Segundo exemplo: "+resultado2);
    }
}