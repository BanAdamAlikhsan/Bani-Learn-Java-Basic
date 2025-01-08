public class OperasiBoolean {
    public static void main(String[] args){


        var nilaiAbsen=50;
        var nilaiUlangan=90;


        boolean batasLulusAbsen = nilaiAbsen >=75;
        boolean batasLulusUlangan = nilaiUlangan >=80;

        var lulus= batasLulusAbsen && batasLulusUlangan;

        System.out.println(lulus);

    }

}
