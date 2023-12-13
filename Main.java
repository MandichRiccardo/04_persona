import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Persona p1 = new Persona("Riccardo", "Mandich", 17, "zfkdnbàsbidn");
        Persona p2 = new Persona(p1);
        output("p1:");
        p1.outPersona();
        output("p2:");
        p2.outPersona();
    }
    
    public static void output(String a){
        System.out.print(a+"\n");
    }
    public static int input(String a){
        output(a);
        int c = 0;
        Scanner scan = new Scanner(System.in);
        c = scan.nextInt();
        return c;
    }
    public static String strput(String a){
        output(a);
        String c = "";
        Scanner scan = new Scanner(System.in);
        c = scan.nextLine();
        return c;
    }
}
