public class TipeDataNumber{
    public static void main(String[] args){
        byte iniByte= 100; //bilangan bulat Range: -128 hingga 127.
        short iniShort= 32_767; //bilangan bulat Range: -32,768 hingga 32,767.
        int iniInt= 2_147_483_647; //bilangan bulat Range: -2,147,483,648 hingga 2,147,483,647.
        long iniLong= -9223372036854775808L; //Range: -9,223,372,036,854,775,808 hingga 9,223,372,036,854,775,807.


        //Tipe data number float

        float iniFloat= 4.3213f; //Tipe data float akhir nya harus di barengi f
        double iniDouble= 2.322131231d;
        int decimalInt= 34;





        System.out.println("Byte: " + iniByte);
        System.out.println("Short: " + iniShort);
        System.out.println("Int: " + iniInt);

        //Sout Float

        System.out.println("ini Float :" + iniFloat);
        System.out.println("ini Double :" + iniDouble);
        System.out.println("ini decimalInt :" + decimalInt);
    }
}
