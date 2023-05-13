import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner (System.in);

System.out.println("Insira sua altura");
double altura = teclado.nextDouble();

double PesoIdeal = (72.7*altura) - 58;

System.out.printf("O seu peso Ideal é %.2f",PesoIdeal);


    }
}
