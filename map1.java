import java.util.*;
class MapDemo
{
	public static void main(String arg[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();		// First Value will be primary key.
		hm.put(101,"Yashwant Kanitkar");
		hm.put(102,"Balaguruswamy");
		hm.put(103,"Edwin");
		hm.put(104,"Deepak");
		System.out.println("Roll No.\twriter");
		Iterator it=hm.keySet().iterator();
		while(it.hasNext())
		{
			int roll=(int)it.next();
			System.out.println(roll+"\t\t"+hm.get(roll));
		}
		System.out.println("After invoking putall() method");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"\t\t"+m.getValue());
		}
	}
}