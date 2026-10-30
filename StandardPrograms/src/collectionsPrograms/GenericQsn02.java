package collectionsPrograms;

public class GenericQsn02
{
	public static void main(String[] args)
	{
		Display<Integer> marks = new Display(85);
		Display<String> name = new Display("Ubiadullah");
		Display<Double> productPrice = new Display(499.50);
		System.out.println("Name   :"+name);
		System.out.println("Marks  :"+marks);
		System.out.println("Product Price : "+productPrice);
		System.out.println("Retrieved price : "+productPrice.getValue());


	}
}
class Display<T>
{
	private T value;

	public Display(T value) 
	{
		this.value = value;
	}
	public void setValue(T newValue)
	{
		this.value = newValue;
	}
	public T getValue()
	{
		return value;
	}
	@Override
	public String toString() {
		return "" + value + "";
	}
	
}
