Feature: All features of Kiverno
Scenario: Launching browser and Login
Given User launch browser
Then Enter valid username and password
And click on Submit button
Then User add client details
And click on SaveClient button
Then Add Client country details
And click on SaveCountry button
When User clicks on User Management tab
Then User add User full details
And Maps with Client
Then click on SaveMap button
Then User click on Export button to get data in excel
When User clicks on competency configuratuon tab
And Select client
And Assessments model
Then User adds Categories inside models
And Add Elements inside categories
Then user adds Options inside each elements
And click on SaveOptions button
Then User clicks on Report tabs
And generate report through filter
Then User checks report inside Development opp. charts and change overtime tabs
And Compare with another clients
Then check submitted forms by managers and non managers
Then click on home icon
And clicks on logout button