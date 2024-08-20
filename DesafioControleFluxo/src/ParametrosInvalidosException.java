public class ParametrosInvalidosException extends Exception {
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }else{
            for (int i = parametro1; i <= parametro2; i++) {
                System.out.println(i);
            }
        }
    }
}