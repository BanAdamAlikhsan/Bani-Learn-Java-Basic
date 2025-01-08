public class SwitchLambda {
    public static void main(String[] args){


        //BERIKT ADALAH SWITCH LAMBDA
        var nilai=60;

        switch (nilai){
            case 100 -> System.out.println("Nilai Anda Sangat Baik");
            case 80, 90 -> System.out.println("Nilai Anda Bagus");
            case  60, 70 -> System.out.println("Nilai Anda Cukup");

            default -> System.out.println("Sebaik Nya Anda Belajar Lagi");

        }
    }
}
