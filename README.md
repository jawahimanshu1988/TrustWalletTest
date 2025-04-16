# Appium Test Automation Framework (Java)

This project is a robust Appium-based mobile automation framework built in Java using TestNG, Page Object Model (POM).

---

## ✨ Features
- Java + Appium 9.0.0
- Page Object Model
- BaseTest and BasePage structure
- Support for Android automation using UiAutomator2
- Scalable and modular test structure

---

## 🚧 Prerequisites
Ensure the following software is installed:

### Java and Maven
- Java 11+
- Apache Maven 3.6+

### Android Environment
- Android Studio
- Android SDK with platform tools
- AVD (Emulator) or a real Android device

### Node & Appium
- Node.js (LTS version)
- Appium CLI


### Environment Variables (Add to `~/.zshrc` or `~/.bash_profile`)
```bash
export ANDROID_HOME=$HOME/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/platform-tools
export PATH=$PATH:$ANDROID_HOME/emulator
```

---

## 🔧 Installation Steps

### 1. Clone the Repository
```bash
git clone https://github.com/your-repo/appium-test-framework-java.git
cd appium-test-framework-java
```

### 2. Install Appium
```bash
npm install -g appium
appium driver install uiautomator2
```

### 3. Start Appium Server
```bash
appium
```

### 4. Start Android Emulator (if using AVD)
```bash
emulator -avd <your_emulator_name>
```

---

## 🚀 Run Tests

### 1. Execute Tests
```bash
mvn clean test
```

---

## 📜 Project Structure
```
appium-test-framework-java/
|
|-- src/
|   |-- main/java/
|   |   |-- pages/
|   |   |   |-- BasePage.java
|   |   |   |-- LandingPage.java
|   |   |   |-- PasscodePage.java
|   |   |   |-- WalletMainPage.java
|   |   |-- utils/
|   |       |-- DriverUtils.java
|   |
|   |-- test/java/tests/
|       |-- BaseTest.java
|       |-- SampleTest.java
|
|-- testng.xml
|-- pom.xml
|-- README.md
```

---