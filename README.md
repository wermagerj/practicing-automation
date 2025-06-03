# Appium Android Test Automation Project

This project contains automated tests for Android applications using Appium.

## Prerequisites

1. Java JDK 11 or higher
2. Maven
3. Android SDK
4. Appium Server
5. Android device or emulator
6. Node.js and npm (for Appium)

## Setup Instructions

1. Install Appium:
   ```bash
   npm install -g appium
   ```

2. Install Appium Android Driver:
   ```bash
   appium driver install uiautomator2
   ```

3. Start Appium Server:
   ```bash
   appium
   ```

4. Connect your Android device via USB or start an Android emulator

5. Enable USB debugging on your Android device

6. Update the test configuration:
   - Open `src/test/java/BaseTest.java`
   - Update the `appPackage` and `appActivity` values for your app
   - You can find these values using the command:
     ```bash
     adb shell dumpsys window | grep -E 'mCurrentFocus|mFocusedApp'
     ```

## Running Tests

To run the tests, execute:
```bash
mvn clean test
```

## Project Structure

- `src/test/java/BaseTest.java`: Base test configuration
- `src/test/java/SampleTest.java`: Sample test cases
- `pom.xml`: Maven dependencies and build configuration

## Writing Tests

1. Create a new test class that extends `BaseTest`
2. Use the provided `driver` instance to interact with your app
3. Use Appium's element locators (ID, XPath, AccessibilityID) to find elements
4. Write assertions to verify expected behavior

## Tips

- Use Appium Inspector to help locate elements in your app
- Make sure your Android device is properly connected and recognized
- Keep USB debugging enabled
- Ensure Appium server is running before executing tests