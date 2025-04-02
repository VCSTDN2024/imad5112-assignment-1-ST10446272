# Meal App
- Developer: Likhona Ngwenya
- Student Number: ST10446272
- Group: GR01
- Course: Higher Certificate in Mobile Application and Web Development (HMAW0501)
- Subject: IMAD5112

# Links
- GitHub Repository: [[Repository URL]](https://github.com/VCSTDN2024/imad5112-assignment-1-ST10446272)
- YouTube Video: [https://youtu.be/CcvnVvGIbnA](https://youtu.be/CcvnVvGIbnA)


# 2. Project Overview
-------------------

## Project Overview
The Meal App is a mobile application developed as part of an assignment in the IMAD5112 subject.
This application was created using Kotlin and Android Studio. The app's primary purpose is to provide meal suggestions based on the time of day inputted
helping the user decide on a meal when struggling with deciding on what to eat on busy days. The app was developed to meet the requirements of the assignment,
which includes creating a functional mobile app and utilizing GitHub for version control and CI/CD automation using GitHub Actions.



3. App Purpose and Features
---------------------------
## Purpose and Features

### Purpose:
The main goal of this app is to [explain the app’s functionality]. 

### Key Features:
1. Feature 1: The Landing/Welcome Screen serves as the introductory interface when users open the app. Since it is a meal app, with the text "Bon Appetit" giving the user more context in and around the app and a button labeled "Let’s Cook", which leads to the main functionality of the app.
2. Feature 2: Home Screen (User Interface) - The interface has a textbox where the user can enter the time of day
3. Feature 3: The interface has a textbox that displays the meal suggestion bases on the time of the day inputted on the input textbox
4. Feature 4: A search button the runs the input and displays content accordingly
5. Feature 5: Rest/Clear Button - the clear button clears the input as well as the meal suggestions  the text box
6. Feature 6: An exit button that closes and finishes the app

These features aim to provide [what the app aims to achieve, e.g., an easy-to-use platform for managing tasks or organizing personal information].


4. Design Considerations
------------------------

## Design Considerations

The design of the Meal App was based on the following key considerations:

1. User Experience (UX): The app was designed with the goal of providing an intuitive and easy-to-navigate user interface, ensuring a seamless user experience.
   
2. Responsiveness: The app was built to ensure it performs well on different screen sizes, with particular attention to device compatibility.
   
3. Simplicity: The design is minimalistic, focusing on core features without overwhelming the user.
   
4. Performance: Code optimization was considered to ensure fast response times and low battery usage.


5. GitHub and GitHub Actions Utilization
----------------------------------------
## GitHub and GitHub Actions

This project was managed using **GitHub** for version control, where all code changes were committed and pushed regularly. GitHub enabled collaborative coding, allowing me to keep track of changes and maintain project integrity.

### GitHub Actions:
I utilized **GitHub Actions** to automate the build and deployment process. This includes:

- Running automated **tests** to ensure the app’s functionality.
- Compiling the app into **APK** and **AAB** files, which are the formats required for distribution.
- Uploading these build artifacts to GitHub for easy access.

The workflow ensures that my project is automatically built and tested every time I push changes, and it simplifies the process of delivering the final APK/AAB files for submission.


6. Screenshots and App Demo
---------------------------
## Screenshots

### App Screenshots:
Screenshot 1: MainActivity.kt
![Screenshot 2025-04-01 175545](https://github.com/user-attachments/assets/cded7393-bfe5-45be-9105-c979afc34254)
-> (Line 1)Package Declaration
-> (Lines 3-8) Import Statements
-> (Lines 10-27) Class Definition
-> (Lines 16-27) Activity Initialization/ Initializes UI elements in onCreate().
-> (Lines 24-27) Setting Button Click Listener

Screenshot 2: MainActivity2.kt
![Screenshot 2025-04-01 175606](https://github.com/user-attachments/assets/8fdc96b4-5925-49f6-9599-d9bbfcf27a12)
-> (Lines 10-15) Importing Required Libraries
-> (Lines 17-24) Declaring Variables for UI Elements
-> (Lines 26-37) Activity Initialization/ Initializes UI elements in onCreate().

Screenshot 3: MainActivity2.kt
![Screenshot 2025-04-01 175633](https://github.com/user-attachments/assets/16a654a0-97e9-492d-9127-aadae30616bb)
-> (Line 36) Initialization of the Exit Button
-> (Line 36 - 48) Setting On click listeners for the buttons and calls functions accordingly
-> (Line 50) Processes user input -> (Line 52) checking if input is Not Empty, and if the input is appropriate
-> (Line 54) matching user input with meal options -> (Line 56 - 65)Assign meal suggestions accordingly

Screenshot 4:
![Screenshot 2025-04-01 175659](https://github.com/user-attachments/assets/2e040921-60d2-4d0d-9a15-1e91797ace10)
-> (Line 66) Assign meal suggestions accordingly using the input(time if day)
-> (Line 69 - 72) If the input does not match the time of day inputted, it sets the output to alien(error handling)
-> (Lines 77-85) Input Validation Function, This function checks if a text field (timeOfDay.text) is empty.
-> ( Lines 85 - 89) This function closes the app (the app stops running)

Video Demo:
A video showcasing the app's functionality can be viewed here: [https://youtu.be/CcvnVvGIbnA].



7. Challenges and Learnings
---------------------------
## Challenges and Learnings

During the development of this project, I encountered several challenges, including:
1. **Challenge 1**: [Implementing the background image and the app either not running(opening) as well as crashing]
   - **Solution**: I decreased the image size
   
2. **Challenge 2**: Debugging issues related to Gradle builds.
   - **Solution**: Printing the Input for Debugging 

From these challenges, I learned important lessons in debugging, using version control, and automating build processes with GitHub Actions.


8. Future Enhancements
----------------------
## Future Enhancements

While the current version of the app provides the core functionality, there are several features that could be added in the future, including:

1. Feature 1: Allowing users to set up reminders or notifications
2. Feature 2: Change the Welcome Screen in to a login in screen offering more personalized meal suggestions depending on who has logged in
3. Feature 3: Display an image of the meal suggestions as well as the ingredients and a step by step method of how to make a particular meal
4. Feature 4: Adding more meal suggestions
5. Feature 5: Making my text bolder

These enhancements would improve the app’s usability and make it even more versatile for end-users.

9. References
-------------
## References

1. Reference 1: https://www.delish.com/cooking/recipe-ideas/g36890133/healthy-meal-prep-recipes/ 
2. Reference 2: https://insanelygoodrecipes.com/after-school-snacks/
3. Reference 3: https://www.allrecipes.com/gallery/breakfast-finger-foods/
4. Reference 4: https://sharpaspirant.com/meal-prep-ideas-breakfast/#google_vignette 
5. Reference 5: https://www.pexels.com/photo/red-strawberries-and-stainless-steel-spoons-on-a-black-surface-8019484/
6. Reference 6: https://www.pexels.com/photo/red-strawberries-and-stainless-steel-spoons-on-a-black-surface-8019484/


10. List of Figures
-------------------
## List of Figures

- **Figure 1**: Screenshot of the app's wlecome screen.
![Screenshot 2025-04-02 134233](https://github.com/user-attachments/assets/d18f8e43-ba14-4b2b-a457-6d4cbd75a6b2)

- **Figure 2**: Screenshot of the user home screen.
  ![Screenshot 2025-04-02 134246](https://github.com/user-attachments/assets/22028244-6071-420d-a946-e940acb8ebd1)



```

