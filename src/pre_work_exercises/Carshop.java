package pre_work_exercises;
import java.lang.*;
import java.util.*;

public class Carshop {
	
	public static void main(String[] args)
    {
        // Declaration of all the variables.
        int n, ch, index, again=1, search;
        long low_mileage;
        double low_price;
        String temp;
        int temp1;
        long temp2;
        char temp3;
        double temp4;
        
        // Takes total number of records to store.
        Scanner sc = new Scanner(System.in);
        System.out.print("How many car records are you want to enter? ");
        n = sc.nextInt();
        
        // Initialize all the necessary arrays for storing the details of the car.
        int id[] = new int[n];              // Stores the ID of the car.
        String manu[] = new String[n];      // Stores the manufacturer name of the car.
        String model[] = new String[n];     // Stores the model name of the car.
        int year[] = new int[n];            // Stores the year of manufacturing.
        long mileage[] = new long[n];       // Store the mileage of the car.
        double size[] = new double[n];      // Store the size of the car.
        char grade[] = new char[n];         // Store the grade of the car.
        double price[] = new double[n];     // Store the price of the car.
        String condition[] = new String[n]; // Stores the condition of the car.
        
        // Taking the details of the car from the user.
        System.out.println("\n<----------Insert Records of Every Car------------>");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter car ID : ");
            id[i] = sc.nextInt();
            System.out.println("Enter Manufacturer : ");
            manu[i] = sc.next();
            System.out.println("Enter car Model : ");
            model[i] = sc.next();
            System.out.println("Enter Year : ");
            year[i] = sc.nextInt();
            System.out.println("Enter Mileage : ");
            mileage[i] = sc.nextLong();
            System.out.println("Enter car Size : ");
            size[i] = sc.nextDouble();
            System.out.println("Enter Grade (A/B/C/D) : ");
            grade[i] = sc.next().charAt(0);
            System.out.println("Enter car Price : ");
            price[i] = sc.nextDouble();
            if(grade[i] == 'A')
            {
                condition[i] = "Excellent";
            }
            else if(grade[i] == 'B')
            {
                condition[i] = "Good";
            }
            else if(grade[i] == 'C')
            {
                condition[i] = "Average";
            }
            else
            {
                condition[i] = "Poor";
            }
        }
        
