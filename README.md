# JUnit Testing for BrowserPage Class - CMPE 313 Homework #3

Authors: Deniz Melih Öz & Muhammed Abdullah Yusuf

## Introduction

This repository contains the implementation of JUnit testing for the "BrowserPage" class in Java. JUnit, the standard testing tool for Java development, is used as part of Test-Driven Development (TDD) methodologies. By building a test suite, we can thoroughly test the functionality of the code and reduce debugging time.

## Implementation

The main class implemented for JUnit testing is the "BrowserPage" class, represented by `MainWin`. It interacts with other classes such as `Manager`, `ShoppingCart`, `Stock`, and `User`. The `BrowserPage` class displays multiple books with their availability and provides the option to add them to the user's shopping cart for purchase. The implementation also includes the `Driver` class, which utilizes various methods like `addStock()` and `addUser()`.

### Components

1. **Driver Class:** This class contains methods to add books into the stock, add users, and other functionalities.

2. **MainWin Class:** This class represents the main page of the application. It creates a Swing window and panels for user interaction. Each "page" of the program is tested using a single JUnit test class called `TestMainWin`.

3. **Manager Class:** This class handles operations related to managing books, such as adding, removing, and updating book information.

4. **ShoppingCart Class:** This class manages the user's shopping cart and provides functionality for adding and removing items.

5. **Stock Class:** This class represents the book stock and provides methods to retrieve information about the available books.

6. **TestMainJava Class:** This is the JUnit test class that contains assertions to test the functionality of the program. It tests different book categories in the library and compares the expected results with the actual results.

By implementing JUnit testing, we ensure that the behavior of the `BrowserPage` class and its related classes is correct and meets the expected criteria. This improves the reliability and quality of the codebase.

Please note that the entire code for the `MainWin` class is not included in this README due to its length.

## Usage

To run the JUnit tests and validate the functionality of the `BrowserPage` class, follow the steps below:

1. Set up your development environment with the necessary dependencies and libraries.

2. Open the project in your preferred Java IDE.

3. Locate the JUnit test class, `TestMainJava`, and run it as a JUnit test.

4. Observe the test results, including the assertions, to verify the correctness of the implemented functionality.

Feel free to explore and modify the code according to your needs and requirements.

## License

This project is licensed under the [MIT License](LICENSE).

---

I hope you find this JUnit testing implementation for the BrowserPage class informative and helpful. If you have any questions or suggestions, please feel free to reach out. Happy testing!
