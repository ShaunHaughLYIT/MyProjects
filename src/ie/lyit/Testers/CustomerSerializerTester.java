package ie.lyit.Testers;

import ie.lyit.serialize.CustomerSerializer;
import ie.lyit.Hotel.Menu;

public class CustomerSerializerTester 
{

	public static void main(String[] args) 
	{
		// Create an object of bookFileHandler
				CustomerSerializer customerSerializer = new CustomerSerializer();
				
				// Deserialize the ArrayList from the File,
				// i.e. read the books ArrayList from the file back into the ArrayList
				customerSerializer.readRecordsFromFile();
				
			    // Create a Menu Object
				Menu menuObj = new Menu();
				
				do{
					// Call it's display() method
					menuObj.display();
					// Call it's readOption() method
					menuObj.readOption();
					// switch on the option and call the appropriate method
					switch(menuObj.getOption()){
					   case 1:customerSerializer.add();
					   		break;
					   case 2:customerSerializer.list();
					   		break;
					   case 3:customerSerializer.view();
					   		break;
					   case 4:customerSerializer.edit();
					   		break;
					   case 5:customerSerializer.delete();
					   		break;
					   case 6:break;				
					   default:System.out.println("INVALID OPTION...");
					}
				}while(menuObj.getOption() != 6);	
																					
				// Serialize the ArrayList to the File
				// i.e. write the books ArrayList back into the the file		
				customerSerializer.writeRecordsToFile();
			}

	}