        // Now Its time for user choice.
        while(again == 1)
        {
            // Showing all the options...
            System.out.println("\n01. Sort the cars data based on the Model.\n02. Sort the cars data based on the price\n03. Identify the car with the lowest mileage.\n04. Identify the car with the lowest Price.\n05. Search car by ID.\n06. Exit.\n\nEnter Your Choice : ");
            // Taking the choice of the user.
            ch = sc.nextInt();
            
            int track = 0;
			// Switch-case is used to control the user choice.
            switch(ch)
            {
                // Sort the cars data based on Model.
                case 1:
                    for(int i=0;i<n;i++)
                    {
                        for(int j=i+1;j<n;j++)
                        {
                            if(model[i].compareToIgnoreCase(model[j])>0)
                            {
                                temp = model[i];
                                model[i] = model[j];
                                model[j] = temp;
                                
                                temp1 = id[i];
                                id[i] = id[j];
                                id[j] = temp1;
                                
                                temp = manu[i];
                                manu[i] = manu[j];
                                manu[j] = temp;
                                
                                temp1 = year[i];
                                year[i] = year[j];
                                year[j] = temp1;
                                
                                temp2 = mileage[i];
                                mileage[i] = mileage[j];
                                mileage[j] = temp2;
                                
                                temp4 = size[i];
                                size[i] = size[j];
                                size[j] = temp4;
                                
                                temp3 = grade[i];
                                grade[i] = grade[j];
                                grade[j] = temp3;
                                
                                temp4 = price[i];
                                price[i] = price[j];
                                price[j] = temp4;
                                
                                temp = condition[i];
                                condition[i] = condition[j];
                                condition[j] = temp;
                            }
                        }
                    }
                    // After sorting, display the result.
                    System.out.println("Result after sorting car's data based on the Model :->");
                    for(int i=0;i<n;i++)
                    {
                        System.out.println("Car ID : "+id[i]);
                        System.out.println("Car Manufacturer : "+manu[i]);
                        System.out.println("Car Model : "+model[i]);
                        System.out.println("Car Year : "+year[i]);
                        System.out.println("Car Mileage : "+mileage[i]);
                        System.out.println("Car Size : "+size[i]);
                        System.out.println("Car Grade : "+grade[i]);
                        System.out.println("Car Price : "+price[i]);
                    }
                    break;
                // Sort the cars data based on price...
                case 2:
                    for(int i=0;i<n;i++)
                    {
                        for(int j=i+1;j<n;j++)
                        {
                            if(price[i]<price[j])
                            {
                                temp4 = price[i];
                                price[i] = price[j];
                                price[j] = temp4;
                                
                                temp = model[i];
                                model[i] = model[j];
                                model[j] = temp;
                                
                                temp1 = id[i];
                                id[i] = id[j];
                                id[j] = temp1;
                                
                                temp = manu[i];
                                manu[i] = manu[j];
                                manu[j] = temp;
                                
                                temp1 = year[i];
                                year[i] = year[j];
                                year[j] = temp1;
                                
                                temp2 = mileage[i];
                                mileage[i] = mileage[j];
                                mileage[j] = temp2;
                                
                                temp4 = size[i];
                                size[i] = size[j];
                                size[j] = temp4;
                                
                                temp3 = grade[i];
                                grade[i] = grade[j];
                                grade[j] = temp3;
                                
                                temp = condition[i];
                                condition[i] = condition[j];
                                condition[j] = temp;
                            }
                        }
                    }
                    // After sorting display the result.
                    System.out.println("Result after sorting car's data based on the Price :->");
                    for(int i=0;i<n;i++)
                    {
                        System.out.println("Car ID : "+id[i]);
                        System.out.println("Car Manufacturer : "+manu[i]);
                        System.out.println("Car Model : "+model[i]);
                        System.out.println("Car Year : "+year[i]);
                        System.out.println("Car Mileage : "+mileage[i]);
                        System.out.println("Car Size : "+size[i]);
                        System.out.println("Car Grade : "+grade[i]);
                        System.out.println("Car Price : "+price[i]);
                    }
                    break;
                // Find the lowest mileage car.
                case 3:
                    low_mileage = mileage[0];
                    index = 0;
                    for(int i=1;i<n;i++)
                    {
                        if(low_mileage>mileage[i])
                        {
                            low_mileage = mileage[i];
                            index = i;
                        }
                    }
                    // After that display the details of the car which has lowest mileage.
                    System.out.println("The information of the car with the lowest mileage is :->");
                    System.out.println("Car ID : "+id[index]);
                    System.out.println("Car Manufacturer : "+manu[index]);
                    System.out.println("Car Model : "+model[index]);
                    System.out.println("Car Year : "+year[index]);
                    System.out.println("Car Mileage : "+mileage[index]);
                    System.out.println("Car Size : "+size[index]);
                    System.out.println("Car Grade : "+grade[index]);
                    System.out.println("Car Price : "+price[index]);
                    break;
                // Find the lowest priced car.
                case 4:
                    low_price = price[0];
                    index = 0;
                    for(int i=1;i<n;i++)
                    {
                        if(low_price>price[i])
                        {
                            low_price = price[i];
                            index = i;
                        }
                    }
                    // After that display the details of the car which has lowest price.
                    System.out.println("The information of the car with the lowest price is :->");
                    System.out.println("Car ID : "+id[index]);
                    System.out.println("Car Manufacturer : "+manu[index]);
                    System.out.println("Car Model : "+model[index]);
                    System.out.println("Car Year : "+year[index]);
                    System.out.println("Car Mileage : "+mileage[index]);
                    System.out.println("Car Size : "+size[index]);
                    System.out.println("Car Grade : "+grade[index]);
                    System.out.println("Car Price : "+price[index]);
                    break;
                // Find the details of the car by car ID.
                case 5:
                    // Taking the ID from user.
                    System.out.println("Enter ID to search : ");
                    search = sc.nextInt();
                    // Search and display the car's details.
                    for(int i=0;i<n;i++)
                    {
                        if(search == id[i])
                        {
                            index = i;
                            System.out.println("Car ID : "+id[index]);
                            System.out.println("Car Manufacturer : "+manu[index]);
                            System.out.println("Car Model : "+model[index]);
                            System.out.println("Car Year : "+year[index]);
                            System.out.println("Car Mileage : "+mileage[index]);
                            System.out.println("Car Size : "+size[index]);
                            System.out.println("Car Grade : "+grade[index]);
                            System.out.println("Car Price : "+price[index]);
                            System.out.println("Car Condition : "+condition[index]);
                            track = 1;
                            break;
                        }
                    }
                    // If ID is not found then.
                    if(track == 0)
                    {
                        System.out.println("ID not found.");
                    }
                    break;
                // A case to exit from the program.
                case 6:
                    // The predefined function exit(0) is used to exit from the system.
                    System.exit(0);
                    break;
                // A default case. If no choice is matched then it executes.
                default:
                    System.out.println("Please Enter a Correct option.");
            }
            // Ask the user whether they want to perform again or not.
            System.out.println("Do you want to perform the operation again? (0/1): ");
            again = sc.nextInt();
            // If 0 that means user wants to exit from the program otherwise user wants to perform the operation again.
            if(again==0)
                break;
        }

    }
}
