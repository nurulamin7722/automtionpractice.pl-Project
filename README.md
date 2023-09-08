# Automation-Practice

Sample (automationpractice.pl) website automation project with Selenium Java

<a href="https://automationpractice-project-report.netlify.app/"> Click here to see Allure Report. </a >

## This project covers the following scenario:

1. Visit http://automationpractice.pl/index.php.
2. Create two new accounts.
3. Login using one of the new accounts.
4. Browse Casual Dresses, and add one to your cart.
5. Visit the T-shirt section, filter by blue color, and add a shirt.
6. Proceed to checkout and choose 'Payment by check.'
7. Sign out from your account.

### Run the above cycle for another user.

## This project covers the following topics:
1. Java
2. Maven
3. Selenium
4. TestNG
5. Page Object Model
6. Data-Driven
7. Page Factory
8. Allure Report

## Command for run allure report

### Method 1
allure serve [abs path of allure-results]

### Method 2
Generating report: allure generate ./allure-results --clean

Display report using server: allure open ./allure-report

## Git command
Clean git cached command: git rm -rf --cached.
