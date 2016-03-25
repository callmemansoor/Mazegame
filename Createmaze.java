import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class Createmaze {

	public static void main(String args[]) throws IOException
	   {
		
		
		try{
		
		LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("CreateMaze.txt")));
		lnr.skip(Long.MAX_VALUE);
		int linecount=lnr.getLineNumber();
		lnr.close();
		
		FileReader fr = new FileReader("CreateMaze.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		String lines;
		String[][] maze=new String[linecount][5];
		int i=0;	
		String a[]=new String[5];
		while(i<linecount)
		{
			lines=br.readLine();
			a=lines.split(" ");
			
			
			maze[i][0]=a[0];
			maze[i][1]=a[1];
			maze[i][2]=a[2];
			maze[i][3]=a[3];
			maze[i][4]=a[4];
			
			
			i++;
		}	
		
				
		
		
		LineNumberReader  lnr2 = new LineNumberReader(new FileReader(new File("TraverseMaze.txt")));
		lnr2.skip(Long.MAX_VALUE);
		int linecount2 = lnr2.getLineNumber()+1;
		lnr2.close();
		
		FileReader fr2 = new FileReader("TraverseMaze.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		//BufferedWriter writer = new BufferedWriter(new FileWriter("Destinations.txt"));
		PrintWriter out = new PrintWriter("Destinations.txt");
		
		
		String[] b;
		String line3;
		//f=b.length();
		//String D[]=new String[linecount2];
		
		int j;
		
		
		for(j=0;j<linecount2;j++)
		{
			
			line3=br2.readLine();
			if(line3!=null){
			b=line3.split(" ");
			
			String l=b[0];
			for(int w=1;w<b.length;w++){
			       
				
				int m = Integer.parseInt(l);
				String p=maze[m-1][1];
				String q=maze[m-1][2];
				String r=maze[m-1][3];
				String t=maze[m-1][4];
				
				
				    if(b[w].equals("0") && !"0".equals(p)){
					    l=maze[m-1][1];}
					else if(b[w].equals("1") && !"0".equals(q)){
						l=maze[m-1][2];}
					else if(b[w].equals("2") && !"0".equals(r)){
					    l=maze[m-1][3];}
					else if(b[w].equals("3") && !"0".equals(t)){
						l=maze[m-1][4];}
				
				    
				}
			 out.println(l);
			//writer.write(l+"\n");
		    System.out.println(l);
			}
            
		    // D[j]=l;
		    
			}
				

		
		fr2.close();
		
		fr.close();
		out.close();
		//writer.close();
		
		}
	   
		catch(Exception e){}
		
		
	   
		
	   }
		
	}

