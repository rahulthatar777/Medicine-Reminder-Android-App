# Medicine Reminder App

The **Medicine Reminder App** is a mobile application designed to help users manage their medication schedules. Built using **Java** and **Firebase**, this app allows users to set reminders for their medications, ensuring they never miss a dose. The app provides a user-friendly interface and utilizes Firebase for real-time database management and user authentication.

## Features

- **User Authentication**: Secure login and registration using Firebase Authentication.
- **Medication Scheduling**: Easily add, edit, and delete medication reminders.
- **Push Notifications**: Receive timely reminders for upcoming medication doses.
- **User-Friendly Interface**: Simple and intuitive design for easy navigation.
- **Data Storage**: Store user data securely in Firebase Firestore for real-time updates.
- **Multi-Device Support**: Access your medication schedule from any device connected to the internet.

## Demo

A live demo of the application can be found here: [Live Demo](#) <!-- Add a link to your live demo if available -->

## Technologies Used

- **Frontend**:
  - Java (Android)
- **Backend**:
  - Firebase (Firestore, Authentication, Cloud Messaging)

## Installation

### Prerequisites

- Android Studio installed on your machine.
- A Firebase account.

### Steps to Set Up Locally

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/yourusername/medicine-reminder-app.git
    ```

2. **Open the Project in Android Studio**:
   - Launch Android Studio and open the cloned project.

3. **Configure Firebase**:
   - Go to the [Firebase Console](https://console.firebase.google.com/).
   - Create a new project and add your app to it (using the package name).
   - Download the `google-services.json` file and place it in the `app/` directory of your project.

4. **Add Firebase Dependencies**:
   - Open the `build.gradle` files (both project-level and app-level) and add the necessary Firebase dependencies (Authentication, Firestore, and Cloud Messaging) based on your requirements.

5. **Run the Application**:
   - Connect an Android device or start an emulator.
   - Click on the "Run" button in Android Studio to install and launch the app.

## File Structure

