import java.util.*;
public class gradecalculator{
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the no.of subjects");
        int number_of_sub=ip.nextInt();
        float total=0;
        String grade="";
        float sub[]=new float[number_of_sub];
        for(int i=1;i<=number_of_sub;i++)
        {
            System.out.println("Enter the mark of subject "+i+" ");
            sub[i-1]=ip.nextInt();
        }
        for(int j=0;j<number_of_sub;j++)
        {
            total+=sub[j];
        }
        float avg_percentage=total/number_of_sub;
        if(avg_percentage>90.0 && avg_percentage<=100.0)
        {
            grade="O";
        }
        else if(avg_percentage>80.0 && avg_percentage<=90.0)
        {
            grade="A+";
        }
        else if(avg_percentage>70.0 && avg_percentage<=80.0)
        {
            grade="A";
        }
        else if(avg_percentage>60.0 && avg_percentage<=70.0)
        {
            grade="B+";
        }
        else if(avg_percentage>50.0 && avg_percentage<=60.0)
        {
            grade="B";
        }
        else if(avg_percentage>40.0 && avg_percentage<=50.0)
        {
            grade="C+";
        }
        else
        {
            grade="F";
        }
        System.out.println("The total marks of the user is : "+total);
        System.out.println("The average percentage is : "+avg_percentage);
        System.out.println("The grade of the user is : "+grade);
        ip.close();
    }
}