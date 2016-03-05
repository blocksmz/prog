package csvmanipulate;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;


public class csv3 {

	public static double sum=0;
	
	public static void main(String[] args)
	{
		//prompt to input the number to be calculated
		System.out.print("please input the numbers of the array:");
		Scanner preread=new Scanner(System.in);
		int count=preread.nextInt();
		System.out.print("input the max value you would like it to be:");
		double nummax=preread.nextDouble();
		System.out.println("");
		System.out.print("input the min value you would like it to be:");
		double nummin=preread.nextDouble();
		preread.close();
		
		double[] arr=new double[count];
		double thesum=func(arr,nummax,nummin,count);
		
		System.out.println("the sum is:"+thesum);
		//start read file
	
	}
	
	static double func(double[] arr,double maxnum, double minnum,double count)
	{
		try{
			String buf=null;	//store the line returned
			BufferedReader in=new BufferedReader(new FileReader("csvfile.csv"));
			buf=in.readLine();
			int i;
			for(i=0;i<count&buf!=null;)
				{
					
					String[] temp=buf.split(",");
//					sum+=Double.parseDouble(temp[0]);
					double buf2=Double.parseDouble(temp[0]);
					if(buf2>=minnum&buf2<=maxnum)	//judge the value range
					{
						arr[i]=buf2;
						i++;
					}
					
					buf=in.readLine();
								
				}
			if(i<count) System.out.println("there isn't so many numbers");
			
			//calculate the sum
			for(int j=0;j<i;j++)
			{
				sum+=arr[j];
			}
			in.close();
			System.out.println(sum);
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
