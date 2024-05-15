package sorting;

import java.io.File;

public class Deletefiles {

	public static void main(String[] args) {
		System.out.println("deleting files started");
		File file=new File("C:\\com");
		deletefile(file);
		System.out.println("deletng files completed");
	}
	protected  static void deletefile(File file)
	{
		if(file.exists() && file.isDirectory())
		{
			File[] files=file.listFiles();
			for(File fil:files) {
				if(fil.isDirectory())
					deletefile(fil);
				else if(!fil.getName().endsWith(".jar"))
				{
					fil.delete();				
					}
			}
			}
	}

}
