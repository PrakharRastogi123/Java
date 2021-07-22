
public class popcorn {
	
		 public static void main(String args[]){  
		  SteamPopcorn sp=new SteamPopcorn();
		  sp.color();
		  sp.taste();
		  SteamPopcorn sp1=new SteamPopcorn(){ 
		  public void taste(){
			  System.out.println("Taste is Sweet");
		  }  
		  };  
		  sp1.color();
		  sp1.taste();
		  SteamPopcorn sp2=new SteamPopcorn(){ 
			  public void taste(){
				  System.out.println("Taste is Spicy");
			  }  
			  };  
			  sp2.color();
			  sp2.taste();
		  
		 }
	}

