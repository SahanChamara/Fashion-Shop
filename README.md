<div>
  <center><h1>Fashion Shop Customer Details Management System</h1></center> <br>
</div>

<div>
  <h2>Overview</h2><br>
<p>The Fashion Shop Management System is a full featured application built in Java that allows for the proper management of customers’ orders, order placement, order status and reporting. Based on the Object-Oriented Programming (OOP) approach, this system was developed with the support of the principles of encapsulation to provide high data protection.</p> <br>
<h2>Features</h2>
  <ul>
      <li><b>Order Management</b>: Place, view, and delete customer orders.</li>
      <li><b>Customer Search</b>: Search for customers by phone number.</li>
      <li><b>Order Status Tracking</b>: Update and view the status of orders (Processing, Delivering, Delivered).</li>
      <li><b>Reporting: Generate reports on customer orders and sales statistics.</b></li>
    </ul>
<h2>Technologies Used</h2>
<h4>Java SE</h4>
<h4>OOP principle -Encapsulation</h4>        <br>
<h1>Encapsulation Concept</h1>
<p>Encapsulation is another main principle of OOP, it took its name from possibility of object to encapsulate its necessary data. This means that the application groups the data (attributes) and the methods (functions) that use the data together into a single entity, known as the class and also provides access control to some of parts of the object. This is achieved by:<p>

<p>Private Variables: Every member variable in the classes is declared as private. This also make them inaccessible from outside the class hence they support the principle of polymorphism.</p>

<p>Public Methods: For the private variables, there are public getter and setter methods for interaction with the external objects. This makes it possible to achieve access and validation of the data desired before setting or retrieval can take place.</p>
</div>
<br>
<div>
  <h1>Example of Encapsulation in the Program</h1>
  <p>
    class FashionShopCustomerDetails { <br>
    private String orderId; <br>
    private String phoneNumber; <br>
    private String size; <br>
    private int quantity; <br>
    private double amount; <br>
    private int orderStatus; <br>

    // Constructor
    public FashionShopCustomerDetails(String orderId, String phoneNumber, String size, int quantity, double amount, int orderStatus) {
        this.orderId = orderId;
        this.phoneNumber = phoneNumber;
        this.size = size;
        this.quantity = quantity;
        this.amount = amount;
        this.orderStatus = orderStatus;
    }

    // Getter and Setter methods
    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    // Other getters and setters...
}
  </p>
</div>
<div>
  <h1>Benefits of Using Encapsulation</h1>
  <ul>
    <li><b>Data Protection</b>: Sensitive data is protected from unauthorized access and modification.</li>
    <li><b>Controlled Access</b>: Getters and setters allow for validation and control over how data is accessed and modified.</li>
<li><b>Maintainability</b>: Changes to the internal implementation of a class can be made without affecting external code that uses the class.</li>
<li><b>Increased Flexibility<b>: The internal representation of an object can be changed without modifying the code that uses it.</li>
  </ul>
</div>
<br>
<div>
  <h1>Conclusion</h1>
  <p>
    The Fashion Shop Management System employs most aspects of OOP to enable an effective account management application for customers while endorsing encapsulation. Thus, by encapsulating data and methods, the program safeguards its data, improve its maintainability and also offers clear interface to the user.
  </p>
</div>
