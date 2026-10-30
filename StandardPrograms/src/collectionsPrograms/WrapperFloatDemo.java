package collectionsPrograms;

public class WrapperFloatDemo
{
	public static void main(String[] args)
	{
		 // valueOf()
        float a = 25.5f;
        Float obj = Float.valueOf(a);
        System.out.println("valueOf: " + obj);

        // parseFloat()
        String str = "45.75";
        float b = Float.parseFloat(str);
        System.out.println("parseFloat: " + b);

        // floatValue()
        float c = obj.floatValue();
        System.out.println("floatValue: " + c);

        // isNaN()
        float x = 0.0f / 0.0f;
        System.out.println("Is NaN: " + Float.isNaN(x));

        // isInfinite()
        float y = 10.0f / 0.0f;
        System.out.println("Is Infinite: " + Float.isInfinite(y));
	}
}
