# Garden Management System 🌱  

## Overview  
This repository showcases a **Java Spring web application** designed to manage gardens and their flowers. The system supports CRUD operations for gardens and flowers, along with server-side validation. It also demonstrates the integration of JSPs for view rendering and controllers to handle various user interactions.

---

## Key Features  
- **CRUD Functionality**: Create, Read, Update, and Delete operations for gardens and flowers.  
- **Dynamic Relationships**:  
  - Each garden has multiple flowers.  
  - Flowers belong to a specific garden.  
- **JSP Integration**: Interactive views for listing and managing gardens and flowers.  
- **Validation**:  
  - Ensures data integrity, e.g., unique garden IDs and limited flower attributes.  
  - Provides error messages for invalid entries.  
- **Parameter Passing**: Controllers efficiently manage data using request parameters for better UX.

---

## Project Structure  

- **Domain Classes**:  
  - `Garden`: Represents a garden with details like ID, address, and type.  
  - `Flower`: Represents flowers with properties such as name, color, and number of varieties.  

- **Controllers**:  
  - `MainController`: Handles the homepage.  
  - `GardenController`: Manages gardens and their associated views.  
  - `FlowerController`: Manages flowers, including form handling and list displays.
 
- **Validation Utilities**:
  - `FlowerValidator`: Ensures the integrity of flower data by validating properties like name, country, petals, and varieties before processing.
  - `GardenValidator`: Validates garden data to ensure unique IDs, non-empty addresses, and valid types during form submissions.

- **JSP Views**:  
  - Dynamic pages for listing, adding, and validating gardens and flowers.  
