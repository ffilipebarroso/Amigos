import java.util.*;

public class Amigos {
    
    public static void main (String[]args) {
        
        Amigo amigo1 = new Amigo("estephane", "mk", "22");
        Amigo amigo2 = new Amigo("jefersson", "tedesca", "24");
        Amigo amigo3 = new Amigo("filipe", "santo", "22");
        
        System.out.println("digite o nome de um amigo meu. estephane, jeferson ou filipe : ");

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        scanner.close();
        
        if (nome.equals("estephane")) {
            System.out.println(amigo1);
        }else if (nome.equals("jefersson")){
            System.out.println(amigo2);
        }else if (nome.equals("filipe")){
            System.out.println(amigo3);
        }else {
            System.out.println("não reconheço esse nome");
        }
    
    }
}