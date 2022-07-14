package newDemo;

public class Switchpro3 {

	public static void main(String[] args) {
		String flowers="Rose";
     	switch(flowers)
		{
		case "jasmine":
       	    System.out.println("scientific name of jasmine:jasminum");
		    break;
		case "Rose":
			System.out.println("scientific name of Rose:Rosa");
			break;
		case "Lilly":
			System.out.println("scientific name of Lilly:Lilium");
			break;
		case "sunflower":
			System.out.println("scientific name of sunflower:Helianthus");
			break;
	   default:
	   System.out.println("please enter valid flower name");
	   
		}

	}

}
