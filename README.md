# Automation-Practice

Sample (automationpractice.pl) website automation project with selenium java

Click here to see Allure Report

## This project covers the following scenario:
Go to the URl: http://automationpractice.pl/index.php
Create two new accounts
Login with the any of the new account
Go to the Casual Dresses section and add a dress into the cart
Go to the T-shirt section > Filter the list with blue color > Add a shirt from the filter list
Now checkout and select the payment process ‘Payment by check’
Sign out from the account
Run the above cycle for another user.

## This project covers the following topics:
Java
Maven
Selenium
TestNG
Page Object Model
Data-Driven
Page Factory
Allure Report
## Command for run allure report

### Method 1
alllure serve [abs path of allure-results]

### Method 2
Gnerating report: allure generate ./allure-results --clean

Display report using server: allure open ./allure-report

## Git command
Clean git cached command: git rm -rf --cached .
