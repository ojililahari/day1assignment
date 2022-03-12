
public class q3{

		import java.util.Arrays;



		class ArrayOp{
			
			public static int[] copyOf(int[] array) {
				return Arrays.copyOf(array, array.length);
			}
			
		}
		public class assignq3 {

			public static void main(String[] args) {

				int arr[]= {4,5,6,7,67};
				
				int copyOfArr[]=ArrayOp.copyOf(arr);
			}
		}




