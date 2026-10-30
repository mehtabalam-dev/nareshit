package binaryOrTypePromotionExample;
/*
 * boolean does not participate in type promotion because it is not a numeric data type.
 *  Type promotion applies only to numeric primitive types 
 *  (byte, short, char, int, long, float, and double).
 *   Since boolean represents only true or false, arithmetic operations
 *    such as +, -, *, and / are not allowed on it.
 */
public class BooleanExample {
	public static void main(String[] args) {
		System.out.println(true && true);   // true
		System.out.println(true || false);  // true
		System.out.println(true ^ false);   // true (XOR)
		System.out.println(!true);          // false
		
		
//		1. AND (&&)

//		Returns true only if both operands are true.
		
	
		System.out.println(true && true);    // true
		System.out.println(true && false);   // false
		System.out.println(false && true);   // false
		System.out.println(false && false);  // false
		
		int age = 20;
		boolean hasLicense = true;

		System.out.println(age >= 18 && hasLicense); // true
		
//		2. OR (||)

//		Returns true if at least one operand is true
		System.out.println(true || true);    // true
		System.out.println(true || false);   // true
		System.out.println(false || true);   // true
		System.out.println(false || false);  // false
		
		boolean isAdmin = false;
		boolean isManager = true;

		System.out.println(isAdmin || isManager); 
		// true  ,If the user is an admin or a manager, allow access.
		
//		3. NOT (!)
//
//		Reverses the boolean value.
		
		
		System.out.println(!true);   // false
		System.out.println(!false);  // true
		
		boolean isLoggedIn = false;

		System.out.println(!isLoggedIn); // true
		
		
		
//		4. XOR (^)
//
//		Returns true only when the values are different.
//		"Exactly one should be true."
		
		System.out.println(true ^ true);     // false
		System.out.println(true ^ false);    // true
		System.out.println(false ^ true);    // true
		System.out.println(false ^ false);   // false
		
		System.out.println("Hello"+true);
//		System.out.println('A'+true);CTE
		
	}
}
