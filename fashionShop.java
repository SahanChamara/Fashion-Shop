import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

class FashionShopCustomerDetails{
	private String orderId;
	private String phoneNumber;
	private String size;
	private int quantity;
	private double amount;
	private int orderStatus;	
	
	//defauls constructor
	FashionShopCustomerDetails(){		
		
	}
	
	// all constructors
	FashionShopCustomerDetails(String orderId , String phoneNumber , String size , int quantity , double amount,int orderStatus){
		this.orderId = orderId;
		this.phoneNumber=phoneNumber;
		this.size=size;
		this.quantity=quantity;
		this.amount=amount;
		this.orderStatus=orderStatus;		
	}
	
	// set Order Id
	public void setOrderId(String orderId){        
		this.orderId=orderId;        
	}
	
	// Get Order Id
	public String getOrderId(){
		return this.orderId;
	}
	
	// set Phone Number
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	
	// Get Phone Number
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	
	// Set Size
	public void setSize(String size){
		this.size=size;
	}
	
	// Get Size
	public String getSize(){
		return this.size;
	}
    
    // Set Quantity
    public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	
	// Get Quantity
	public int getQuantity(){
		return this.quantity;
	}
	
	// set Amount
	public void setAmount(double amount){
		this.amount=amount;
	}
	
	// Get Amount
	public double getAmount(){
		return this.amount;
	}
	
	//set Order Status
	public void setOrderStatus(int orderStatus){
		this.orderStatus=orderStatus;
	}
	
	// // Get Order Status
	public int getOrderStatus(){
		return this.orderStatus;
	}
}

// Best In Cusomter Class
class BestsInCustomer{
    private int quantity;
    private double amount;
    private String customerPhoneNumber;

    BestsInCustomer(){

    }

    BestsInCustomer(int quantity,double amount,String customerPhoneNumber){
        this.quantity=quantity;
        this.amount=amount;
        this.customerPhoneNumber=customerPhoneNumber;
    }

    // set Quantiity
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    
    // get Quantiity
    public int getQuantity(){
        return this.quantity;
    }

    // set Amount
    public void setAmount(double amount){
        this.amount=amount;
    }

    // Get Amount
    public double getAmount(){
        return this.amount;
    }


    // set Phone Number
    public void setPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber=customerPhoneNumber;
    }

    // Get Phone Number
    public String getPhoneNumber(){
        return this.customerPhoneNumber;
    }
}

class AllCustomers{
    private String customerPhoneNumber;
    private int medium;
    private int xtraSamll;
    private int xtraXl;
    private int xtraLarge;
    private int small;
    private int large;
    private double amount;

    AllCustomers(){

    }

    AllCustomers(String customerPhoneNumber,int medium,int xtraSamll,int xtraXl,int xtraLarge,int small,int large,double amount){
        this.customerPhoneNumber=customerPhoneNumber;
        this.medium=medium;
        this.xtraSamll=xtraSamll;
        this.xtraXl=xtraXl;
        this.xtraLarge=xtraLarge;
        this.small=small;
        this.large=large;
        this.amount=amount;
    }

    // set phone number
    public void setPhoneNumber(int customerPhoneNumber){
        this.customerPhoneNumber=customerPhoneNumber;
    }

    // get phone number
    public String getPhoneNumber(){
        return this.customerPhoneNumber;
    }

    // set medium size
    public void setMedium(int medium){
        this.medium=medium;
    }

    // get Medium size
    public int getMediumSize(){
        return this.medium;
    }

    // set Xtra Small
    public void setXtraSmall(int xtraSamll){
        this.xtraSamll=xtraSamll;
    }

    // get Xtra XL
    public int getXtraSamll(){
        return this.xtraSamll;
    }

    // set XtraXl
    public void setXtraXl(int xtraXl){
        this.xtraXl=xtraXl;
    }

    // Get XtraXl
    public int getXtraXl(){
        return this.xtraXl;
    }

    // set Xtra Large
    public void setXtraLarge(int xtraLarge){
        this.xtraLarge=xtraLarge;
    }

    // get Xtra Large
    public int getXtraLarge(){
        return this.xtraLarge;
    }

    // set Small
    public void setSmall(int small){
        this.small=small;
    }

    // get small
    public int getSmall(){
        return this.small;
    }

    // set Large
    public void setLarge(int large){
        this.large=large;
    }

    // get large
    public int getLarge(){
        return this.large;
    }

    // set Amount
    public void setLarge (double amount){
        this.amount=amount;
    }

    // get amount
    public double getAmount(){
        return this.amount;
    }
}

class fashionShop{

    public static FashionShopCustomerDetails[] orderDetails =  new FashionShopCustomerDetails[0];  
    //public static BestsInCustomer[] viewCustomers = new BestsInCustomer[orderDetails.length];

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
            
            case 2:
                clearConsole();
                serachCustomer();
                break;
            case 3:
                clearConsole();
                searchOrder();
                break;
            case 4:
                clearConsole();
                reports();
                break;
            case 5:
                clearConsole();
                changeOrderStatus();
                break;
            case 6:
                clearConsole();
                deleteOrderDetails();
                break;
            
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

            // teporaly checkking inputs storing the array object......
            for(int i=0; i<orderDetails.length; i++){
                System.out.println(orderDetails[i].getOrderId());
                System.out.println(orderDetails[i].getPhoneNumber());
                System.out.println(orderDetails[i].getSize());
                System.out.println(orderDetails[i].getQuantity());
                System.out.println(orderDetails[i].getAmount());
            }


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

        FashionShopCustomerDetails[] tempOrderDetails = new FashionShopCustomerDetails[orderDetails.length+1];
        for(int i=0; i<orderDetails.length; i++){
            tempOrderDetails[i]=orderDetails[i];
        }
    
        orderDetails=tempOrderDetails;

        FashionShopCustomerDetails customerOrderDetails=new FashionShopCustomerDetails();

        customerOrderDetails.setOrderId(newGeneratedORderID);
        customerOrderDetails.setPhoneNumber(phoneNumber);
        customerOrderDetails.setSize(tShirtSize);
        customerOrderDetails.setQuantity(qty);
        customerOrderDetails.setAmount(amount);
        customerOrderDetails.setOrderStatus(processing);

        orderDetails[orderDetails.length-1]=customerOrderDetails;

        // String [] tempOrderID = new String [orderId.length+1];
        // String [] tempCustomerPhoneNum = new String [customerPhoneNumber.length+1];
        // String [] temptShirtSize = new String[tShirtSizeAr.length+1];
        // int [] tempQuantity = new int[quantityAr.length+1];
        // double [] tempAmount = new double[amountAr.length+1];
        // // String [] tempOrderStatus = new String [orderStatusAr.length+1];
        // int [] tempOrderStatus = new int [orderStatusAr.length+1];
        
        // for(int i=0; i<orderId.length; i++){            
        //     tempOrderID[i]=orderId[i];
        // }
        // for(int i=0; i<customerPhoneNumber.length; i++){
        //     tempCustomerPhoneNum[i]=customerPhoneNumber[i];
        // }
        // for(int i=0; i<tShirtSizeAr.length; i++){
        //     temptShirtSize[i]=tShirtSizeAr[i];
        // }
        // for(int i=0; i<quantityAr.length; i++){
        //     tempQuantity[i]=quantityAr[i];
        // }
        // for(int i=0; i<amountAr.length; i++){
        //     tempAmount[i]=amountAr[i];
        // }
        // for(int i=0; i<orderStatusAr.length; i++){
        //     tempOrderStatus[i]=orderStatusAr[i];
        // }

        // tempOrderID[tempOrderID.length-1]=newGeneratedORderID;
        // orderId=tempOrderID;
        
        // tempCustomerPhoneNum[tempCustomerPhoneNum.length-1]=phoneNumber;
        // customerPhoneNumber=tempCustomerPhoneNum;

        // temptShirtSize[temptShirtSize.length-1]=tShirtSize;
        // tShirtSizeAr=temptShirtSize;

        // tempQuantity[tempQuantity.length-1]=qty;
        // quantityAr=tempQuantity;

        // tempAmount[tempAmount.length-1]=amount;
        // amountAr=tempAmount;
        
