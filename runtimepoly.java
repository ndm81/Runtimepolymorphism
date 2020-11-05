
// Runtime Polymorphism
class Bike{
	void run(){
		System.out.println("This is Bike");
	}
}

 // Now we make another class to extends Bike Class
    class Splendor extends Bike{
    	void run(){
    		System.out.println("This is Splendor");
    		 }
    		public static void main(String[] args)
    		 {
    		  Bike b=new Splendor(); // Upcasting--->>>Variable reference of parent class refer to the object of the child class
    		       b.run();  // Method call	
    	}
    }
