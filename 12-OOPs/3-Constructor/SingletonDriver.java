/*Singleton Design Pattern*/

class Singleton
{
	private static Singleton s;
	
	private Singleton()
	{
	}
	
	public static Singleton getInstance()
	{
		if(s == null)
			s = new Singleton();
		return s;
	}
}
public class SingletonDriver
{
	public static void main(String x[])
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInst
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
		System.out.println(s2.hashCode());
	}

}