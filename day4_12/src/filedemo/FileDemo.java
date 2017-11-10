package filedemo;

import java.io.File;
import java.io.IOException;

/**
 * 1.练习File类的各种方法
 * 
 * public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
		public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
		public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
		public boolean renameTo(File dest):把文件重命名为指定的文件路径

 * @author liuka
 *
 */

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		
	
		
		//创建File对象
		File file=new File("a.txt");
		
		System.out.println(file.delete());
		
		//调用File方法
		System.out.println(file.createNewFile());
		
		File file1=new File("a");
		
		System.out.println(file1.mkdirs());
		
		File file2=new File("b//a//c//a.doc");
		
		System.out.println(file2.mkdirs());
		
		System.out.println(file2.getName());
		
		File dest=new File("c.txt");
		
		System.out.println(file2.renameTo(dest));
	}

}
