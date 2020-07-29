
public class FluxoComError {

    public static void main(String[] args) {
//        System.out.println("Ini do main");
//        metodo1();
//        System.out.println("Fim do main");
    	System.out.println("Ini do main");
    	try {
    		metodo1();
    		}catch(ArithmeticException | NullPointerException ex) {  	
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
    	


    private static void metodo1() {
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

    private static void metodo2() {
    	System.out.println("Ini do método 2");
    	metodo2();  // StackOverflowError
    	System.out.println("Fim do método 2");
    }
}