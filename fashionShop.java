import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
class fashionShop{
    static int [] oid = new int[5] ;        // Order id Array
    static String odr = "ODR#0000";
    static String newGeneratedORderID="";     // returned order id (This is the String )
    static int orderNumber=1; 
    static String phoneNumber="";
    static String tShirtSize="";   
    static int qty=0;
    static double amount=0;
    static String [] orderId = new String [0];              // order id array
    static String [] customerPhoneNumber = new String[0];   /// phone number array
    static String []  tShirtSizeAr = new String [0];        // tshier size array
    static int[] quantityAr = new int [0];                  // quantity array
    static double [] amountAr = new double[0];              // amount array

    static int tempMedium=0;
    static int tempXtraLarge=0;
    static int tempXtraXl=0;
    static int tempXtraSmall=0;
    static int tempSmall=0;
    static int tempLarge=0;

    static double mediumAmount=0;
    static double xtraLargeAmount=0;
    static double xtraxXlAmount=0;
    static double xtraSmallAmount=0;
    static double smallAmount=0;
    static double largeAmount=0;
    static double searchTotalAmount=0;

    //static int orderStatus = -1;
    static final int processing = 0;
    static final int delivering = 1;
    static final int delivered = 2;

    static int [] orderStatusAr = new int [0];  

    // ====================  Console Clear Method =========================================
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
    // ===========================   Main Method ======================================================
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        
        System.out.println("\t\t\t\t/$$$$$$$$                 /$$       /$$                                  /$$$$$$  /$$                          ");
        System.out.println("\t\t\t\t| $$_____/                | $$      |__/                                 /$$__  $$| $$                          ");
        System.out.println("\t\t\t\t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$             | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ ");
        System.out.println("\t\t\t\t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$            |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$");
        System.out.println("\t\t\t\t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$             \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$");
        System.out.println("\t\t\t\t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$             /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$");
        System.out.println("\t\t\t\t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$            |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/");
        System.out.println("\t\t\t\t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/             \\______/ |__/  |__/ \\______/ | $$____/ ");    
        System.out.println("\t\t\t\t                                                                                                      | $$      ");
        System.out.println("\t\t\t\t                                                                                                      | $$      ");
        System.out.println("\t\t\t\t                                                                                                      |__/      ");
        System.out.println();
        System.out.println("\t\t\t\t_____________________________________________________________________________________________________________________");

        System.out.println();
        System.out.println();

        System.out.println("\t\t\t\t\t [1] Place Order                                                     [2] Search Customer");
        System.out.println();
        System.out.println("\t\t\t\t\t [3] Search Order                                                    [4] View Customer");         
        System.out.println();
        System.out.println("\t\t\t\t\t [5] Set Order Status                                                [6] Delete Customer");         

        System.out.println();
        System.out.println();
        System.out.print("\t\t\t\t\t Input Option: ");
        int option = input.nextInt();

