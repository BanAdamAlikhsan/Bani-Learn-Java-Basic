public class MethodRetrunValue {
    public static void main(String[] args) {

        var result1= sum(100,100);

        System.out.println(result1);

        System.out.println(perhitungan(200, "+", 500));

    }


    static int sum(int value1,int value2){

        var total =value1 + value2;

        return total;
    }


    static int perhitungan(int angka1, String operator, int angka2){

        switch (operator){
            case "+":
                return angka1 + angka2;
            case "-":
                return angka1 - angka2;
            default:
                return 0;
        }

    }
}

