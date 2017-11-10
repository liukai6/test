package ThreadDemo;

class Test {
public static void main (String[] args) {
MyThread t1 = new MyThread("t1");
MyThread t2 = new MyThread("t2");
t1.start();
t2.start();
}
}
class MyThread extends Thread {
public MyThread (String s) {
super( s );
}
public void run() {
for (int i =0; i<10; i++) {
try {
sleep( 1000 );
} catch (Exception e) { }
System.out.println( getName() );
}
}
}
