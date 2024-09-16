import java.util.Scanner;
public class Switchlab{

    public static void mais(String[] args){
    int opcao;
    Scanner leitorOpcao = new Scanner(System.in);
    System.out.println(x:"1 - Pastel de carne \n");
    System.out.println(x:"2 - Coxinha de frango \n");
    System.out.println(x:"3 - Kibe com queijo \n");
    System.out.print(s:"Escolha uma opção: ");
    opcao = leitorOpcao.nextInt();
    switch(opcao)
    {
        case 1:
        System.out.println(" Pastel de carne escolhido.");
        break;
        case 2:
        System.out.println(" Coxinha de frango escolhida.");
        break;
        case 3:
        System.out.println(" Kibe com queijo .");
        break;
        default:
        System.out.println("Opção invalida!");
        break;
        }
    }
}