        // ========================== Switching Options =====================================
        switch (option) {
            case 1:
                clearConsole();
                placeOrder();                
                break;
            default:
                main(args);
                break;
            
            // case 2:
            //     clearConsole();
            //     serachCustomer();
            //     break;
            // case 3:
            //     clearConsole();
            //     searchOrder();
            //     break;
            // case 4:
            //     clearConsole();
            //     reports();
            //     break;
            // case 5:
            //     clearConsole();
            //     changeOrderStatus();
            //     break;
            // case 6:
            //     clearConsole();
            //     deleteOrderDetails();
            //     break;
            
        }
        input.close();
    }
    // =================================  Place Order Option ================================
    public static void placeOrder(){
        //Scanner place = new Scanner(System.in);
        
        System.out.println("\t\t\t\t\t\t\t_____   _                        ____            _             ");
        System.out.println("\t\t\t\t\t\t\t|  __ \\ | |                      / __ \\          | |            ");
        System.out.println("\t\t\t\t\t\t\t| |__) || |  __ _   ___  ___    | |  | | _ __  __| |  ___  _ __ ");
        System.out.println("\t\t\t\t\t\t\t|  ___/ | | / _` | / __|/ _ \\   | |  | || '__|/ _` | / _ \\| '__|");
        System.out.println("\t\t\t\t\t\t\t| |     | || (_| || (__|  __/   | |__| || |  | (_| ||  __/| |   ");
        System.out.println("\t\t\t\t\t\t\t|_|     |_| \\__,_| \\___|\\___|    \\____/ |_|   \\__,_| \\___||_|   ");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t___________________________________________________________________");
        System.out.println();
        System.out.println();  
        
        //orderNumber++;
        enterOrderID(); 
        phoneNumber();
        tShirtSizeCheck();
        placeOrNo();
    }
    public static void enterOrderID(){                           
             
        incrementOid();
        System.out.print("\t\t\t\t\t\t\t Enter Order ID : "+newGeneratedORderID);        
        System.out.println(); 
        System.out.println();      
        //System.out.println(orderNumber);  
    }
    // ================= order id increment method =========================
    public static void incrementOid(){
        int tempOrderNumber = orderNumber;
        
        int[] tempNumOrder = new int[5];
        String idNum = "";
        String tag = "ODR#";
        
        for (int i = 4; tempOrderNumber > 0; i--) {
            tempNumOrder[i] = tempOrderNumber % 10;
            tempOrderNumber /= 10;
        }
        for (int i = 0; i < tempNumOrder.length; i++) {
            idNum += tempNumOrder[i];                               
        }
        newGeneratedORderID = tag + idNum;
       
    }      
    
    //===================== Phone Number =====================================
    public static void phoneNumber(){
        Scanner pNum = new Scanner(System.in);

        //int [] customerPhoneNumber = new int [10];
        System.out.print("\t\t\t\t\t\t\t Enter Customer Phone Number : ");        
        phoneNumber = pNum.next();
        System.out.println();

        int count=0;
        for(int i=0; i<phoneNumber.length(); i++){
            phoneNumber.charAt(i);
            count++;
        }
        if(count!=10 || phoneNumber.charAt(0)!='0'){
            System.out.println("\t\t\t\t\t\t\t\t\t\t Invalid Phone Number... Try Again");
            System.out.println();

            char againNumber = 'Y';
            System.out.print("\t\t\t\t\t\t\t Do you want to enter phone number again? (y/n) : ");
            againNumber = pNum.next().charAt(0);

            if(againNumber=='Y' || againNumber=='y'){
                System.out.print("\033[5A");
                System.out.print("\033[0J");
                phoneNumber();
            }else{
                clearConsole();
                main(null);
            }
            
        }
    }
    // ===================== T-Shirt Size =============================================
    public static void tShirtSizeCheck(){
        Scanner tsize = new Scanner(System.in);

        System.out.print("\t\t\t\t\t\t\t Enter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
        tShirtSize = tsize.next().toUpperCase();
        System.out.println();

        if(tShirtSize.equals("XS") || tShirtSize.equals("S") || tShirtSize.equals("M") || tShirtSize.equals("L") || tShirtSize.equals("XL") || tShirtSize.equals("XXL")){
            quantity();
        }else{
            System.out.print("\033[2A");
            System.out.print("\033[0J");
            tShirtSizeCheck();
        }
    }
    // ================= Quantity ========================================
    public static void quantity(){
        Scanner input = new Scanner(System.in);

        System.out.print("\t\t\t\t\t\t\t Enter QTY : ");
        qty = input.nextInt();
        System.out.println();

        if(qty>0){
            amountcalculate();
        }else {
            System.out.print("\033[1A");
            System.out.print("\033[0J");
            quantity();
        }
    }
    // ====================================== Amount Calculation ============================
    public static void amountcalculate(){

        switch (tShirtSize){
            case "XS":
                amount = qty*600;                
                break;
            case "S":
                amount = qty*800;
                break;
            case "M":
                amount = qty*900;
                break;
            case "L":
                amount = qty*1000;
                break;
            case "XL":
                amount = qty*1100;
                break;
            case "XXL":
                amount = qty*1200;
                break;       
   
        }
        System.out.println("\t\t\t\t\t\t\t Amount : "+amount);
        System.out.println();

    }

    // =====================  order Placed yes or no checking and another order..... ====================================
    public static void placeOrNo(){
        Scanner input = new Scanner(System.in);

        char yesOrNo = 'Y';
        System.out.print("\t\t\t\t\t\t\t Do you want to Place this order? (y/n) : ");
        yesOrNo = input.next().charAt(0);
        System.out.println();

       
        if(yesOrNo=='Y' || yesOrNo=='y'){
                       
            userDetails();
            System.out.println("\t\t\t\t\t\t\t\t\t\t Order Placed...!");
            orderNumber++;
            System.out.println();
        }else{
            clearConsole();
            main(null);
        }

        char placeAnotherOrder = 'Y';
        System.out.print("\t\t\t\t\t\t\t Do you want to place another order? (y/n) : ");
        placeAnotherOrder = input.next().charAt(0);

        if(placeAnotherOrder=='Y' || placeAnotherOrder=='y'){
            clearConsole();
            placeOrder();
        }else {
            clearConsole();
            main(null);
        }
    }
    public static void userDetails(){
        String [] tempOrderID = new String [orderId.length+1];
        String [] tempCustomerPhoneNum = new String [customerPhoneNumber.length+1];
        String [] temptShirtSize = new String[tShirtSizeAr.length+1];
        int [] tempQuantity = new int[quantityAr.length+1];
        double [] tempAmount = new double[amountAr.length+1];
        // String [] tempOrderStatus = new String [orderStatusAr.length+1];
        int [] tempOrderStatus = new int [orderStatusAr.length+1];
        
        for(int i=0; i<orderId.length; i++){            
            tempOrderID[i]=orderId[i];
        }
        for(int i=0; i<customerPhoneNumber.length; i++){
            tempCustomerPhoneNum[i]=customerPhoneNumber[i];
        }
        for(int i=0; i<tShirtSizeAr.length; i++){
            temptShirtSize[i]=tShirtSizeAr[i];
        }
        for(int i=0; i<quantityAr.length; i++){
            tempQuantity[i]=quantityAr[i];
        }
        for(int i=0; i<amountAr.length; i++){
            tempAmount[i]=amountAr[i];
        }
        for(int i=0; i<orderStatusAr.length; i++){
            tempOrderStatus[i]=orderStatusAr[i];
        }

        tempOrderID[tempOrderID.length-1]=newGeneratedORderID;
        orderId=tempOrderID;
        
        tempCustomerPhoneNum[tempCustomerPhoneNum.length-1]=phoneNumber;
        customerPhoneNumber=tempCustomerPhoneNum;

        temptShirtSize[temptShirtSize.length-1]=tShirtSize;
        tShirtSizeAr=temptShirtSize;

        tempQuantity[tempQuantity.length-1]=qty;
        quantityAr=tempQuantity;

        tempAmount[tempAmount.length-1]=amount;
        amountAr=tempAmount;
        
        tempOrderStatus[tempOrderStatus.length-1]=processing;
        orderStatusAr=tempOrderStatus;
        
    }
    // =================================== Search Customer Mthod ============================================
      
}