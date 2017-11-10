package writer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 		1.将E:\\danji和F:\\danji封装成一个File对象
 * 		2.调用listFiles()方法获取目录下所有的文件或者文件夹对象数组
 * 		3.遍历File数组,获取每一个文件对象
 * 		4.创建高效的字节输入流用来读取数据
 * 		5.创建高效的字节输出流用来写入数据
 * 		6.频繁的读写操作
 * 		7.关闭流对象
 
 * 
 */
public class Test31 {
	
	public static void main(String[] args) throws IOException {
		
		//创建源文件file对象
		File yuandir=new File("d://a");
		File mudir=new File("d://b");
		
		copy(yuandir, mudir);
		//创建高效的输入流对象
	}

	public static void copy(File yuandir, File mudir) throws FileNotFoundException, IOException {
		//判断目标文件夹是否存在
		if(!mudir.exists()) {
			
			mudir.mkdir();
		}
		
		File[] file = yuandir.listFiles();
		//遍历源文件夹
		for (File file2 : file) {
			if(file2.isFile()){
			
				copy(file2, new File(mudir, file2.getName()));
			}else{
				BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file2));
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(mudir));
				
				//读写操作
				byte [] by=new byte[1024];
				int len=0;
				while((len=bis.read(by))!=-1){
					bos.write(by,0,len);
					bos.flush();
				}
				bos.close();
				bis.close();
	}
	}	
	}
}
