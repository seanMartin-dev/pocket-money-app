# Software Requirements UC2
## SFR8: UC2 Step 2
### Description: 
- The system shall display the login form when the user selects the login option.

### Fit Criterion: 
- The login form must appear within 2 seconds and contain fields for email/username and password.

## SFR9: UC2 Step 4
### Description: 
- The system shall validate the format of the entered email/ username and password.

### Fit Criterion:
- Given valid and invalid input formats, the system shall correctly accept 100% of valid formats and reject 100% of invalid formats, displaying an error within 1 second.

## SFR10: UC2 Step 5
### Description: 
- The system shall verify the user’s credentials against stored user records.

## Fit Criterion: 
- Using a dataset of valid and invalid credentials, the system shall correctly authenticate 100% of valid credentials and reject 100% of invalid ones.

## SFR11: UC2 Step 6
### Description: 
- The system shall generate a valid session or authentication token upon successful login.

## Fit Criterion: 
- Upon successful authentication, the system shall generate a session/token within 1 second, and the token must be valid for subsequent authenticated requests.

## SFR12: UC2 Step 7
### Description: 
- The system shall redirect the authenticated user to the appropriate dashboard based on their role (guardian or child).

### Fit Criterion:  
- When a user with role guardian successfully authenticates, the system shall display the guardian dashboard within 2 seconds.
- When a user with role child successfully authenticates, the system shall display the child dashboard within 2 seconds.
- A tester shall be able to verify this by logging in with accounts of each role and confirming the correct dashboard is shown.