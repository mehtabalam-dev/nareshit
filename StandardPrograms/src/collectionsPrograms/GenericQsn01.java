package collectionsPrograms;

public class GenericQsn01 
{
	public static void main(String[] args)
	{
		StorageBox<Integer> b1 = new StorageBox<Integer>();
		b1.setItem(10);
		StorageBox<String> b2 = new StorageBox<>();
		b2.setItem("hii");
		System.out.println(b1+"\n"+b2);
	}
}
class StorageBox<T>
{
	private T item;

//	public StorageBox(T item) 
//	{
//		this.item = item;
//	}
	public void setItem(T newValue)
	{
		this.item = newValue;
	}
	public T getItem()
	{
		return item;
	}
	@Override
	public String toString() {
		return "StorageBox [item=" + item + "]";
	}
	
	
}