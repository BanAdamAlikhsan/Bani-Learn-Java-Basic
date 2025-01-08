public class Do_While_Loop {
    public static void main(String[] args){

        //perulangan do whilesetidak nya mengulang minimal 1x perlangan
        //karena perulangan ini kondisi nya di baca terakhir
        var counter=100;

        do {
            System.out.println("Per ulangan" + " " + counter);
            counter++;
        } while (counter <=105);
    }
}
