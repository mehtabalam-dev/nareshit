package collectionsPrograms;

public class WrapperClass 
{
	public static void main(String[] args)
	{
//
//        int a = 100;
//
//        Integer obj = Integer.valueOf(a);
//
//        System.out.println(obj);
		
//        String s = "500";
//
//        int num = Integer.parseInt(s);
//
//        System.out.println(num);
		
        Integer obj = Integer.valueOf(100);

        int num = obj.intValue();

        System.out.println(num);
	}
}
