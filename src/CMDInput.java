import javax.swing.*;

public class CMDInput {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Programmet vet inte vad det ska göra! Avbryter...");
        }
        if (args.length == 1) {
            System.out.println("Så du säger:" + args[0]);
        }
        if (args.length == 2) {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        }
        if (args.length == 3) {
            for (int i = args.length; i > 0; i--) {
                System.out.println(args[i]);
            }
        }
        if (args.length == 4) {
            System.out.println("Jag orkar inte, jag stänger ner");
        }
        if (args.length > 4) {
            System.out.println("För många argument");
        }
    }
}
