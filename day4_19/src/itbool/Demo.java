package itbool;
/*��ʱ������
		��ʱ����һ��Ӧ��ʮ�ֹ㷺���̹߳��ߣ������ڵ��ȶ����ʱ�����Ժ�̨�̵߳ķ�ʽִ�С�
		��Java�У�����ͨ��Timer��TimerTask����ʵ�ֶ�����ȵĹ��ܡ�
	B:Timer��TimerTask
		Timer:
			public Timer()
			public void schedule(TimerTask task, long delay):	
			public void schedule(TimerTask task,long delay,long period);
			public void schedule(TimerTask task,  Date time):
			public void schedule(TimerTask task,  Date firstTime, long period):
		TimerTask
			public abstract void run()
			public boolean cancel()
		������
			Quartz��һ����ȫ��java��д�Ŀ�Դ���ȿ�ܡ�
	C:������ʾ:	��ʱ����ʹ��

 */
public class Demo {
	
	public static void main(String[] args) {
		
		//�����̶߳���
		MyThread mt=new MyThread("����1");
		
		mt.start();
	}

}
