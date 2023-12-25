# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### Part C: Customize the HTML user interface for your customer’s application.
#### mainscreen.html
Line 14: Changed title from "My Bicycle Shop" to "Leroy's Computer Store".<br />
Line 19: Changed the "Shop" h1 header to "Shop PCs and Parts". <br />
Line 21: Changed the "Parts" h2 header to "Computer Parts".<br />
Line 53 Changed the "Products" h2 header to "PCs".

### Part D: Add an “About” page to the application
#### About.html
Created About.html.<br />
Line 5: Added title "About Us".<br />
Line 8: Added h1 header "About Leroy's Computer Store".<br />
Line 11: Added h2 header "Our Story".<br />
Line 12: Added text description.
#### AboutController.java
Created AboutController.java<br />
Line 7: Signified class was a controller with "@Controller".<br />
Line 10: Added getAbout() method and mapped the About page to the website using "@GetMapping".<br />
Line 15: Added link to mainscreen.
#### mainscreen.html
Line 89: Added a button that links to the "about" page

### Part E: Add a sample inventory appropriate for your chosen store to the application
#### BootStrapData.java
Line 43: Added "CPU" outsourced part.<br />
Line 56: Added "motherboard" outsourced part.<br />
Line 64: Added "RAM" outsourced part.<br />
Line 72: Added "GPU" outsourced part.<br />
Line 80: Added "PSU" outsourced part.<br />
Line 98: Added "gamingPC" product.<br />
Line 99: Added "workstation" product.<br />
Line 100: Added "streamingPC" product.<br />
Line 101: Added "budgetPC" product.<br />
Line 102: Added "server" product.<br />

### Part F: Add a “Buy Now” button to your product list.
#### mainscreen.html
Line 85: Added "Buy Now" button next to products.<br />
#### BuyNowController.java
Created BuyNowController.java<br />
Line 17: Added productRepository object.<br />
Line 20: Added buyProduct() method and mapped "/buyProduct".<br />
Line 21: Added an optional product object in case of null return.<br />
Line 23: Added conditional to assign optionalProduct to product object if it satisfies isPresent() method.<br />
Line 26: Added conditional to decrement product if there are any available to buy.<br />
Line 28: save() the new number to productRepository.<br />
Line 29: Return the "buysuccess" page.<br />
Line 31: Return "buyerror" page if the product is out of stock.<br />
Line 34: Return "buyerror" page if the product is not found.<br />
#### buysuccess.html
Created buysuccess.html<br />
Line 5: Added "Buy Success" title.<br />
Line 8: Added h1 message for successful purchase.<br />
#### buyerror.html
Created buyerror.html<br />
Line 5: Added "Buy Error" title.<br />
Line 8: Added h1 message for purchase failure.<br />

### Part G

### Part H

### Part I

### Part J
