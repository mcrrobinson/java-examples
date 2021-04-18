import java.util.Scanner;

public class ConsoleEvents {
    public String getString(String prompt){
        Scanner in = new Scanner(System.in);
        String s;
        out(prompt);
        try {
            s = in.next();
        } catch (Exception e){
            return getString(prompt);
        }
        return s;
    }

    public int getInt(String prompt){
        Scanner in = new Scanner(System.in);
        int i;
        out(prompt);
        try {
            i = in.nextInt();
        } catch (Exception e){
           //extra messages 
           return getInt(prompt);
        }
        return i;
    }
    public void out(String message){ System.out.println(message);}
    public void out(int message){ System.out.println(message);}
}