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
 * 		1.��E:\\danji��F:\\danji��װ��һ��File����
 * 		2.����listFiles()������ȡĿ¼�����е��ļ������ļ��ж�������
 * 		3.����File����,��ȡÿһ���ļ�����
 * 		4.������Ч���ֽ�������������ȡ����
 * 		5.������Ч���ֽ����������д������
 * 		6.Ƶ���Ķ�д����
 * 		7.�ر�������
 
 * 
 */
public class Test31 {
	
	public static void main(String[] args) throws IOException {
		
		//����Դ�ļ�file����
		File yuandir=new File("d://a");
		File mudir=new File("d://b");
		
		copy(yuandir, mudir);
		//������Ч������������
	}

	public static void copy(File yuandir, File mudir) throws FileNotFoundException, IOException {
		//�ж�Ŀ���ļ����Ƿ����
		if(!mudir.exists()) {
			
			mudir.mkdir();
		}
		
		File[] file = yuandir.listFiles();
		//����Դ�ļ���
		for (File file2 : file) {
			if(file2.isFile()){
			
				copy(file2, new File(mudir, file2.getName()));
			}else{
				BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file2));
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(mudir));
				
				//��д����
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
