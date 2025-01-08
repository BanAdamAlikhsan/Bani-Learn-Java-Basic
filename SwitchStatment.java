import java.sql.SQLOutput;

public class SwitchStatment {
    public static void main(String[] args){
     var weapon= "Transcendance";

     switch (weapon){
         case "Epic":
             System.out.println("Senjata Tier SSS");
         break;

         case "Transcendance":
             System.out.println("Senjata Tier SS");
         break;

         case "Unique":
             System.out.println("Senjata Tier S");
         break;

         case "Advance":
             System.out.println("Senjata Tier A");

         default:
             System.out.println("Senjata Tier B Kebawah");
     }

    }
}
