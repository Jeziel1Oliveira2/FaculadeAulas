package ex1;

import ex1.num.numero;
import java.util.Scanner;
//https://goclass.gobyz.com/pluginfile.php/2339/mod_label/intro/PSC0000_AlgoritmosBasicosParaPraticar.pdf
//C005
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int number1 = scanner.nextInt();
        numero numero1 = new numero(number1);
        System.out.println("Seu numero é:" + numero1.getNum());
        System.out.println("Digite mais um numero");
        int number2 = scanner.nextInt();
        numero numero2 = new numero(number2);
        System.out.println("Seu numero é:" + numero2.getNum());
        if (numero1.getNum() % numero2.getNum() == 0 && numero2.getNum() % numero1.getNum() == 0){
            System.out.printf("%d e %d sao divisiveis entre si.\n", numero1.getNum(), numero2.getNum());
        }
        else if (numero1.getNum() % numero2.getNum() == 0){
            System.out.printf("%d edivisivel por %d.\n", numero1.getNum(), numero2.getNum());
        }
        else if (numero2.getNum() % numero1.getNum() == 0){
            System.out.printf("%d edivisivel por %d.\n", numero2.getNum(), numero1.getNum());
        }
        else {
            System.out.printf("%d e %d nao sao divisiveis entre si.\n", numero1.getNum(), numero2.getNum());
        }

    }
}