//190. Reverse Bits
//Reverse bits of a given 32 bits signed integer.

class ReverseBits
{
	public static void main(String x[])
	{
		System.out.println(reverseBits(43261596));
	}
    public static int reverseBits(int n) 
	{
        int result = 0;

        for(int i = 0; i < 32; i++) {
            result = result << 1;      // shift result left
            result = result | (n & 1); // add last bit of n
            n = n >> 1;                // shift n right
        }

        return     ;
    }
}