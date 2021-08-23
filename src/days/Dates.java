package days;

import java.util.EnumSet;

public class Dates {
         
	static enum day{monday,tuesday,wednesday,thursday,friday,saturday,sunday};
	
	public static void main(String[] args) {
		System.out.println("your beautiful day is:"+day.monday);
		
         for(day d:day.values()){         //day d:day.values()...      
        	 System.out.println("day:"+d);
         }
         //then if you whant spcific day to day you should use this method
         System.out.println("************************************************");
         
         for(day days:EnumSet.range(day.monday,day.friday)){  // Enumset.range(date to date).
        	 
        	 System.out.println("your secand day is:"+days);
         }
		
		}
	}
