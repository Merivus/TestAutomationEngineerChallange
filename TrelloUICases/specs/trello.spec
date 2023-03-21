Specification Heading
==========================

Trello.com UI Test Automation Scenarios

Case 1 - Success Login
-----------
* Enter "https://www.trello.com" Trello Home Page
* Click to Login Button
* Set email "sinemmerveyilmaztestmail@gmail.com" in login page
* Click to Continue button
* Set password "Ankara1." in login page
* Click to Log In button
* It shows success login

Case 2 - Unsuccess Login with Wrong Password
-----------
* Enter "https://www.trello.com" Trello Home Page
* Click to Login Button
* Set email "sinemmerveyilmaztestmail@gmail.com" in login page
* Click to Continue button
* Set password "." in login page
* Click to Log In button
* It shows failed login

Case 3 - Create & Delete a Board
-----------
* Enter "https://www.trello.com" Trello Home Page
* Click to Login Button
* Set email "sinemmerveyilmaztestmail@gmail.com" in login page
* Click to Continue button
* Set password "Ankara1." in login page
* Click to Log In button
* It shows success login
* Click to Create new board button
* Select the Board background
* Select the Board visibility
* Set board title "My Planning List"
* Click create a board button
* Add board to favorite list
* Click details button
* Click more button
* Close the board

Case 4 - Check Deleted Board & Delete Board Completely
-----------
* Enter "https://www.trello.com" Trello Home Page
* Click to Login Button
* Set email "sinemmerveyilmaztestmail@gmail.com" in login page
* Click to Continue button
* Set password "Ankara1." in login page
* Click to Log In button
* It shows success login
* View all of the closed boards
* Click to Delete board
* Delete the board completely

Case 5 - Create List & Configure Card In List
-----------
* Enter "https://www.trello.com" Trello Home Page
* Click to Login Button
* Set email "sinemmerveyilmaztestmail@gmail.com" in login page
* Click to Continue button
* Set password "Ankara1." in login page
* Click to Log In button
* It shows success login
* Click to Create new board button
* Select the Board background
* Select the Board visibility
* Set board title "My Planning List"
* Click create a board button
* Add a list name "TODO List"
* Add your list
* Add a list name "DONE List"
* Add your list
* Click on the Add a card button
* Enter a title "Math homework" for this card
* Add your card title with click Add card button
* Click on the Edit card button
* Select Move button
* Select List Position on the checkbox
* Move the card on the DONE List status