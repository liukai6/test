package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Test {
	public static void main(String[] args) {
		try {
			write();
			read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void write() throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt");
		fos.write("Hello".getBytes());
		fos.write("Java".getBytes());
		fos.close();
	}

	public static void read() throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("fos.txt"));
		byte[] buffer = new byte[5];
		int len = 0;
		while ((len = bis.read(buffer)) != -1) {
			System.out.print(new String(buffer, 0, len));
		}
		bis.close();
	}
}
