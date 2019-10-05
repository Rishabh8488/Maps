import java.util.*;
class MapDemo
{
	public static void main(String arg[])
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Let us c","Yashwant Kanitkar");
		hm.put("Ansi c","Balaguruswamy");
		hm.put("Complete Ref.","Edwin");
		System.out.println("Books Name \t writer");
		Iterator it=hm.keySet().iterator();
		while(it.hasNext())
		{
			String key=(String)it.next();
			System.out.println(key+"\t\t"+hm.get(key));
		}
	}
}