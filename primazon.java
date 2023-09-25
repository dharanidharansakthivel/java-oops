public class Primazon { 
    public static void main(String[] args) {
    // Given values
    int category1Quantity = 1500; 
    double category1Value = 12000; 
    double category2Rate = 25; double category2Value = 10000; 
    int category3Quantity = 20000; double category3Rate = 35;
    // Calculate the missing values
    double category1Rate = category1Value / category1Quantity; int category2Quantity = (int) (category2Value / category2Rate);
     double category3Value = category3Rate * category3Quantity;
    // Print the results
    System.out.println("Rate for Category 1 (Garments): " + category1Rate); System.out.println("Quantity for Category 2 (Books): " + category2Quantity); System.out.println("Value for Category 3 (Electronic Gadgets): " + category3Value);
     
    }
    }
    
public class PrimazonCompany { public static void main(String[] args) {
// Given values
int category1Quantity = 1500;
int category2Quantity = 0; // To be calculated int category3Quantity = 20000;
// Calculate category 2 quantity based on the given value double category2Value = 10000;
double category2Rate = 25;
category2Quantity = (int) (category2Value / category2Rate);
// Find the maximum quantity among all three categories
int maxQuantity = Math.max(category1Quantity, Math.max(category2Quantity, category3Quantity));
// Print the maximum quantity
System.out.println("Maximum Quantity among all three categories: " + maxQuantity);
}
}
public class PrimazonCompany { public static void main(String[] args) {
int category1Quantity = 1500; double category1Value = 12000; double category2Rate = 25; double category2Value = 10000; int category3Quantity = 20000; double category3Rate = 35;
double category1Rate = category1Value / category1Quantity;
 
double category2Rate = category2Value / category1Quantity; double category3Rate = category3Rate;
// Calculate the average rate for all three categories
double averageRate = (category1Rate + category2Rate + category3Rate) / 3;
// Print the average rate
System.out.println("Average Rate for all three categories: " + averageRate);
}
}
iv)	public class PrimazonCompany { public static void main(String[] args) {
// Given values
double category1Value = 12000; double category2Value = 10000;
// The value for category 3 is unknown.
// Find the minimum value among all three categories
double minValue = Math.min(category1Value, Math.min(category2Value, getCategory3Value()));
// Print the minimum value
System.out.println("Minimum Value for all three categories: " + minValue);
}
// Method to get the value for Category 3 (Electronic Gadgets) private static double getCategory3Value() {
// You should calculate or provide the value for Category 3 here.
// For now, I'll return 0, but you should replace this with the actual value. return 0;
}
}
