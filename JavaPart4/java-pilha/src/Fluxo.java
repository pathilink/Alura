
public class Fluxo {

    public static void main(String[] args) {
//        System.out.println("Ini do main");
//        metodo1();
//        System.out.println("Fim do main");
    	System.out.println("Ini do main");
    	try {
    		metodo1();
    		}catch(Exception ex) {  // catch polimórfico	
    			String msg = ex.getMessage();
    			System.out.println("Exception " + msg);
    			ex.printStackTrace();
    		}//catch(NullPointerException ex) {  	
//    			String msg = ex.getMessage();
//    			System.out.println("Exception " + msg);
//    			ex.printStackTrace();
//    		}
    	System.out.println("Fim do main");
    	}
    	


    private static void metodo1() throws MinhaExcecao{
//        System.out.println("Ini do metodo1");
//        metodo2();
//        System.out.println("Fim do metodo1");
    	
	    System.out.println("Ini do metodo1");
	   // Tratando exception:
//	      try {
//	    	  metodo2();
//	      } catch(ArithmeticException ex) {
//          		System.out.println("ArithmeticException");
//          }
	    metodo2();
	    System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i);
//            // Tratando exception:
////            try {
////            	int a = i / 0;
////            } catch(ArithmeticException ex) {
////            	System.out.println("ArithmeticException");
////            }
////            
//            int a = i / 0;
//            //Conta c = null;
//            //c.deposita();
//        }
        
//        ArithmeticException ex = new ArithmeticException("deu pau!");
//        throw ex;
        //throw new ArithmeticException("deu pau!");
        throw new MinhaExcecao("deu pau!");
        //System.out.println("Fim do metodo2");
    }
}