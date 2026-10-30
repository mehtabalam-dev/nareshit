package collectionsPrograms;

public class GenericType 
{
	public static void main(String[] args) 
	{
		MyArray<String> obj = new MyArray<String>();
		obj.add("hii");
		System.out.println(obj);
	}
}
class MyArray<T>
{
	T value;
	public void add(T value)
	{
		System.out.println("Given value is : "+value);
	}
}
