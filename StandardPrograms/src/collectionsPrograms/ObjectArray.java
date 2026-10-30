package collectionsPrograms;

import java.util.Arrays;

public class ObjectArray 
{
	public static void main(String[] args)
	{
		MyArray1<Integer> obj = new MyArray1<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		System.out.println(obj);
		
	}
}
class MyArray1<T>
{
	public T [] arr = (T[]) new Object[5];
	public int index = 0;
	public void add(T value)
	{
		if(index<arr.length)
		{
			arr[index] = value; 
			index++;
		}
		else
		{
			int newCapacity = arr.length * + 2;
			T[] newArr = (T[]) new Object[newCapacity];
			for(int i = 0; i < arr.length; i++)
			{
				newArr[i] = arr[i];
			}
			arr = newArr;
			arr[index] = value;
			index++;
		}
		
	}
	@Override
	public String toString() {
		return "MyArray1 [arr=" + Arrays.toString(arr) + ", index=" + index + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}