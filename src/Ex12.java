import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws Exception {
        double peso;
        double altura;    
    Scanner reader = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
            altura = reader.nextDouble();
                reader.close();

            peso = (72.7 * altura) - 58;
        System.out.println("O seu peso ideal é: " + peso);
    }
}
