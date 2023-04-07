package String_Method;

public class Method_Of_String {

	public static void main(String[] args) {
		
		String n1 = "nisarbagwan2100@gmail.com";
		String n2 = "Nisar";
		String n3 = "Bagwan";
		
		// to find char in words used this method
	System.out.println(n1.charAt(4));
	// to print char @ any index (method used to defined words index checked ans) ans :- 'r'
	
	//to replaced one string to another string use 'repalce' method
	System.out.println(n2.replace("r", "R")); // repalced old char to new char means check ans old char='r' and new char 'R'
	System.out.println(n3.replace(n2, n3)); 
    System.out.println(n3.replaceAll(n1, n3)); 
    // n1= 'nisarbagwan2100@gmail.com' repalcedALL n3='bagwan' see console ans :- 'Bagwan'
    
    //to + 2 string like below we used this method
   System.out.println(n2+ " ".concat(n3)); //(n2.concat(3)); // 2 string milvne ektr tyala concat mhanatat
   
   //substring method method string madhe je index dele tyantr start krte
   System.out.println(n2.substring(2));  // means substring index 2 kelvr te Nisar nav he 2 index ntr start krto n last 3 index deto
   System.out.println(n2.substring(2, 4));
   
   // startwith method aapn string madhe jya navane ahe ki nhi te check krto yamadhe
   System.out.println(n1.startsWith("ni")); //startwith ("")method check krte satrt tya words ne zale ahe ki nhi te means "Nisar" ans he true or false madhey milt
   System.out.println(n1.startsWith("Ni")); //false karn startwith ("ni") small ni ahe 
   System.out.println(n3.endsWith("n"));
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
