package threadCommunication;

import java.io.*;
public class FileDemo {

	public static void main(String[] args) {
		File f = new File("/Users/houomoiyuan/Documents/1.txt");
		if (f.exists())
		{
			f.delete();
		}
		else
		{
			try
			{
				f.createNewFile();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("Filename: "+f.getName());
		System.out.println("Path: "+f.getPath());
		System.out.println("Absolute Path: "+f.getAbsolutePath());
		System.out.println("Parent Path: "+f.getParent());
		System.out.println(f.exists()? "Yes":"No");
		System.out.println("Last Modified Time: "+f.lastModified());
	}

}
