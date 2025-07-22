# User Greeting Application

This is a simple web application built with Spring Boot for the backend and plain HTML, CSS, and JavaScript for the frontend. The application allows a user to enter their name, submit it to the server, and then displays a personalized greeting.

## Features

* **User Name Input**: Users can enter their name in an input field.
* **POST Request**: The entered name is sent to the backend using a POST request.
* **GET Request**: The application retrieves the saved name from the backend using a GET request.
* **Personalized Greeting**: Displays a greeting message including the submitted name.
* **Responsive Design**: Basic styling is applied using CSS for a user-friendly interface.

## Project Structure

The project is structured as a standard Spring Boot application with a separate frontend.

### Backend (Spring Boot)

* `com.datanet.homeassignment.HomeassignmentApplication.java`: The main Spring Boot application entry point.
* `com.datanet.homeassignment.controller.UserController.java`: A REST controller that handles HTTP requests for user data.
    * `POST /api/user`: Saves the user's name.
    * `GET /api/user`: Retrieves the saved user's name.
* `com.datanet.homeassignment.model.User.java`: A simple POJO (Plain Old Java Object) representing the User entity with `name` and `age` fields.

### Frontend (HTML, CSS, JavaScript)

* `index.html`: The main HTML page containing the input field, submit button, and a div to display the greeting.
* `style.css`: Provides basic styling for the HTML elements.
* `script.js`: Contains the JavaScript functions to handle user input, make API calls, and update the UI.
    * `submitName()`: Sends a POST request with the entered name.
    * `retrieveName()`: Sends a GET request to fetch the saved name and updates the greeting message.

## How to Run

To run this application, follow these steps:

### 

