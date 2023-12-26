# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### Part C: Customize the HTML user interface for your customer’s application.
#### mainscreen.html:
Line 14: Changed title from "My Bicycle Shop" to "Leroy's Computer Store".<br />
Line 19: Changed the "Shop" h1 header to "Shop PCs and Parts". <br />
Line 21: Changed the "Parts" h2 header to "Computer Parts".<br />
Line 53 Changed the "Products" h2 header to "PCs".

### Part D: Add an “About” page to the application
#### About.html:
Created About.html.<br />
Line 5: Added title "About Us".<br />
Line 8: Added h1 header "About Leroy's Computer Store".<br />
Line 11: Added h2 header "Our Story".<br />
Line 12: Added text description.<br /><br />
#### AboutController.java:
Created AboutController.java<br />
Line 7: Signified class was a controller with "@Controller".<br />
Line 10: Added getAbout() method and mapped the About page to the website using "@GetMapping".<br />
Line 15: Added link to mainscreen.<br /><br />
#### mainscreen.html:
Line 89: Added a button that links to the "about" page

### Part E: Add a sample inventory appropriate for your chosen store to the application
#### BootStrapData.java:
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
#### mainscreen.html:
Line 85: Added "Buy Now" button next to products.<br /><br />
#### BuyNowController.java:
Created BuyNowController.java<br />
Line 17: Added productRepository object.<br />
Line 20: Added buyProduct() method and mapped "/buyProduct".<br />
Line 21: Added an optional product object in case of null return.<br />
Line 23: Added conditional to assign optionalProduct to product object if it satisfies isPresent() method.<br />
Line 26: Added conditional to decrement product if there are any available to buy.<br />
Line 28: save() the new number to productRepository.<br />
Line 29: Return the "buysuccess" page.<br />
Line 31: Return "buyerror" page if the product is out of stock.<br />
Line 34: Return "buyerror" page if the product is not found.<br /><br />
#### buysuccess.html:
Created buysuccess.html<br />
Line 5: Added "Buy Success" title.<br />
Line 8: Added h1 message for successful purchase.<br /><br />
#### buyerror.html:
Created buyerror.html<br />
Line 5: Added "Buy Error" title.<br />
Line 8: Added h1 message for purchase failure.<br />

### Part G:  Modify the parts to track maximum and minimum inventory
#### Part.java:
Line 31: Added field int invMax with @Min annotation.<br />
Line 33: Added field int invMin with @Min annotation.<br />
Line 57: Added constructor to include the new fields.<br />
Line 98: Added getter for invMax.<br />
Line 102: Added setter for invMax.<br />
Line 106: Added getter for invMin.<br />
Line 110: Added setter for invMin.<br />
Line 140: Added boolean method enforceInv to help enforce that inventory is within valid range.<br /><br />
#### BootStrapData.java:
Line 47: Added invMax to CPU.<br />
Line 48: Added invMin to CPU.<br />
Line 62: Added invMax to motherboard.<br />
Line 63: Added invMin to motherboard.<br />
Line 72: Added invMax to RAM.<br />
Line 73: Added invMin to RAM.<br />
Line 82: Added invMax to GPU.<br />
Line 83: Added invMIN to GPU.<br />
Line 92: Added invMax to PSU.<br />
Line 93: Added invMin to PSU.<br /><br />
#### mainscreen.html:
Line 38: Added column for Min Inventory.<br />
Line 39: Added column for Max Inventory.<br />
Line 48: Added field to show invMin for each part.<br />
Line 49: Added field to show invMax for each part.<br /><br />
#### application.properties:
Line 6: Changed name of spring boot database to spring-boot-h2-db103<br /><br />
#### OutsourcedPartForm.html:
Line 25: Added input field for minimum inventory.<br />
Line 28: Added input field for maximum inventory.<br /><br />
#### InhousePartForm.html:
Line 24: Added input field for minimum inventory.<br />
Line 25: Added input field for maximum inventory.<br /><br />
#### AddOutsourcedPartController.java:
Line 44: Added conditional using the new enforceInv() method and BindingResult to<br />
display an error message when a user tries to enter out-of-bounds inventory numbers<br /><br />
#### AddInhousePartController.java:
Line 43: Added conditional using the new enforceInv() method and BindingResult to<br />
display an error message when a user tries to enter out-of-bounds inventory numbers<br />

### Part H: Add validation for between or at the maximum and minimum fields
#### AddOutsourcedPartController.java:
Line 44: Commented out less specific error/error message.<br />
Line 49: Added specific error/error message for falling below inventory minimum.<br />
Line 54: Added specific error/error message for raising above inventory maximum.<br /><br />
#### AddInhousePartController.java:
Line 43: Commented out less specific error/error message.<br />
Line 48: Added specific error/error message for falling below inventory minimum.<br />
Line 53: Added specific error/error message for raising above inventory maximum.<br /><br />
#### EnufPartsValidator.java:
Line 36: Added to if statement to return false if adding a product will make parts fall below minimum.<br /><br />
#### ValidEnufParts.java:
Line 20: Changed error message to specifically mention part minimum.<br />

### Part I: Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package
#### PartTest.java:
Line 161: Added test for minimum inventory field.<br />
Line 170: Added test for maximum inventory field.<br />

### Part J: Remove the class files for any unused validators in order to clean your code.
Deleted DeletePartValidator.java because it is never used.