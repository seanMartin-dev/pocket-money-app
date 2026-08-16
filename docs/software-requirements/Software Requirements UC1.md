# Software requirements Use Case 1

## SFR1: UC1 Step 2
### Description:
- The system shall display a registration form when the guardian selects the registration option.

### Fit Criterion: 
- When the guardian selects “register”, the system shall display the registration form with 2 seconds, containing all required input fields (name, email, password) and a submit button. The test is passed if the form appears correctly and is fully interactive.

## SFR2: UC1 Step 4
### Description: 
- The system shall validate the guardians’ input, including email format, password strength, and required fields.

### Fit Criterion:
- Given a set of valid and invalid registration inputs, the system shall correctly accept 100% of valid inputs and reject 100% of invalid inputs. Invalid inputs include missing required fields, incorrectly formatted emails, and passwords that do not meet defined security rules. The system must display an appropriate error message for each rejected input within 1 second.

## SFR3: UC1 Step 4.b
### Description: 
- The system shall verify that the provided email address is not already associated with an existing guardian account.
### Fit Criterion: 
- Given a dataset of existing and non-existing emails, the system shall correctly identify 100% of duplicates and 100% of unique emails. For duplicate emails, the system must return an error message within 1 second.

## SFR4: UC1 Step 5
### Description: 
- The system shall create a new guardian account and store it securely in the database.

### Fit Criterion: 
- When provided with valid registration data, the system shall create a new guardian record in the database within 1 second. The record must contain all required fields and be retrievable immediately after creation.

## SFR5: UC1 Step 6
### Description: 
- The system shall send a confirmation email to the guardian after account creation.

### Fit Criterion: 
- After account creation, the system shall send a confirmation email to the guardian’s email address withing 10 seconds. A test is passed if the email is received by a test inbox and contains a valid confirmation link.

## SFR6 UC1: Step 7
### Description:
- The system shall process the guardian’s confirmation response and activate the account.

### Fit Criterion: 
- When the guardian clicks the confirmation link, the system shall activate the account and update its status I the database within 1 second. A test is passed if the account status changes from “pending” to “active” and the guardian can subsequently log in.

## SFR7 UC1: Step 8
### Description: 
- The system shall notify the guardian when registration is successfully completed.

### Fit Criterion:
- After account activation, the system shall display a success message within 2 seconds. A test is passed if the guardian receives a clear confirmation message and can proceed to the login screen.
