package ex2;

import ex2.Pessoa.User;
import java.util.Scanner;
//https://goclass.gobyz.com/pluginfile.php/2339/mod_label/intro/PSC0000_AlgoritmosBasicosParaPraticar.pdf
//C028
public class PlanoSaude {
    public static void main(String[] args) {
        //criando scanner
        Scanner scanner = new Scanner(System.in);

        // criando um novo usuario e mostrando sua idade e seu nome
        System.out.println("Digite seu nome:");
        String nome1 = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade1 = scanner.nextInt();
        User user = new User(nome1, idade1);
        System.out.println("Seu nome é " + user.getNome() + " e a sua idade é " + user.getIdade());

        /*
        if (user.getIdade() <= 10){
            System.out.println("A pessoa chamada " + user.getNome() + " terá que pagar R$30,00");
        } else if (user.getIdade() <= 29) {
            System.out.println("A pessoa chamada " + user.getNome() + " terá que pagar R$90,00");
        } else if (user.getIdade() <= 45) {
            System.out.println("A pessoa chamada " + user.getNome() + " terá que pagar R$120,00");
        } else if (user.getIdade() <= 59) {
            System.out.println("A pessoa chamada " + user.getNome() + " terá que pagar R$120,00");
        } else if (user.getIdade() <= 65) {
            System.out.println("A pessoa chamada " + user.getNome() + " terá que pagar R$120,00");
        } else {
            System.out.println("A pessoa chamada " + user.getNome() + " terá que pagar R$400,00");
        }
        */

        //criando array
        double [] precos = {30, 90, 120, 130, 400};

        //fazendo o calculo dos precos em relaçao a idade
        int idadepreco = Math.min(user.getIdade() / 15, precos.length - 1);

        //imprimindo o nome e dizendo o qanto ela terá que pagar
        System.out.println("A pessoa chamada " + user.getNome() + " terá que pagar R$" + precos[idadepreco]);

        //fechando o scanner
        scanner.close();
    }
}
