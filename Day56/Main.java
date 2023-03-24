package Day56;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)

    {

        Scanner s = new Scanner(System.in);

        int flag = -1;

        System.out.print("Enter no. of employees present in the company : ");

        int n = s.nextInt();

        String[] namesarr = new String[n];

        long[] phonearr = new long[n];

        for (int i = 0; i < n; i++)

        {

            System.out.print("Enter employee " + (i + 1) + "'s name : ");

            String name = s.nextLine();

            System.out.print("Enter employee " + (i + 1) + "'s phone number : ");

            long phone = s.nextLong();

            namesarr[i] = name;

            phonearr[i] = phone;

        }

        System.out.print("Enter a phone number whose name should be printed : ");

        long numbercheck = s.nextLong();

        for (int j = 0; j < n; j++)

        {

            if (phonearr[j] == numbercheck)

            {

                flag = j;

            }

        }

        if (flag == -1)

        {

            System.out.print("There is no employee found with that phone number");

        }

        else

        {

            System.out.print("Employee whose phone number is " + numbercheck + ", is " + namesarr[flag]);

        }
        s.close();
    }

}