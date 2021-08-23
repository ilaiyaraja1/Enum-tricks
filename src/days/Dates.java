package days;

public class Dates {
         
	static enum day{monday,tuesday,wednesday,thursday,friday,saturday,sunday};
	
	
	public static void main(String[] args) {
          
		System.out.println("your beautiful day is:"+day.monday);
		
         for(day d:day.values()){         //day d:day.values()...
        	 System.out.println("day:"+d);
        	 
         }
		
		}
	}
