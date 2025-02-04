public class TestException {

    public static void main(String[ ] args) {
        String name1 = null;
        String name2 = "Anvi";
        String result = "";
      
        try
        {
         result= name1.concat("Priti");
        System.out.println("string is \n"); 
        System.out.println("Result is \n"+result); 
        
        }catch(Exception e) 
        {
            System.out.println("Exception occur ----->"+ e); 
            //exit();
        }
        System.out.println("next statement");


    }
}
