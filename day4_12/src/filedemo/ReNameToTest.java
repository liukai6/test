package filedemo;

import java.io.File;
import java.io.IOException;

/**
 * 1.我们的要求测试renameTo更改文件名
 * 
 * 
 * @author liuka
 *
 */

public class ReNameToTest {
	
	public static void main(String[] args) throws IOException {
		
		//创建File对象
		File file =new File("a.txt");
		System.out.println(file.mkdir());;
		
		
	}

}
