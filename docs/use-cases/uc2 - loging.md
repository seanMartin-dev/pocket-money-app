# UC2 - *Login*
### Acotr

- Guardian
- Child

(*Both actors use the same login mechanism, but their permissions differ once authenicated.*)
---

### Goal

- To authenticate a user (guardian or child) and grant access to the system based on their role.
---

### Preconditions

- The user has already been registered in the system.

- The user has valid login credentials (email/username + password).

- The system is online and able to process authentication requests.

- the user is not already logged in on the current device/session.
---

### Postconditions

#### Successful Postconditions

- The user is authenticated and granted access to the system.

- A valid session or authentication token (e.g JWT) is issued.

- The system logs the successful login event for audit purposes.

- The user is redirected to the appropriate dashboard (guardian or child).

#### Minimal Postconditions (always true after the use case ends)

- The system logs the login attempt (success or failure).

- No partial or invalid session is created.

- If authentication fails, the system remains unchanged.
---
### Main Success Scenario

1. The user opens the application and selects the option to login in.

2. The system displays the login form.

3. The user enters their email/username/ and password.

4. The system validates the input format.

5. The system verifies the credentials against stored user records.

6. The system authenticates the user and generates a session/token.

7. The system redirects the user to their appropriate home screen.
---

### Alternative Flows

#### A1 - User enters incorrect password

1. The system detects that the password does not match the stored credentials.

2. The system displays an error message indicating invalid login details.

3. The user may retry or cancel the login process.

4. The flow returns to Step 3 of the Main Success Scenario.

#### A2 - User forgets passwor

1. The user selects "Forgot Password".

2. The system prompts for the registered email.

3. The system sends a password reset link or code.

4. The user resets their password and returns to the loging scrren.

5.  The flow returns to Step 3 of the Main Success Scenario.
---

### Exception FLows

#### E1 - System cannot access user records.

1. The system encounters an erro (e.g database unavailable).

2. The system displays an error message indicating login cannot be processed. 

3. The user may retry later.

4. The use case ends.

#### E2 - Account locked due to repeated failed attempts

1. The system detects multiple failed login attempts.

2. The system temporarily locks the account for security.

3. The system informs the user of the lockout and next steps.

4. The user case ends.