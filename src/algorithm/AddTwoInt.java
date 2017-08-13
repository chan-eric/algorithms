package algorithm;

//without using +
public class AddTwoInt {

	public static void main(String args[]) {
		AddTwoInt sol = new AddTwoInt();
		
		int num = sol.getSum(20, 30);
		System.out.println(num);
	}
	
	public int getSum(int a, int b) {
        int sum = 0;
        int carry = 0;
        int i = 0;
        while (!(a==0 && b==0 && carry==0)) {
            
            int a0 = a%2;
            int b0 = b%2;
            
            int xor = a0^b0^carry;
            carry = getCarry(a0, b0, carry);
            sum = sum ^ powertwo(xor, i);
            
            i++;
            a=a/2;
            b=b/2;
        }
        
        return sum;
    }
    
    private int getCarry(int a0, int b0, int carry) {
        if (a0==1 && b0==1 || a0==1 && carry==1 || b0==1 && carry==1) {
            return 1;
        }
        return 0;
        
    }
    
    private int powertwo(int num, int n) {
        int sum = num;
        if (num==0) return 0;
        if (n==0) return 1;
        for (int i=0; i<n; i++) {
            sum = sum * 2;
        }
        return sum;
    }
}
