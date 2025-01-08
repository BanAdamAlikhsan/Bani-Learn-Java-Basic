public class Method {
    public static void main(String[] args) {
        System.out.println("TEST");

        testMethod();
        testMethod2("Bani", "Muzni");
    }




    static void testMethod(){
        System.out.println("Ayo Panggil Method 1");
        System.out.println("Ayo Panggil Method 2");
        System.out.println("Ayo Panggil Method 3");
    }

    static void testMethod2(String firstName, String lastName){

        System.out.println(firstName + "Dan" + lastName);
    }
}
