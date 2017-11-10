package itbool;
/*定时器概述
		定时器是一个应用十分广泛的线程工具，可用于调度多个定时任务以后台线程的方式执行。
		在Java中，可以通过Timer和TimerTask类来实现定义调度的功能。
	B:Timer和TimerTask
		Timer:
			public Timer()
			public void schedule(TimerTask task, long delay):	
			public void schedule(TimerTask task,long delay,long period);
			public void schedule(TimerTask task,  Date time):
			public void schedule(TimerTask task,  Date firstTime, long period):
		TimerTask
			public abstract void run()
			public boolean cancel()
		开发中
			Quartz是一个完全由java编写的开源调度框架。
	C:案例演示:	定时器的使用

 */
public class Demo {
	
	public static void main(String[] args) {
		
		//创建线程对象
		MyThread mt=new MyThread("工厂1");
		
		mt.start();
	}

}
