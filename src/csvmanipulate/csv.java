package csvmanipulate;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;


public class csv {

	public static double sum=0;
	public static double[] arr=new double[100];
	public static void main(String[] args)
	{
		try{
		String buf=null;
		BufferedReader in=new BufferedReader(new FileReader("csvfile.csv"));
		int count=100;
		for(int i=0;i<count;i++)
			{
				buf=in.readLine();
				String[] temp=buf.split(",");
//				sum+=Double.parseDouble(temp[0]);
				arr[i]=Double.parseDouble(temp[0]);
			}
		
		for(int i=0;i<100;i++)
		{
			sum+=arr[i];
		}
		in.close();
		System.out.println("the sum is:"+sum);
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
	}
	
	
}
