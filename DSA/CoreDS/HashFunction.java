package GitCode.DSA.CoreDS;

public class HashFunction {
    public static void main(String[] args) {
        System.out.println(hashFunction("102334"));
    }

    static int hashFunction(int number)
    {
        return number%100;
    }

    static int hashFunction(String code)
    {
        int num=0;
        for (char ch:code.toCharArray()
             ) {
            num+=ch;
        }
        return num%100;
    }
}
