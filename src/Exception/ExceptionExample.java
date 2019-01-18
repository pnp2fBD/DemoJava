package Exception;

class ExceptionExample{ 
	 
	 public static final void main(String[] args) {
	  System.out.println(test());
	 }
	 
	 private static String test() {
	  try {
	   String str = null;
	   return str.toString();
	   
	  }finally {
	   //return "hello finally";
	  }
	 } 
	}
