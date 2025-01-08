public class TipeDataArray {
    public static void main(String[] args){

        //CONTOH PEMUATAN ARRAY BUAT STRING TIPE DATA

        String[] arrayContoh;
        arrayContoh= new String[4];

        arrayContoh[0]="Bani";
        arrayContoh[1]="Adam";
        arrayContoh[2]="Al";
        arrayContoh[3]="Ikhsan";

        System.out.println(arrayContoh[3]);

        //BEBERAPA CARA MENG INISISAI ARRAY

        Integer[] arrayInt= new Integer[]{
                1, 2, 3, 4, 5
        };

        System.out.println("Saya punya HP: " + arrayInt[4]);

        Character[] characterArray={
          'A', 'M', 'D'
        };

        String[] ryzenArray={"Ryzen", "Processor"};


        System.out.println(characterArray[0].toString() + characterArray[1].toString() + characterArray[2].toString() + " " + ryzenArray[0]);


    }
}