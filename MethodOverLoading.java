public class MethodOverLoading {
    public static void main(String[] args) {


        sayyHello("bani", "Alikhsan");
    }

    static void sayyHello(){
        System.out.println("Hello");
    }

    static void sayyHello(String name){
        System.out.println("Hello" + name);
    }

    static void sayyHello(String firstName, String lastName){
        System.out.println("Hello" + firstName + lastName);
    }
}
