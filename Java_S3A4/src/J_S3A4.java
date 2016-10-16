//student result processing system
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Student
{
int rollno;
String name;
int number_of_subjects;
int mark[];

Student(int roll,String stud_name,int noofsub)throws IOException
{
rollno=roll;
name=stud_name;
number_of_subjects=3;
getMarks(noofsub);
}
public void getMarks(int nosub ) throws IOException
{
mark=new int[nosub];
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
for (int i=0; i<nosub;i++)
{
System.out.print("Enter Subject-"+(i+1)+" Marks.:=> ");
mark[i]=Integer.parseInt(br.readLine());
//System.out.println("");
}

}
public void calculateMarks()
{
double percentage=0;
String grade;
int tmarks=0;
for (int i=0;i<mark.length;i++)
{
tmarks+=mark[i];
}
percentage=tmarks/number_of_subjects;
System.out.println("\nRoll Number :=> "+rollno);
System.out.println("Name Of Student is :=> "+name);
System.out.println("Percentage Is :=> "+percentage);

if (percentage>=70)
System.out.println("Grade Is First Class With Distinction \n");
else if(percentage>=60 && percentage<70)
System.out.println("Grade Is First Class\n");
else if(percentage>=50 && percentage<60)
System.out.println("Grade Is Second Class\n");
else if(percentage>=40 && percentage<50)
System.out.println("Grade Is Pass Class\n");
else
System.out.println("You Are Fail\n");
}
}
class J_S3A4
{
public static void main(String args[])throws IOException
{
int rno,no,nostud=5; //no of students
String name;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
Student s[]=new Student[nostud];

System.out.print("Enter Student Details ");
for(int i=0;i<nostud;i++)
{
System.out.print("\nEnter Roll Number:=> ");
rno=Integer.parseInt(br.readLine());
System.out.print("Enter Name:=> ");
name=br.readLine();
no=3;//no of subjects
s[i]=new Student(rno,name,no);
}
for(int i=0;i<nostud;i++)
{
s[i].calculateMarks();
}

}
}

// Thank You