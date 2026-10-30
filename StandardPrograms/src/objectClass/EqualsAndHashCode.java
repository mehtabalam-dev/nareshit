package objectClass;

import java.util.Objects;

public class EqualsAndHashCode
{
  public static void main(String[] args)
 {
	  
	  StringBuilder sb1 = new StringBuilder("Hi");
	  StringBuilder sb2 = new StringBuilder("Hi");
	  
	  System.out.println(sb1.hashCode());
	  System.out.println(sb2.hashCode());
	  System.out.println(sb1.hashCode() == sb2.hashCode());
	
		String s = new String("name");
		String s1 = new String("name");
		
		IO.println(s.hashCode());
		IO.println(s1.hashCode());
	  
//	  A a = new A(101);
//	  A a1 = new A(101);
//	  
//	  IO.println(a.hashCode());
//		IO.println(a1.hashCode());
		
}
}
//
//class A
//{
//	String name;
//	int id;
//	
//	public A(int id)
//	{
////		this.name = name;
//		this.id = id;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(Integer.valueOf(id));	
//	}
////
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		A other = (A) obj;
//		return id == other.id;
//	}
	
//	@Override
//	public int hashCode()
//	{
//		return id.hashCode();
//	}
}

