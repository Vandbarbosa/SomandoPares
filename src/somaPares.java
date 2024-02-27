import java.util.Scanner;

public class somaPares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero=0;
        int qtdPares=0;
        int count=0;
        int qtdNumeros;

        do {
            System.out.println("Digite um número: ");
            numero=scan.nextInt();

            if (numero%2==0) { qtdNumeros=numero;
                
                for (int i = 1; i <= qtdNumeros/2; i++) { qtdPares= qtdPares +2*i;
                    
                }
                
                System.out.println(qtdPares);

              
            } else { System.out.println("Entrada invalida");
                
            }
            
        } while (count>0);
        
        



       
    }

}