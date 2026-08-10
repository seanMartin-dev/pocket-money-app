# UC1 - *register guardian*

### Actor

- Guardian
---

### Goal

- To register a guardian to the pocket-money application.

### Preconditions

1. The user is not already registered as a guardian.
    
    - The system must ensure the email/username is not already in use.
    - Prevents duplicate accounts.

2. The user has the required information to register
 
    - Typically: Name, Email, Password, (Optional Phone number)

3. The system has guardian registration enabled
---
    
### Postconditions

- A new guardian account is created and stored in the sytem.

- The guardian is assigned the Guardian role.

- The guardian can now log in using their registered credentials.

- The guardian can now create children.

- The guardian can now judge a created childs behaviour. 

- The registration event is recorded for audit purposes.

- No duplicate or partial accounts exist.
---

### Minimal Postcondition (always true after the use case ends)

- The system has logged the registration attempt (success or failure).
- If registration fails, no account is created and the system remains unchanged.
---

### Main Success Scenario

1. The guardian opens the application and selects the option to register.

2. The system displays the registration form.

3. The guardian enters their required details (name, email, password).

4. The system validates the input (format, password rules, unique email).

5. The system creates a new guardian account and stores it securely.

6. The system sends a validate email to the guardian.

7. The system recives the returned validate form.

8. The system confirms successful registration to the guardian.

9. The guardian may now procedd to log in.
---

### Alternative Flows

#### A1 - Email already registered

1. The guardian enters an email that already exists in the system.
        
2. The system displays an error message indicating the email is already in use.

3. The guardian may enter a different emaail or cancel the registration.

4. The flow returns to Step 3 of the Main Success Scenario.

#### A2 - Weak password
        
1. The guardian enters a password that does not meet security requirements.

2. The system displays a message explaining the password rules.

3. The guardian enters a new password.

4. The flow returns to Step 3 of the Main Success Scenario.

#### A3 - Email not confirmed in time.

1. The guardian does not click the confirmation email link sent within the allocated time.

2. The flow returns to Step 2 of the Main Success Scenario.
---

### Exception Flows

#### E1 - System cannot save the account

1. The system encounters an error while creating the account (e.g., database unavailable).

2. The systme displays an erro message indicating registration failed. 

3. The guardian may retry or cancel the action.

4. The use case ends.
