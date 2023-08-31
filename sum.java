import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a;
        int b=1;
        int c=1;
        int d=1;
        int total=1;
        System.out.println("Please write a multi-dijit number: ");
        a=input.nextInt();

        if(a<10){
            System.out.println("You should write multi-dijit number!");
        }
        else if(a>=10 && a<100){
                
                b=a/10;
                b=b*10;
                b=a-b;
                // b is the ones digit
                
                c=a/10;
                // c is the tens dijit
                total=b+c;
                System.out.println(total);
        }
        else if(a>=100 && a<1000){
                
                b=a/10;
                b=b*10;
                b=a-b;
                // b is the ones digit
                
                c=a/100;
                c=c*100;
                c=a-c;
                c=c/10;
                // c is the tens dijit
                
                d=a/100;
                //d is the hundreds dijit
                
                total=b+c+d;
                System.out.println(total);
        }
            
        }

    }
