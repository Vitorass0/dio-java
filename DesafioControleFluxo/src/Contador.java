import java.util.Scanner;
public class Contador extends ParametrosInvalidosException {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o primeiro parâmetro: ");
       int parametro1 = teclado.nextInt();
       System.out.println("Digite o segundo parâmetro: ");
       int paremetro2 = teclado.nextInt();

       try{
        contar(parametro1, paremetro2);
       }catch(ParametrosInvalidosException e){
        System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
       }
      
    }   
}
