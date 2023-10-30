
import com.mycompany.operacionesaritmeticas.OperacionesAritmeticas;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class TipoOperacionesAritmeticasImpl extends OperacionesAritmeticas {
    public class TipoProblemaAritmetico {
    static int tipoProblema;
    static{
        Random random = new Random();
        tipoProblema = random.nextInt(5) + 1;
        
    }
    public static int getTipoProblema() {
        return tipoProblema;
    }
    public static void main(String[] args) {
        int tipoProblemaActual = getTipoProblema();
        System.out.println("Tipo de problema aritmetico: " + tipoProblemaActual);
    }

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        String[] operations = {"suma", "resta", "multiplicacion", "divicion"};
        int num1 = random.nextInt(100) +1;
        int num2 = random.nextInt(100) +1;
        String operation = operations[random.nextInt(operations.length)];
        
        switch (operation){
            case "suma":
                System.out.println(num1 + " + " + num2 + " = ?");
                break;
            case "resta":
                System.out.println(num1 + " - " + num2 + " = ?");
                break;
            case "multiplicacion":
                 System.out.println(num1 + " * " + num2 + " = ?");
                break;
            case "división":
            if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = ?");
                } else {
                    System.out.println("No se puede dividir por cero. Por favor, intente de nuevo.");
                }
                break;
        
        }
    }
}
    }
}


