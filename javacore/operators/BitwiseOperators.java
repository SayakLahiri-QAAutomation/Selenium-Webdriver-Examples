package corejava.operators;

/**
 * Created by Maor on 5/23/2018.
 */

public class BitwiseOperators {

    public static void main(String[] args) {

        //64 32 16 8 4 2 1
        int num1 = 11; 	// 0  0  0 1 0 1 1
        int num2 = 21; 	// 0  0  1 0 1 0 1


		/*Bitwise operator performs bit by bit processing.
		num1 & num2 compares corresponding bits of num1 and num2 and generates 1
		if both bits are equal, else it returns 0. In our case it would return: 2
		which is 00000010 because in the binary form of num1 and num2 only second last
		 bits are matching.*/

        // 1 if both bits are equal else 0
        // 0  0  0 0 0 0 1 == output will be 1
        System.out.println(num1 & num2);

		/*num1 | num2 compares corresponding bits of num1 and num2 and generates 1
		if either bit is 1, else it returns 0. In our case it would return 31 which is 00011111*/

        // 1 if either bit is 1 else 0
        // 0  0  1 1 1 1 1 == output will be 31
        System.out.println(num1 | num2);


		/*num1 ^ num2 compares corresponding bits of num1 and num2 and generates 1
		if they are not equal, else it returns 0. In our example it would return 29
		which is equivalent to 00011101*/
        // 1 if both are not equal else 0
        // 0  0  1 1 1 1 0 == output will be 30
        System.out.println(num1 ^ num2);

		/*~num1 is a complement operator that just changes the bit from 0 to 1 and 1 to 0.
		In our example it would return -12 which is signed 8 bit equivalent to 11110100*/

        // 0 to 1 and 1 to 0
        // 1  1  1 0 1 0 0 == output will be 1
        System.out.println(~num1);


		/*As 2's complement of any number we can calculate by inverting all 1s to 0's and vice-versa than we add 1 to it..
		Here N= ~N produce results -(N+1) always. Because system store data in form of 2's complement which means it stores ~N like this.
		  ~N = -(~(~N)+1) =-(N+1). */

		/*num1 << 2 is left shift operator that moves the bits to the left, discards the far left bit, and assigns the rightmost bit a value of 0.
		In our case output is 44 which is equivalent to 00101100*/

        // 0  1  0 1 0 1 0 == output will be 1
        System.out.println(num1 << 2);


		/*Note: In the example below we are providing 2 at the right side of this shift operator
		that is the reason bits are moving two places to the left side.
		We can change this number and bits would be moved by the number of bits specified on the right side of the operator.
		Same applies to the right side operator.*/


		/*num1 >> 2 is right shift operator that moves the bits to the right, discards the far right bit, and assigns the leftmost bit a value of 0.
		In our case output is 2 which is equivalent to 00000010*/
        // 0  0  0 1 0 1 0 == output will be 1
        System.out.println(num1 >> 2);

    }
}
