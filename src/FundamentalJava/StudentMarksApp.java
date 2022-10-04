package FundamentalJava;
import java.util.*;
public class StudentMarksApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("| Student Result Application |");
		System.out.println("----------------------------");
		System.out.println("Enter the Number of Subjects:");
		int len=sc.nextInt();
		int marks[]=new int[len];
		//this for loop is read the marks based on the array size(subjects)
		for(int pos=0;pos<len;pos++)
		{
			System.out.println("Enter the Marks:");
			//assign the values to marks array in runtime 
			marks[pos]=sc.nextInt();
		}
		//display the marks of student
		System.out.println("Marks are: ");
		for(int pos=0;pos<len;pos++)
		{
			System.out.println(marks[pos]);
		}
int total=0;
//display the total marks
for(int pos=0;pos<len;pos++)
{
	total=total+marks[pos];
}
System.out.println("Total Marks is: "+total);

//display the average marks
float avg=total/len;
System.out.println("The Average Marks is: "+avg);
//find the max and min marks of given marks
//assign default max and min is zero
int max=marks[0];
int min=marks[0];
//this for loops will find the max and min marks
for(int pos=0;pos<len;pos++)
{
	if(marks[pos]>max)
	{
		max=marks[pos];
	}
	else if(marks[pos]<min)
	{
		min=marks[pos];
	}
}
System.out.println("Max Marks is: "+max);
System.out.println("Min Marks is: "+min);

//display the marks in ascending order
//here i called the sort() inbuilt to do the sorting of elements
Arrays.sort(marks);
//toString() which can return its own object format i.e array format.
System.out.println("Marks are Displaying in Ascending Order:");
System.out.println(Arrays.toString(marks));
	}

}