package csvmanipulate;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;


public class csv2 {

	public static double sum=0;
	
	public static void main(String[] args)
	{
		//prompt to input the number to be calculated
		System.out.print("please input the numbers of the array:");
		Scanner preread=new Scanner(System.in);
		int count=preread.nextInt();
		preread.close();
		double[] ar=new double[count];
		double thesum=func(ar,count);
		
		System.out.println("the sum is:"+thesum);
		//start read file
	
	}
	
	static double func(double[] arr,double count)
	{
		try{
			
			String buf=null;	//store the line returned
			BufferedReader in=new BufferedReader(new FileReader("csvfile.csv"));
			buf=in.readLine();
			int i;
			for(i=0;i<count&buf!=null;i++)
				{
					
					String[] temp=buf.split(",");
//					sum+=Double.parseDouble(temp[0]);
					arr[i]=Double.parseDouble(temp[0]);
					buf=in.readLine();
								
				}
			if(i<count) System.out.println("you encounter the file end, there isn't so many numbers");
			//calculate the sum
			for(int j=0;j<i;j++)
			{
				sum+=arr[j];
			}
			in.close();
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return sum;
	}
}
