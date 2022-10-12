import java.util.Scanner;

public class RecursiveDesen {

    static boolean state=true;
    static int counter=0;
    public static int desen(int x)
    {

        if(state==true && x>0)
        {
            System.out.print(x+" ");
            x-=5;
            counter++;
            return desen(x);
        }
        else
        {
            state=false;

            counter--;
            System.out.print(x+" ");
            x+=5;
            if(counter==0)
            {
                System.out.print(x);
                return 1;
            }
            else
            {
                return desen(x);
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int no = in.nextInt();
        int no2=no;

        desen(no);
    }
}