        // tempOrderStatus[tempOrderStatus.length-1]=processing;
        // orderStatusAr=tempOrderStatus;
        
    }
    // =================================== Search Customer Mthod ============================================
    public static void serachCustomer(){
        Scanner input = new Scanner(System.in);
                
        System.out.println("\t\t\t\t\t  _____                          _           _____             _                                ");
        System.out.println("\t\t\t\t\t/ ____|                        | |         / ____|           | |                               ");
        System.out.println("\t\t\t\t\t| (___    ___   __ _  _ __  ___ | |__      | |     _   _  ___ | |_  ___   _ __ ___    ___  _ __ ");
        System.out.println("\t\t\t\t\t\\___\\  / _ \\ / _` || '__|/ __|| '_\\     | |    | | | |/ __|| __|/ _ \\ | '_ ` _ \\  / _ \\| '__|");
        System.out.println("\t\t\t\t\t____) ||  __/| (_| || |  | (__ | | | |    | |____| |_| |\\__ \\| |_| (_) || | | | | ||  __/| |   ");
        System.out.println("\t\t\t\t\t|_____/ \\___| \\__,_||_|   \\___||_| |_|     \\_____|\\__,_||___/ \\__|\\___/ |_| |_| |_| \\___||_|   ");
        System.out.println();
        System.out.println("\t\t\t\t\t___________________________________________________________________________________________________");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t Enter Customer Phone Number: ");
        String custEnterPhonenum = input.nextLine();
        System.out.println();
               
        boolean numbervalid = false;

        for(int i=0; i<orderDetails.length; i++){
            if(custEnterPhonenum.equals(orderDetails[i].getPhoneNumber())){
                numbervalid=true;
                
                if(orderDetails[i].getSize().equals("M")){
                    tempMedium+=orderDetails[i].getQuantity();
                }else if (orderDetails[i].getSize().equals("XS")){
                    tempXtraSmall+=orderDetails[i].getQuantity();
                }else if(orderDetails[i].getSize().equals("XXL")){
                    tempXtraXl+=orderDetails[i].getQuantity();
                }else if(orderDetails[i].getSize().equals("XL")){
                    tempXtraLarge+=orderDetails[i].getQuantity();
                }else if(orderDetails[i].getSize().equals("S")){
                    tempSmall+=orderDetails[i].getQuantity();
                }else if(orderDetails[i].getSize().equals("L")){
                    tempLarge+=orderDetails[i].getQuantity();
                } 
                                                           
            } 
            
        }
        if(numbervalid==false){
                System.out.println("\t\t\t\t\t\t\t\t\t Invalid Phone Number... ");
                System.out.println();

                char anotherCusReprt = 'Y';
                System.out.print("\t\t\t\t\t\t\t Do you want to Search another Customer Report? (y/n) : ");
                anotherCusReprt = input.next().charAt(0);

                if(anotherCusReprt=='Y' || anotherCusReprt=='y'){
                    clearConsole();
                    serachCustomer();
                }else{
                    clearConsole();
                    main(null);
                }
        }        
        customerSearchOrderPrint();
    }       
    // ==========================    Search Order Print ===========================================
    public static void customerSearchOrderPrint(){
        Scanner input = new Scanner(System.in);
        System.out.println();

        mediumAmount=tempMedium*900;
        xtraLargeAmount=tempXtraLarge*1100;
        xtraxXlAmount=tempXtraXl*1200;
        xtraSmallAmount=tempXtraSmall*600;
        smallAmount=tempSmall*800;
        largeAmount=tempLarge*1000;
        searchTotalAmount=mediumAmount+xtraLargeAmount+xtraxXlAmount+xtraSmallAmount+smallAmount+largeAmount;
               
        System.out.printf("\t\t\t\t\t%10s+%10s+%15s\n","+----------","----------","--------------+");
        System.out.printf("\t\t\t\t\t|%6s %6s %6s\n","  Size    |"," QTY     |","   Amount    |");
        System.out.printf("\t\t\t\t\t%10s+%10s+%15s\n","+----------","----------","--------------+");
        System.out.printf("\t\t\t\t\t| %4s     |%4s      |%13s |\n","","","");
        System.out.printf("\t\t\t\t\t| %4s     |%4d      |%10.2f    |\n","M",tempMedium,mediumAmount);
        System.out.printf("\t\t\t\t\t| %4s     |%4s      |%13s |\n","","","");
        System.out.printf("\t\t\t\t\t| %4s     |%4d      |%10.2f    |\n","XL",tempXtraLarge,xtraLargeAmount);
        System.out.printf("\t\t\t\t\t| %4s     |%4s      |%13s |\n","","","");
        System.out.printf("\t\t\t\t\t| %4s     |%4d      |%10.2f    |\n","XXL",tempXtraXl,xtraxXlAmount);
        System.out.printf("\t\t\t\t\t| %4s     |%4s      |%13s |\n","","","");
        System.out.printf("\t\t\t\t\t| %4s     |%4d      |%10.2f    |\n","XS",tempXtraSmall,xtraSmallAmount);
        System.out.printf("\t\t\t\t\t| %4s     |%4s      |%13s |\n","","","");
        System.out.printf("\t\t\t\t\t| %4s     |%4d      |%10.2f    |\n","S",tempSmall,smallAmount);
        System.out.printf("\t\t\t\t\t| %4s     |%4s      |%13s |\n","","","");
        System.out.printf("\t\t\t\t\t| %4s     |%4d      |%10.2f    |\n","L",tempLarge,largeAmount);
        System.out.printf("\t\t\t\t\t| %4s     |%4s      |%13s |\n","","","");
        System.out.printf("\t\t\t\t\t%10s+%10s+%15s\n","+----------","----------","--------------+");
        System.out.printf("\t\t\t\t\t|%6s %10.2f     |\n","  Total Amount     |"       ,searchTotalAmount);
        System.out.printf("\t\t\t\t\t%10s+%10s+%15s\n","+----------","----------","--------------+");

        System.out.println();
        System.out.println();

        char anotherCusReprt2 = 'Y';
        System.out.print("\t\t\t\t\t\t\t Do you want to Search another Customer Report? (y/n) : ");
        anotherCusReprt2 = input.next().charAt(0);

        if(anotherCusReprt2=='Y' || anotherCusReprt2=='y'){
            clearConsole();
            tempCountUpdate();
            serachCustomer();
        }else{
            clearConsole();
            main(null);
        }
       
    }   
    public static void tempCountUpdate(){
        tempMedium=0;
        tempXtraLarge=0;
        tempXtraXl=0;
        tempXtraSmall=0;
        tempSmall=0;
        tempLarge=0;
    }
    
    public static void searchOrder(){
        Scanner input = new Scanner(System.in);
        DecimalFormat decor = new DecimalFormat("0.00");
        System.out.println();       
    
        System.out.println("\t\t\t\t\t _____                          _           ____            _             ");
        System.out.println("\t\t\t\t\t/ ____|                        | |         / __ \\          | |            ");
        System.out.println("\t\t\t\t\t| (___   ___   __ _  _ __  ___ | |__      | |  | | _ __  __| |  ___  _ __ ");
        System.out.println("\t\t\t\t\t\\___ \\  / _ \\ / _` || '__|/ __|| '_ \\     | |  | || '__|/ _` | / _ \\| '__|");
        System.out.println("\t\t\t\t\t____) ||  __/| (_| || |  | (__ | | | |    | |__| || |  | (_| ||  __/| |   ");
        System.out.println("\t\t\t\t\t|_____/  \\___| \\__,_||_|   \\___||_| |_|     \\____/ |_|   \\__,_| \\___||_|   ");
        System.out.println();
        System.out.println("\t\t\t\t\t___________________________________________________________________________________________________");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t Enter Order Number: ");
        String custEnterOrderNumber = input.nextLine();
        System.out.println();

        boolean isValid=false;

        for(int i=0; i<orderDetails.length; i++){
            if(custEnterOrderNumber.equals(orderDetails[i].getOrderId())){
                System.out.println("\t\t\t\t\t\t\t Phone Number : "+ orderDetails[i].getPhoneNumber());
                System.out.println("\t\t\t\t\t\t\t Size \t :\t "+ orderDetails[i].getSize());
                System.out.println("\t\t\t\t\t\t\t QTY \t : \t "+orderDetails[i].getQuantity());
                System.out.println("\t\t\t\t\t\t\t Amount  : \t "+ decor.format(orderDetails[i].getAmount()));

            
                String printOrderStatus="";

                if(orderDetails[i].getOrderStatus()==1){
                    printOrderStatus="DELIVERING";
                }else if(orderDetails[i].getOrderStatus()==2){
                    printOrderStatus="DELIVERRED";
                }else{
                    printOrderStatus="PROCESSING";
                }
                System.out.println("\t\t\t\t\t\t\t Amount  : \t "+ printOrderStatus);               

                System.out.println();

                isValid=true;

                char cusSearchAnotherOrder1 = 'Y';
                System.out.print("\t\t\t\t\t\t\t Do you want to Search another Order? (y/n) : ");
                cusSearchAnotherOrder1 = input.next().charAt(0);

                if(cusSearchAnotherOrder1=='Y' || cusSearchAnotherOrder1=='y'){
                    clearConsole();
                    searchOrder();
                }else{
                    clearConsole();
                    main(null);
                }
            }
        }
        if(isValid==false){            
                System.out.println("\t\t\t\t\t\t\t\t\t Invalid ID... ");
                System.out.println();

                char cusSearchAnotherOrder = 'Y';
                System.out.print("\t\t\t\t\t\t\t Do you want to Search another Order? (y/n) : ");
                cusSearchAnotherOrder = input.next().charAt(0);

                if(cusSearchAnotherOrder=='Y' || cusSearchAnotherOrder=='y'){
                    clearConsole();
                    searchOrder();
                }else{
                    clearConsole();
                    main(null);
                }           
        }
    }
    public static void deleteOrderDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        
        System.out.println("\t\t\t\t\t_____         _        _             ____            _             ");
        System.out.println("\t\t\t\t\t|  __ \\       | |      | |           / __ \\          | |            ");
        System.out.println("\t\t\t\t\t| |  | |  ___ | |  ___ | |_  ___    | |  | | _ __  __| |  ___  _ __ ");
        System.out.println("\t\t\t\t\t| |  | | / _ \\| | / _ \\| __|/ _ \\   | |  | || '__|/ _` | / _ \\| '__|");
        System.out.println("\t\t\t\t\t| |__| ||  __/| ||  __/| |_|  __/   | |__| || |  | (_| ||  __/| |   ");
        System.out.println("\t\t\t\t\t|_____/  \\___||_| \\___| \\__|\\___|    \\____/ |_|   \\__,_| \\___||_|   ");
        System.out.println();
        System.out.println("\t\t\t\t\t___________________________________________________________________________________________________");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t Enter Order Number: ");
        String enterOrderID = input.nextLine();
        System.out.println();

        boolean isValid2=false;

        for(int i=0; i<orderDetails.length; i++){
            if(enterOrderID.equals(orderDetails[i].getOrderId())){
                System.out.println("\t\t\t\t\t\t\t Phone Number : "+ orderDetails[i].getPhoneNumber());
                System.out.println("\t\t\t\t\t\t\t Size \t :\t "+ orderDetails[i].getSize());
                System.out.println("\t\t\t\t\t\t\t QTY\t : \t "+orderDetails[i].getQuantity());
                System.out.println("\t\t\t\t\t\t\t Amount\t : \t "+ orderDetails[i].getAmount());


                String printOrderStatus="";
                if(orderDetails[i].getOrderStatus()==1){
                    printOrderStatus="DELIVERING";
                }else if(orderDetails[i].getOrderStatus()==2){
                    printOrderStatus="DELIVERRED";
                }else{
                    printOrderStatus="PROCESSING";
                }
                System.out.println("\t\t\t\t\t\t\t Status\t : \t " +printOrderStatus);                
                System.out.println();

                char cusenterdeletionID = 'Y';
                System.out.print("\t\t\t\t\t\t\t Do you want to Delete this Order? (y/n) : ");
                cusenterdeletionID = input.next().charAt(0);
                
                if(cusenterdeletionID=='Y' || cusenterdeletionID=='y'){
                    
                    isValid2=true;
                    orderDeleteAr(i);

                    System.out.println("\t\t\t\t\t\t\t\t\t\t Order Deleted...!"); 

                    char delanotherOrder = 'Y';
                    System.out.print("\t\t\t\t\t\t\t Do you want to Delete another order? (y/n) : ");
                    delanotherOrder = input.next().charAt(0);

                    if(delanotherOrder=='Y' || delanotherOrder=='y'){
                        clearConsole();
                        placeOrder();
                    }else {
                        clearConsole();
                        main(null);
                    }

                }else{
                    clearConsole();
                    main(null);
                }                
            }
        }
        if(isValid2==false){            
            System.out.println("\t\t\t\t\t\t\t\t\t Invalid ID... ");
            System.out.println();

            char anotherdeletionID = 'Y';
            System.out.print("\t\t\t\t\t\t\t Do you want to Delete another Order? (y/n) : ");
            anotherdeletionID = input.next().charAt(0);

            if(anotherdeletionID=='Y' || anotherdeletionID=='y'){
                clearConsole();
                deleteOrderDetails();
            }else{
                clearConsole();
                main(null);
            }           
        }     
                     
    }
    public static void orderDeleteAr(int delIndex){
        // String [] tempOrderID = new String [orderId.length-1];
        // String [] tempCustomerPhoneNum = new String [customerPhoneNumber.length-1];
        // String [] temptShirtSize = new String[tShirtSizeAr.length-1];
        // int [] tempQuantity = new int[quantityAr.length-1];
        // double [] tempAmount = new double[amountAr.length-1];
        // int [] tempOrderStatus = new int [orderStatusAr.length-1];

        FashionShopCustomerDetails [] tempDeletingOrders = new FashionShopCustomerDetails[orderDetails.length-1];
        for(int i=0, j=0; i<orderDetails.length; i++){
            if(i!=delIndex){
                tempDeletingOrders[j]=orderDetails[i];
            }
        }

        orderDetails=tempDeletingOrders;
        System.out.println(Arrays.toString(orderDetails));


        // for(int i=0, j=0; i<orderId.length; i++){
        //     if(i!=delIndex){
        //         tempOrderID[j]=orderId[i];
        //         tempCustomerPhoneNum[j]=customerPhoneNumber[i];
        //         temptShirtSize[j]=tShirtSizeAr[i];
        //         tempQuantity[j]=quantityAr[i];
        //         tempAmount[j]=amountAr[i];
        //         tempOrderStatus[j]=orderStatusAr[i];
        //         j++;
        //     }
        // }
        // orderId=tempOrderID;
        // customerPhoneNumber=tempCustomerPhoneNum;
        // tShirtSizeAr=temptShirtSize;
        // quantityAr=tempQuantity;
        // amountAr=tempAmount;
        // orderStatusAr=tempOrderStatus;
    }
    public static void reports(){
        Scanner input = new Scanner(System.in);
        System.out.println();
       
        System.out.println("\t\t\t\t\t  _____                            _        ");
        System.out.println("\t\t\t\t\t|  __ \\                          | |       ");
        System.out.println("\t\t\t\t\t| |__) | ___  _ __    ___   _ __ | |_  ___ ");
        System.out.println("\t\t\t\t\t|  _  / / _ \\| '_ \\  / _ \\ | '__|| __|/ __|");
        System.out.println("\t\t\t\t\t| | \\ \\|  __/| |_) || (_) || |   | |_ \\__ \\");
        System.out.println("\t\t\t\t\t|_|  \\_\\___|| .__/  \\___/ |_|    \\__||___/");
        System.out.println("\t\t\t\t\t\t    | |                           ");
        System.out.println("\t\t\t\t\t\t    |_|                           ");
        System.out.println();
        System.out.println("\t\t\t\t\t_____________________________________________");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t [1] Customer Reports: ");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t [2] Item Reports: ");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t [3] Orders Reports: ");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t Enter Option: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                clearConsole();
                customerReport();                
                break;
            case 2: 
                clearConsole();
                itemReport();
                break;
            case 3:
                clearConsole();
                ordersReports();
                break;
        
            default:
                clearConsole();
                reports();
                break;
        }
    }
    public static void customerReport(){
        Scanner input = new Scanner(System.in);
        System.out.println();

                
        System.out.println("\t\t\t _____             _                                    _____                            _        ");
        System.out.println("\t\t\t/ ____|           | |                                  |  __ \\                          | |       ");
        System.out.println("\t\t\t| |     _   _  ___ | |_  ___   _ __ ___    ___  _ __    | |__) | ___  _ __    ___   _ __ | |_  ___ ");
        System.out.println("\t\t\t| |    | | | |/ __|| __|/ _ \\ | '_ ` _ \\  / _ \\| '__|   |  _  / / _ \\| '_ \\  / _ \\ | '__|| __|/ __|");
        System.out.println("\t\t\t| |____| |_| |\\__ \\| |_| (_) || | | | | ||  __/| |      | | \\ \\|  __/| |_) || (_) || |   | |_ \\__ \\");
        System.out.println("\t\t\t\\_____|\\__,_||___/ \\__|\\___/ |_| |_| |_| \\___||_|      |_|  \\_\\\\___|| .__/  \\___/ |_|    \\__||___/");
                                                                       System.out.println("\t\t\t\t\t\t\t\t\t| |                           ");
                                                                       System.out.println("\t\t\t\t\t\t\t\t\t|_|                           ");
        System.out.println();
        System.out.println("\t\t\t_____________________________________________________________________________________________________________");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t [1] Best in Customers: ");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t [2] View Customers: ");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t [3] All Customer Reports: ");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t Enter Option: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                clearConsole();
                bestInCustomer();                
                break;
            case 2:
                clearConsole();
                viewCustomers();
            case 3:
                clearConsole();
                allCustomerReport();
                break;            
            default:
                clearConsole();
                customerReport();
                break;
        }
    }
    public static void bestInCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println();
                
        System.out.println("\t\t\t____              _       _____              _____             _                                     ");
        System.out.println("\t\t\t|  _ \\            | |     |_   _|            / ____|           | |                                    ");
        System.out.println("\t\t\t| |_) |  ___  ___ | |_      | |   _ __      | |     _   _  ___ | |_  ___   _ __ ___    ___  _ __  ___ ");
        System.out.println("\t\t\t|  _ <  / _ \\/ __|| __|     | |  | '_ \\     | |    | | | |/ __|| __|/ _ \\ | '_ ` _ \\  / _ \\| '__|/ __|");
        System.out.println("\t\t\t| |_) ||  __/\\__ \\| |_     _| |_ | | | |    | |____| |_| |\\__ \\| |_| (_) || | | | | ||  __/| |   \\__ \\");
        System.out.println("\t\t\t|____/  \\___||___/ \\__|   |_____||_| |_|     \\_____|\\__,_||___/ \\__|\\___/ |_| |_| |_| \\___||_|   |___/");
        System.out.println();
        System.out.println("\t\t\t_____________________________________________________________________________________________________________");
        System.out.println();

        // String [][] bestCustomer = new String[customerPhoneNumber.length][3];

        BestsInCustomer[] viewBestCustomers = new BestsInCustomer[orderDetails.length];
        for(int i=0; i<viewBestCustomers.length; i++){
            viewBestCustomers[i]=new BestsInCustomer();
        }
        

        boolean [] equalPass = new boolean[orderDetails.length];

        int count=0;

        for(int i=0; i<orderDetails.length; i++){
            if(equalPass[i]){
                continue;
            }

            int tempqty = orderDetails[i].getQuantity();
            double tempAmount = orderDetails[i].getAmount();
            equalPass[i]=true;

            for(int j=i+1; j<orderDetails.length; j++){
                if(orderDetails[i].getPhoneNumber().equals(orderDetails[j].getPhoneNumber())){
                    tempqty+=orderDetails[j].getQuantity();
                    tempAmount+=orderDetails[j].getAmount();
                    equalPass[j]=true;
                }                
            }
            // bestCustomer[count][0]=customerPhoneNumber[i];
            // bestCustomer[count][1]=String.valueOf(tempqty);
            // bestCustomer[count][2]=String.valueOf(tempAmount);

            String customerPhoneNumber = orderDetails[i].getPhoneNumber();

            viewBestCustomers[i].setPhoneNumber(customerPhoneNumber);
            viewBestCustomers[i].setQuantity(tempqty);
            viewBestCustomers[i].setAmount(tempAmount);
            count++;
        }
               
        // Sorting Part....
        for(int i=count-1; i>0; i--){           
            for(int j=0; j<i; j++){    
                // if(bestCustomer[j][2]!=null && bestCustomer[j+1][2]!=null){
                    if(viewBestCustomers[j].getAmount()<viewBestCustomers[j+1].getAmount()){                   
                        BestsInCustomer swap = viewBestCustomers[j];
                        viewBestCustomers[j]=viewBestCustomers[j+1];
                        viewBestCustomers[j+1]=swap;                    
                    }
                //}           
                
            }
        }
        
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+-------------------------","----------------","---------------+");
        System.out.printf("\t\t\t\t\t\t|%15s %8s %14s\n","      Customer ID        |","     QTY       |","    Amount    |");   
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+-------------------------","----------------","---------------+");
 
        for(int i=0; i<count; i++){
            // if(bestCustomer[i][2]!=null){                               
            // }   
            System.out.printf("\t\t\t\t\t\t| %15s         | %8d       | %10.2f    |\n",viewBestCustomers[i].getPhoneNumber(),viewBestCustomers[i].getQuantity(),viewBestCustomers[i].getAmount());
            System.out.printf("\t\t\t\t\t\t| %15s         |%8s        | %14s|\n","","","");        
        } 
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+-------------------------","----------------","---------------+");         
        System.out.println();


        System.out.print("\t\t\t To access the main menu,Please enter 0 : ");
        int accessMenu = input.nextInt();

        if(accessMenu==0){
            clearConsole();
            main(null);
        }
    }
    public static void viewCustomers(){
        Scanner input = new Scanner(System.in);
        System.out.println();        
        
        System.out.println("\t\t\t__      __ _                     _____             _                                     ");
        System.out.println("\t\t\t\\ \\    / /(_)                   / ____|           | |                                    ");
        System.out.println("\t\t\t\\ \\  / /  _   ___ __      __  | |     _   _  ___ | |_  ___   _ __ ___    ___  _ __  ___ ");
        System.out.println("\t\t\t\\ \\/ /  | | / _ \\ \\ /\\ / /  | |    | | | |/ __|| __|/ _ \\ | '_ ` _ \\  / _ \\| '__|/ __|");
        System.out.println("\t\t\t\\  /   | ||  __/ \\ V  V /   | |____| |_| |\\__ \\| |_| (_) || | | | | ||  __/| |   \\__ \\");
        System.out.println("\t\t\t\\/    |_| \\___|  \\_/\\_/     \\_____|\\__,_||___/ \\__|\\___/ |_| |_| |_| \\___||_|   |___/");
        System.out.println();
        System.out.println("\t\t\t_________________________________________________________________________________________");

        System.out.println();
        System.out.println();

        //String [][] bestCustomer = new String[customerPhoneNumber.length][3];

        BestsInCustomer[] viewCustomers = new BestsInCustomer[orderDetails.length];
        for(int i=0; i<viewCustomers.length; i++){
            viewCustomers[i]=new BestsInCustomer();
        }

        boolean [] equalPass = new boolean[orderDetails.length];
        for(int i=0; i<orderDetails.length; i++){
            if(equalPass[i]){
                continue;
            }

            int tempqty = orderDetails[i].getQuantity();
            double tempAmount = orderDetails[i].getAmount();
            equalPass[i]=true;

            for(int j=i+1; j<orderDetails.length; j++){
                if(orderDetails[i].getPhoneNumber().equals(orderDetails[j].getPhoneNumber())){
                    tempqty+=orderDetails[j].getQuantity();
                    tempAmount+=orderDetails[j].getAmount();
                    equalPass[j]=true;
                }                
            }

            String customerPhoneNumber=orderDetails[i].getPhoneNumber();

            // bestCustomer[i][0]=customerPhoneNumber[i];
            // bestCustomer[i][1]=String.valueOf(tempqty);
            // bestCustomer[i][2]=String.valueOf(tempAmount);

            viewCustomers[i].setPhoneNumber(customerPhoneNumber);
            viewCustomers[i].setQuantity(tempqty);
            viewCustomers[i].setAmount(tempAmount);
        }

        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+-------------------------","----------------","---------------+");
        System.out.printf("\t\t\t\t\t\t|%15s %8s %14s\n","      Customer ID        |","     QTY       |","    Amount    |");   
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+-------------------------","----------------","---------------+");       
        for(int i=0; i<viewCustomers.length; i++){
            //if(bestCustomer[i][2]!=null){ 
                System.out.printf("\t\t\t\t\t\t| %15s         | %8d       |  %10.2f    |\n",viewCustomers[i].getPhoneNumber(),viewCustomers[i].getQuantity(),viewCustomers[i].getAmount());
                System.out.printf("\t\t\t\t\t\t| %15s         |%8s        |  %14s|\n","","","");                              
            //}                     
        } 
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+-------------------------","----------------","---------------+");        
        System.out.println();


        System.out.print("\t\t\t To access the main menu,Please enter 0 : ");
        int accessMenu = input.nextInt();

        if(accessMenu==0){
            clearConsole();
            main(null);
        }
    }
    public static void allCustomerReport(){
        Scanner input = new Scanner(System.in);
        System.out.println();         
        
        System.out.println("\t\t\t            _  _     _____             _                                         _____                            _        ");
        System.out.println("\t\t\t/\\    | || |   / ____|           | |                                       |  __ \\                          | |       ");
        System.out.println("\t\t\t/  \\   | || |  | |     _   _  ___ | |_  ___   _ __ ___    ___  _ __  ___    | |__) | ___  _ __    ___   _ __ | |_  ___ ");
        System.out.println("\t\t\t/ /\\ \\  | || |  | |    | | | |/ __|| __|/ _ \\ | '_ ` _ \\  / _ \\| '__|/ __|   |  _  / / _ \\| '_ \\  / _ \\ | '__|| __|/ __|");
        System.out.println("\t\t\t/ ____ \\ | || |  | |____| |_| |\\__ \\| |_| (_) || | | | | ||  __/| |   \\__ \\   | | \\ \\|  __/| |_) || (_) || |   | |_ \\__ \\");
        System.out.println("\t\t\t/_/    \\_\\|_||_|   \\_____|\\__,_||___/ \\__|\\___/ |_| |_| |_| \\___||_|   |___/   |_|  \\_\\___|| .__/  \\___/ |_|    \\__||___/");
        System.out.println("\t\t\t                                                                                            | |                           ");
        System.out.println("\t\t\t                                                                                            |_|                           ");
        System.out.println();
        System.out.println("\t\t\t__________________________________________________________________________________________________________________________________");

        System.out.println();
        System.out.println();
       
        //int allCustomerDetails[][] = new int [customerPhoneNumber.length][8];

        AllCustomers[] allCustomerDetails = new AllCustomers[orderDetails.length];
        for(int i=0; i<allCustomerDetails.length; i++){
            allCustomerDetails[i]=new AllCustomers();
        }

        boolean equalPass[] = new boolean[customerPhoneNumber.length];
        for(int i=0; i<orderDetails.length; i++){
            if(equalPass[i]){
                continue;
            }

            int tempMedium2=0;
            int tempXtraSmall2=0;
            int tempXtraXl2=0;
            int tempXtraLarge2=0;
            int tempSmall2=0;
            int tempLarge2=0;
            double tempAmount2=0;
            
            allCustomerDetails[i][0]=Integer.parseInt(customerPhoneNumber[i]);
            if(tShirtSizeAr[i].equals("M")){
                tempMedium2=quantityAr[i];
                allCustomerDetails[i][3]=tempMedium2;
            }else if (tShirtSizeAr[i].equals("XS")){
                tempXtraSmall2=quantityAr[i];
                allCustomerDetails[i][1]=tempXtraSmall2;
            }else if(tShirtSizeAr[i].equals("XXL")){
                tempXtraXl2=quantityAr[i];
                allCustomerDetails[i][6]=tempXtraXl2;

            }else if(tShirtSizeAr[i].equals("XL")){
                tempXtraLarge2=quantityAr[i];
                allCustomerDetails[i][5]=tempXtraLarge2;

            }else if(tShirtSizeAr[i].equals("S")){
                tempSmall2=quantityAr[i];
                allCustomerDetails[i][2]=tempSmall2;

            }else if(tShirtSizeAr[i].equals("L")){
                tempLarge2=quantityAr[i];
                allCustomerDetails[i][4]=tempLarge2;
            }

            tempAmount2=amountAr[i];  
            allCustomerDetails[i][7]=(int)tempAmount2;           
            equalPass[i]=true;            
    
            for(int j=i+1; j<customerPhoneNumber.length; j++){
                if(Integer.parseInt(customerPhoneNumber[i])==Integer.parseInt(customerPhoneNumber[j])){

                    allCustomerDetails[i][0]=Integer.parseInt(customerPhoneNumber[i]);
                    if(tShirtSizeAr[i].equals("M")){
                        tempMedium2+=quantityAr[i];
                        allCustomerDetails[i][3]=tempMedium2;
                    }else if (tShirtSizeAr[i].equals("XS")){
                        tempXtraSmall2+=quantityAr[i];
                        allCustomerDetails[i][1]=tempXtraSmall2;
                    }else if(tShirtSizeAr[i].equals("XXL")){
                        tempXtraXl2+=quantityAr[i];
                        allCustomerDetails[i][6]=tempXtraXl2;
                    }else if(tShirtSizeAr[i].equals("XL")){
                        tempXtraLarge2+=quantityAr[i];
                        allCustomerDetails[i][5]=tempXtraLarge2;
                    }else if(tShirtSizeAr[i].equals("S")){
                        tempSmall2+=quantityAr[i];
                        allCustomerDetails[i][2]=tempSmall2;
                    }else if(tShirtSizeAr[i].equals("L")){
                        tempLarge2+=quantityAr[i];
                        allCustomerDetails[i][4]=tempLarge2;
                    }
                    tempAmount2+=amountAr[i]; 
                    allCustomerDetails[i][7]=(int)tempAmount2;                    
                        
                    equalPass[j]=true;
                }                
            }           
        }        
        System.out.printf("\t\t\t\t%15s+%5s+%5s+%5s+%5s+%5s+%5s+%12s \n","+-------------------------","--------","--------","--------","--------","--------","--------","---------------+");
        System.out.printf("\t\t\t\t|%15s %5s %5s %5s %5s %5s %5s %12s\n","      Phone Number       |"," XS    |","   S   |","    M  |","    L  |","   XL  |","   XXL |","     Total    |");
        System.out.printf("\t\t\t\t%15s+%5s+%5s+%5s+%5s+%5s+%5s+%12s \n","+-------------------------","--------","--------","--------","--------","--------","--------","---------------+");

        for (int i = 0; i < allCustomerDetails.length; i++) {
            if (allCustomerDetails[i][0] != 0) {
                System.out.printf("\t\t\t\t|%010d               |%5d   |%5d   |%5d   |%5d   |%5d   |%5d   |%12d   | \n", allCustomerDetails[i][0], allCustomerDetails[i][1],allCustomerDetails[i][2],allCustomerDetails[i][3],allCustomerDetails[i][4],allCustomerDetails[i][5],allCustomerDetails[i][6],allCustomerDetails[i][7]);
                System.out.printf("\t\t\t\t|%15s          |%5s   |%5s   |%5s   |%5s   |%5s   |%5s   |%12s   | \n", "", "", "","","","","","");
            }

        }
        System.out.printf("\t\t\t\t%15s+%5s+%5s+%5s+%5s+%5s+%5s+%12s \n", "+-------------------------", "--------","--------","--------","--------","--------","--------","---------------+");
        System.out.println();
        
        System.out.print("\t\t\t To access the main menu,Please enter 0 : ");
        int accessMenu = input.nextInt();

        if(accessMenu==0){
            clearConsole();
            main(null);
        }     
    }
    public static void itemReport(){
        Scanner input = new Scanner(System.in);
        System.out.println();            
        
        System.out.println("\t\t\t_____  _                       _____                            _        ");
        System.out.println("\t\t\t|_   _|| |                     |  __ \\                          | |       ");
        System.out.println("\t\t\t| |  | |_  ___  _ __ ___     | |__) | ___  _ __    ___   _ __ | |_  ___ ");
        System.out.println("\t\t\t| |  | __|/ _ \\| '_ ` _ \\    |  _  / / _ \\| '_ \\  / _ \\ | '__|| __|/ __|");
        System.out.println("\t\t\t_| |_ | |_|  __/| | | | | |   | | \\ \\|  __/| |_) || (_) || |   | |_ \\__ \\");
        System.out.println("\t\t\t|_____| \\__|\\___||_| |_| |_|   |_|  \\_\\___|| .__/  \\___/ |_|    \\__||___/");
        System.out.println("\t\t\t                                            | |                           ");
        System.out.println("\t\t\t                                            |_|                           ");
        System.out.println();
        System.out.println("\t\t\t______________________________________________________________________________");
        System.out.println();
        System.out.println();

        System.out.println("\t\t\t\t\t [1] Best Selling Categories Sorted By Qty");
        System.out.println();
        System.out.println("\t\t\t\t\t [2] Best Selling Categories Sorted By Amount");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t Enter Option : ");
        int bs = input.nextInt();

        switch (bs) {
            case 1:
                clearConsole();
                soretedByQty();
                break;
            case 2:
                clearConsole();
                sortedByAmount();
                break;
            default:
                clearConsole();
                itemReport();
                break;
        }
    }
    public static void soretedByQty(){
        Scanner input = new Scanner(System.in);
        System.out.println();
                
        System.out.println("\t\t\t_____               _             _     ____              ____  _______ __     __");
        System.out.println("\t\t\t/ ____|             | |           | |   |  _ \\            / __ \\|__   __|\\ \\   / /");
        System.out.println("\t\t\t| (___    ___   _ __ | |_  ___   __| |   | |_) | _   _    | |  | |  | |    \\ \\_/ / ");
        System.out.println("\t\t\t\\___ \\  / _ \\ | '__|| __|/ _ \\ / _` |   |  _ < | | | |   | |  | |  | |     \\   /  ");
        System.out.println("\t\t\t____) || (_) || |   | |_|  __/| (_| |   | |_) || |_| |   | |__| |  | |      | |   ");
        System.out.println("\t\t\t|_____/  \\___/ |_|    \\__|\\___| \\__,_|   |____/  \\__, |    \\___\\_\\  |_|      |_|   ");
        System.out.println("\t\t\t                                                  __/ |                            ");
        System.out.println("\t\t\t                                                 |___/                             ");
        System.out.println();
        System.out.println("\t\t\t__________________________________________________________________________________________");
        System.out.println();
        System.out.println();

        String [][] qtySorted = new String[6][3];

        qtySorted[0][0]="M";
        qtySorted[1][0]="XL";
        qtySorted[2][0]="XS";
        qtySorted[3][0]="S";
        qtySorted[4][0]="XXL";
        qtySorted[5][0]="L";

        int tempM4=0;
        int tempXs4=0;
        int tempXtraXl4=0;
        int tempXLarge4=0;
        int tempSmall4=0;
        int tempLarge4=0;

        int mtotal=0;
        int xstotal=0;
        int xtraxltotal=0;
        int xlargetotal=0;
        int smalltotal=0;
        int largetotal=0;

        qtySorted[0][1]="0";
        qtySorted[1][1]="0";
        qtySorted[2][1]="0";
        qtySorted[3][1]="0";
        qtySorted[4][1]="0";
        qtySorted[5][1]="0";

        for(int i=0; i<customerPhoneNumber.length; i++){
            if(tShirtSizeAr[i].equals("M")){
                tempM4+=quantityAr[i];
                qtySorted[0][1]=String.valueOf(tempM4);
            }else if (tShirtSizeAr[i].equals("XL")){
                tempXLarge4+=quantityAr[i];
                qtySorted[1][1]=String.valueOf(tempXLarge4);
            }else if(tShirtSizeAr[i].equals("XS")){
                tempXs4+=quantityAr[i];
                qtySorted[2][1]=String.valueOf(tempXs4);
            }else if(tShirtSizeAr[i].equals("S")){
                tempSmall4+=quantityAr[i];
                qtySorted[3][1]=String.valueOf(tempSmall4);
            }else if(tShirtSizeAr[i].equals("XXL")){
                tempXtraXl4+=quantityAr[i];
                qtySorted[4][1]=String.valueOf(tempXtraXl4);
            }else if(tShirtSizeAr[i].equals("L")){
                tempLarge4+=quantityAr[i];
                qtySorted[5][1]=String.valueOf(tempLarge4);
            }

            mtotal=tempM4*900;
            xlargetotal=tempXLarge4*1100;
            xstotal=tempXs4*600;
            smalltotal=tempSmall4*800;
            xtraxltotal=tempXtraXl4*1200;           
            largetotal=tempLarge4*1000;

            qtySorted[0][2]=String.valueOf(mtotal);
            qtySorted[1][2]=String.valueOf(xlargetotal);
            qtySorted[2][2]=String.valueOf(xstotal);
            qtySorted[3][2]=String.valueOf(smalltotal);
            qtySorted[4][2]=String.valueOf(xtraxltotal);
            qtySorted[5][2]=String.valueOf(largetotal);
          
        }
        for(int i=5; i>0; i--){           
            for(int j=0; j<i; j++){              
                if(Integer.parseInt(qtySorted[j][1])<Integer.parseInt(qtySorted[j+1][1])){                   
                        String [] swap = qtySorted[j];
                        qtySorted[j]=qtySorted[j+1];
                        qtySorted[j+1]=swap;                    
                }           
            }
        }
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+---------------","----------------","---------------+");
        System.out.printf("\t\t\t\t\t\t|%15s %8s %14s\n","      Size     |","     QTY       |","    Amount    |");   
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+---------------","----------------","---------------+");       
        for(int i=0; i<qtySorted.length; i++){
            if(qtySorted[i][1]!=null){                 
                System.out.printf("\t\t\t\t\t\t| %10s    | %8s       |  %10.2f   |\n",qtySorted[i][0],qtySorted[i][1],Double.parseDouble(qtySorted[i][2]));
                System.out.printf("\t\t\t\t\t\t| %10s    |%8s        |  %10s   |\n","","","");                                            
            }                     
        } 
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+---------------","----------------","---------------+");        
        System.out.println();

        System.out.print("\t\t\t To access the main menu,Please enter 0 : ");
        int accessMenu = input.nextInt();

        if(accessMenu==0){
            clearConsole();
            main(null);
        }
    }
    public static void sortedByAmount(){
        Scanner input = new Scanner(System.in);
        System.out.println();       
        
        System.out.println("\t\t\t_____               _             _     ____                                                       _   ");
        System.out.println("\t\t\t/ ____|             | |           | |   |  _ \\               /\\                                    | |  ");
        System.out.println("\t\t\t| (___    ___   _ __ | |_  ___   __| |   | |_) | _   _       /  \\    _ __ ___    ___   _   _  _ __  | |_ ");
        System.out.println("\t\t\t  \\___ \\  / _ \\ | '__|| __|/ _ \\ / _` |   |  _ < | | | |     / /\\ \\  | '_ ` _ \\  / _ \\ | | | || '_ \\ | __|");
        System.out.println("\t\t\t____) || (_) || |   | |_|  __/| (_| |   | |_) || |_| |    / ____ \\ | | | | | || (_) || |_| || | | || |_ ");
        System.out.println("\t\t\t|_____/  \\___/ |_|    \\__|\\___| \\__,_|   |____/  \\__, |   /_/    \\_\\|_| |_| |_| \\___/  \\__,_||_| |_| \\__|");
        System.out.println("\t\t\t                                                  __/ |                                                  ");
        System.out.println("\t\t\t                                                 |___/                                                   ");
        System.out.println();
        System.out.println("\t\t\t___________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println();

        String[][] amountSorted = new String[6][3];

        amountSorted[0][0]="M";
        amountSorted[1][0]="XL";
        amountSorted[2][0]="XS";
        amountSorted[3][0]="S";
        amountSorted[4][0]="XXL";
        amountSorted[5][0]="L";

        int tempM4=0;
        int tempXs4=0;
        int tempXtraXl4=0;
        int tempXLarge4=0;
        int tempSmall4=0;
        int tempLarge4=0;

        int mtotal=0;
        int xstotal=0;
        int xtraxltotal=0;
        int xlargetotal=0;
        int smalltotal=0;
        int largetotal=0;

        amountSorted[0][1]="0";
        amountSorted[1][1]="0";
        amountSorted[2][1]="0";
        amountSorted[3][1]="0";
        amountSorted[4][1]="0";
        amountSorted[5][1]="0";

        for(int i=0; i<customerPhoneNumber.length; i++){
            if(tShirtSizeAr[i].equals("M")){
                tempM4+=quantityAr[i];
                amountSorted[0][1]=String.valueOf(tempM4);
            }else if (tShirtSizeAr[i].equals("XL")){
                tempXLarge4+=quantityAr[i];
                amountSorted[1][1]=String.valueOf(tempXLarge4);
            }else if(tShirtSizeAr[i].equals("XS")){
                tempXs4+=quantityAr[i];
                amountSorted[2][1]=String.valueOf(tempXs4);
            }else if(tShirtSizeAr[i].equals("S")){
                tempSmall4+=quantityAr[i];
                amountSorted[3][1]=String.valueOf(tempSmall4);
            }else if(tShirtSizeAr[i].equals("XXL")){
                tempXtraXl4+=quantityAr[i];
                amountSorted[4][1]=String.valueOf(tempXtraXl4);
            }else if(tShirtSizeAr[i].equals("L")){
                tempLarge4+=quantityAr[i];
                amountSorted[5][1]=String.valueOf(tempLarge4);
            }

            mtotal=tempM4*900;
            xlargetotal=tempXLarge4*1100;
            xstotal=tempXs4*600;
            smalltotal=tempSmall4*800;
            xtraxltotal=tempXtraXl4*1200;           
            largetotal=tempLarge4*1000;

            amountSorted[0][2]=String.valueOf(mtotal);
            amountSorted[1][2]=String.valueOf(xlargetotal);
            amountSorted[2][2]=String.valueOf(xstotal);
            amountSorted[3][2]=String.valueOf(smalltotal);
            amountSorted[4][2]=String.valueOf(xtraxltotal);
            amountSorted[5][2]=String.valueOf(largetotal);
          
        }
        for(int i=5; i>0; i--){           
            for(int j=0; j<i; j++){              
                if(Integer.parseInt(amountSorted[j][2])<Integer.parseInt(amountSorted[j+1][2])){                   
                        String [] swap = amountSorted[j];
                        amountSorted[j]=amountSorted[j+1];
                        amountSorted[j+1]=swap;                    
                }           
            }
        }
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+---------------","----------------","---------------+");
        System.out.printf("\t\t\t\t\t\t|%15s %8s %14s\n","      Size     |","     QTY       |","    Amount    |");   
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+---------------","----------------","---------------+");       
        for(int i=0; i<amountSorted.length; i++){
            if(amountSorted[i][1]!=null){                 
                System.out.printf("\t\t\t\t\t\t| %10s    | %8s       |  %10.2f   |\n",amountSorted[i][0],amountSorted[i][1],Double.parseDouble(amountSorted[i][2]));
                System.out.printf("\t\t\t\t\t\t| %10s    |%8s        |  %10s   |\n","","","");                                            
            }                     
        } 
        System.out.printf("\t\t\t\t\t\t%15s+%8s+%14s\n","+---------------","----------------","---------------+");        
        System.out.println();

        System.out.print("\t\t\t To access the main menu,Please enter 0 : ");
        int accessMenu = input.nextInt();

        if(accessMenu==0){
            clearConsole();
            main(null);
        }
    }
    public static void ordersReports(){
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("\t\t\t____            _                 _____                            _        ");
        System.out.println("\t\t\t/ __ \\          | |               |  __ \\                          | |       ");
        System.out.println("\t\t\t| |  | | _ __  __| |  ___  _ __    | |__) | ___  _ __    ___   _ __ | |_  ___ ");
        System.out.println("\t\t\t| |  | || '__|/ _` | / _ \\| '__|   |  _  / / _ \\| '_ \\  / _ \\ | '__|| __|/ __|");
        System.out.println("\t\t\t| |__| || |  | (_| ||  __/| |      | | \\ \\|  __/| |_) || (_) || |   | |_ \\__ \\");
        System.out.println("\t\t\t\\____/ |_|   \\__,_| \\___||_|      |_|  \\_\\___|| .__/  \\___/ |_|    \\__||___/");
        System.out.println("\t\t\t                                               | |                           ");
        System.out.println("\t\t\t                                               |_|                           ");
        System.out.println();
        System.out.println("\t\t\t_____________________________________________________________________________________");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t [1] All Orders ");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t [2] Orders By Amount ");
        System.out.println();      
        System.out.println();

        System.out.print("\t\t\t\t\t Enter Option: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                clearConsole();
                allOrders();                
                break;
            case 2:
                clearConsole();
                orderByAmount();
                break;
        
            default:
                break;
        }
        
    }
    public static void allOrders(){
        Scanner input = new Scanner(System.in);
        System.out.println();
                
        System.out.println("\t\t\t__      __ _                      ____            _                  ");
        System.out.println("\t\t\t\\ \\    / /(_)                    / __ \\          | |                 ");
        System.out.println("\t\t\t\\ \\  / /  _   ___ __      __   | |  | | _ __  __| |  ___  _ __  ___ ");
        System.out.println("\t\t\t\\ \\/ /  | | / _ \\ \\ /\\ / /   | |  | || '__|/ _` | / _ \\| '__|/ __|");
        System.out.println("\t\t\t\\  /   | ||  __/ \\ V  V /    | |__| || |  | (_| ||  __/| |   \\__ \\");
        System.out.println("\t\t\t\\/    |_| \\___|  \\_/\\_/      \\____/ |_|   \\__,_| \\___||_|   |___/");
        System.out.println();
        System.out.println("\t\t\t_____________________________________________________________________________________");
        System.out.println();
        System.out.println();                                                                                                        
 
        String [] temporderStatus = new String[orderStatusAr.length];
        for(int i=0; i<orderStatusAr.length; i++){
            if(orderStatusAr[i]==1){
                temporderStatus[i]="Delivering";
            }else if(orderStatusAr[i]==2){
                temporderStatus[i]="Delivered";
            }else{
                temporderStatus[i]="Processing";
            }
        }

        System.out.printf("\t\t\t +-------------+---------------+--------+--------+------------+----------------+%n");
        System.out.printf("\t\t\t | %10s  |%14s | %6s | %6s | %10s | %10s     |%n","Order iD","Customer ID","Size","QTY","Amount","Status");
        System.out.printf("\t\t\t +-------------+---------------+--------+--------+------------+----------------+%n");   

        for(int i=orderId.length-1; i>=0; i--){
            System.out.printf("\t\t\t | %10s  |%14s | %6s | %6d | %10.2f | %10s      |%n",orderId[i],customerPhoneNumber[i],tShirtSizeAr[i],quantityAr[i],amountAr[i],temporderStatus[i]);           
        }
        System.out.printf("\t\t\t +-------------+---------------+--------+--------+------------+----------------+%n");

        System.out.print("\t\t\t To access the main menu,Please enter 0 : ");
        int accessMenu = input.nextInt();

        if(accessMenu==0){
            clearConsole();
            main(null);
        }
    }
    public static void orderByAmount(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        
        System.out.println("\t\t\t____            _                ____                                                       _   ");
        System.out.println("\t\t\t/ __ \\          | |              |  _ \\               /\\                                    | |  ");
        System.out.println("\t\t\t| |  | | _ __  __| |  ___  _ __   | |_) | _   _       /  \\    _ __ ___    ___   _   _  _ __  | |_ ");
        System.out.println("\t\t\t| |  | || '__|/ _` | / _ \\| '__|  |  _ < | | | |     / /\\ \\  | '_ ` _ \\  / _ \\ | | | || '_ \\ | __|");
        System.out.println("\t\t\t| |__| || |  | (_| ||  __/| |     | |_) || |_| |    / ____ \\ | | | | | || (_) || |_| || | | || |_ ");
        System.out.println("\t\t\t\\____/ |_|   \\__,_| \\___||_|     |____/  \\__, |   /_/    \\_\\|_| |_| |_| \\___/  \\__,_||_| |_| \\__|");
        System.out.println("\t\t\t                                          __/ |                                                  ");
        System.out.println("\t\t\t                                         |___/                                                   ");
        System.out.println();
        System.out.println("\t\t\t_____________________________________________________________________________________");
        System.out.println();
        System.out.println();


        for(int i=amountAr.length-1; i>0; i--){
            for(int j=0; j<i; j++)
            if(amountAr[j]<amountAr[j+1]){
                double swap=amountAr[j];
                amountAr[j]=amountAr[j+1];
                amountAr[j+1]=swap;

                String swap2=orderId[j];
                orderId[j]=orderId[j+1];
                orderId[j+1]=swap2;

                String swap3 = customerPhoneNumber[j];
                customerPhoneNumber[j]=customerPhoneNumber[j+1];
                customerPhoneNumber[j+1]=swap3;

                String swap4 = tShirtSizeAr[j];
                tShirtSizeAr[j]=tShirtSizeAr[j+1];
                tShirtSizeAr[j+1]=swap4;

                int swap5 = quantityAr[j];
                quantityAr[j]=quantityAr[j+1];
                quantityAr[j+1]=swap5;
            }
        }

        String [] temporderStatus = new String[orderStatusAr.length];
        for(int i=0; i<orderStatusAr.length; i++){
            if(orderStatusAr[i]==1){
                temporderStatus[i]="Delivering";
            }else if(orderStatusAr[i]==2){
                temporderStatus[i]="Delivered";
            }else{
                temporderStatus[i]="Processing";
            }
        }

        System.out.printf("\t\t\t +-------------+---------------+--------+--------+------------+----------------+%n");
        System.out.printf("\t\t\t | %10s  |%14s | %6s | %6s | %10s | %10s     |%n","Order iD","Customer ID","Size","QTY","Amount","Status");
        System.out.printf("\t\t\t +-------------+---------------+--------+--------+------------+----------------+%n");   

        for(int i=0; i<orderId.length; i++){
            System.out.printf("\t\t\t | %10s  |%14s | %6s | %6d | %10.2f | %10s     |%n",orderId[i],customerPhoneNumber[i],tShirtSizeAr[i],quantityAr[i],amountAr[i],temporderStatus[i]);           
        }
        System.out.printf("\t\t\t +-------------+---------------+--------+--------+------------+----------------+%n");

        System.out.println();
        System.out.print("\t\t\t To access the main menu,Please enter 0 : ");
        int accessMenu = input.nextInt();

        if(accessMenu==0){
            clearConsole();
            main(null);
        }
    }
    public static void changeOrderStatus(){
        Scanner input =  new Scanner(System.in);
        DecimalFormat decor = new DecimalFormat("0.00");
        System.out.println();      
        
        System.out.println("\t\t\t____            _                 _____  _          _               ");
        System.out.println("\t\t\t/ __ \\          | |               / ____|| |        | |              ");
        System.out.println("\t\t\t| |  | | _ __  __| |  ___  _ __   | (___  | |_  __ _ | |_  _   _  ___ ");
        System.out.println("\t\t\t| |  | || '__|/ _` | / _ \\| '__|   \\___ \\ | __|/ _` || __|| | | |/ __|");
        System.out.println("\t\t\t| |__| || |  | (_| ||  __/| |      ____) || |_| (_| || |_ | |_| |\\__ \\");
        System.out.println("\t\t\t\\____/ |_|   \\__,_| \\___||_|     |_____/  \\__|\\__,_| \\__| \\__,_||___/");
        System.out.println();
        System.out.println("\t\t\t_____________________________________________________________________________________");
        System.out.println();
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t Enter Order ID: ");
        String custEnterOrderNumber = input.nextLine();
        System.out.println();

        boolean isValid=false;

        for(int i=0; i<orderId.length; i++){
            if(custEnterOrderNumber.equals(orderId[i])){
                System.out.println("\t\t\t\t\t\t\t Phone Number : "+ customerPhoneNumber[i]);
                System.out.println("\t\t\t\t\t\t\t Size \t :\t "+ tShirtSizeAr[i]);
                System.out.println("\t\t\t\t\t\t\t QTY \t : \t "+quantityAr[i]);
                System.out.println("\t\t\t\t\t\t\t Amount  : \t "+ decor.format(amountAr[i]));

                String printOrderStatus="";
                if(orderStatusAr[i]==1){
                    printOrderStatus="DELIVERING";
                }else if(orderStatusAr[i]==2){
                    printOrderStatus="DELIVERED";
                }else{
                    printOrderStatus="PROCESSING";
                }
                System.out.println("\t\t\t\t\t\t\t Amount  : \t "+ printOrderStatus);               

                System.out.println();

                isValid=true;

                char changeOrderStatus = 'Y';
                System.out.print("\t\t\t\t\t\t\t Do you want to Change this order status? (y/n) : ");
                changeOrderStatus = input.next().charAt(0);
                System.out.println();

                if(changeOrderStatus=='Y'|| changeOrderStatus=='y'){
                    if(orderStatusAr[i]==0){
                        System.out.println("\t\t\t\t\t [1] Order Delivering");
                        System.out.println();
                        System.out.println("\t\t\t\t\t [2] Order Delivered");
                        System.out.println();
    
                        System.out.print("\t\t\t Enter An Option: ");
                        int orderStatusChange = input.nextInt();
                        System.out.println();
    
                        switch (orderStatusChange) {
                            case 1:
                                orderStatusAr[i]=delivering;                        
                                break;
                            case 2:
                                orderStatusAr[i]=delivered;                        
                                break;                         
                        }
    
                        System.out.println("\t\t\t Status Updated...!");
                        System.out.println();
    
                        char anotherchange1 = 'Y';
                        System.out.print("\t\t\t\t\t\t\t Do you want to Change Another order status? (y/n) : ");
                        anotherchange1 = input.next().charAt(0);
                        System.out.println();
    
                        if(anotherchange1=='Y'|| anotherchange1=='y'){
                            clearConsole();
                            changeOrderStatus();
                        }else{
                            clearConsole();
                            main(null);
                        }
    
                    }else if(orderStatusAr[i]==1){                                        
                        System.out.println("\t\t\t\t\t [1] Order Delivered");
                        System.out.println();
    
                        System.out.print("\t\t\t Enter An Option: ");
                        int orderStatusChange2 = input.nextInt();
                        System.out.println();
    
                        switch (orderStatusChange2) {
                            case 1:
                                orderStatusAr[i]=delivered;                        
                                break;                                                 
                        }
                        System.out.println("\t\t\t Status Updated...!");
                        System.out.println();
    
                        char anotherchange2 = 'Y';
                        System.out.print("\t\t\t\t\t\t\t Do you want to Change Another order status? (y/n) : ");
                        anotherchange2 = input.next().charAt(0);
                        System.out.println();
    
                        if(anotherchange2=='Y'|| anotherchange2=='y'){
                            clearConsole();
                            changeOrderStatus();
                        }else{
                            clearConsole();
                            main(null);
                        }
    
                    }else if(orderStatusAr[i]==2){
                        System.out.println("\t\t\t\t\t Cant Change this order status...order already delivered...!");
                        System.out.println();
    
                        char anotherchange3 = 'Y';
                        System.out.print("\t\t\t\t\t\t\t Do you want to Change Another order status? (y/n) : ");
                        anotherchange3 = input.next().charAt(0);
                        System.out.println();
    
                        if(anotherchange3=='Y'|| anotherchange3=='y'){
                            clearConsole();
                            changeOrderStatus();
                        }else{
                            clearConsole();
                            main(null);
                        }
                    }  
                    
                }else {
                    clearConsole();
                    main(null);
                }                              
            }
        }                                                                   
    } 
      
}