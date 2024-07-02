import java.util.Random;
//import java.util.Scanner;
public class data{
    public static void main(String[] args){
        Random rnd = new Random();
        String[] coin = new String[3];
        int head = 0,tail = 0;
        /*System.out.println("Who are you?");
        System.out.print(">");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println("Hello," +a+"!");*/

        for(int i=0;i<3;i++){
            rnd = new Random();
            if(rnd.nextInt(10)%2==0){
                coin[i] = "Heads";
                head++;
            }
            else{
                coin[i] = "Tails";
                tail++;
            }
        }
        System.out.println("Tossing a coin...");
        for(int i = 0;i<3;i++){
           
            System.out.println("Round" +i+":"+coin[i]);
        }
         System.out.println("Heads:"+head+"," +"Tails:"+tail);
         if(head >= 2)  System.out.println("You won!");
         else{
             System.out.println("You lose!");
         }
    }
}