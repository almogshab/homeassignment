# User Greeting Application

This is a simple web application built with Spring Boot using Gradle and jdk17 as the build tool for the backend, and plain HTML, CSS, and JavaScript for the frontend. The application allows users to enter their name, submit it to the server, and receive a personalized greeting in response.


## Features

* **User Name Input**: Users can enter their name in an input field.
* **POST Request**: The entered name is sent to the backend using a POST request.
* **GET Request**: The application retrieves the saved name from the backend using a GET request.
* **Personalized Greeting**: Displays a greeting message including the submitted name.
* **Responsive Design**: Basic styling is applied using CSS for a user-friendly interface.

## Project Structure

The project is structured as a standard Spring Boot application with a separate frontend.

### Map Files

```
Homeassignment/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── datanet/
│   │   │           └── homeassignment/
│   │   │               ├── HomeassignmentApplication.java
│   │   │               ├── controller/
│   │   │               │   └── UserController.java
│   │   │               └── model/
│   │   │                   └── User.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html
│   │       │   ├── script.js
│   │       │   └── style.css
│   │       └── application.properties
```

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

### Running on windows without installation (no knowledge required:

- Download the two zip files: [click here](https://drive.google.com/file/d/1wefQ6dJYHFj8tizDEdEjx0khQVRMp4dZ/view?usp=sharing)
- Extract it into two: HomeAssignment.exe   (folder)
- Double click on HomeAssignment.exe and as long as the black screen appears it works
- Enter in your browser into: http://localhost:8080/ or [click here](http://localhost:8080/)


## Requirements for Running on IDE (such as Visual Studio Code), knowledge required

- Java Development Kit (JDK) 17
- Gradle (included via Gradle Wrapper)
- Download the project from git and open the project's foler

## Running project via Codespaces (no installation required, knowledge required)

<img src="https://raw.githubusercontent.com/almogshab/homeassignment/refs/heads/main/photos/screen_shoot3.PNG" alt="תיאור ALT" width="450" />
- Make online installation for the required stuff
- Open the file "HomeassignmentApplication.java"
- Click the Run button in the upper toolbar (top-right corner).



## photos

<img src="https://raw.githubusercontent.com/almogshab/homeassignment/refs/heads/main/photos/screen_shoot1.PNG" alt="תיאור ALT" width="300" />


<img src="https://raw.githubusercontent.com/almogshab/homeassignment/refs/heads/main/photos/screen_shoot2.PNG" alt="תיאור ALT" width="300" />



