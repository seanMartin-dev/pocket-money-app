# UC3 - * add child*

### Actor

- Guardian
---

### Goal

- To register a new child under the guardian's account so their behaviour and weekly rewards can be tracked.
---

### Preconditions

- The guardian is authenticated and logged into the sytem.

- The guardian has an active account with the appropriate permissions.

- The system is online and able to process child-creation requests.

- The child being added does not already exist under the guardians's account.
---

### Postconditions

#### Successful Postconditions

- A new child profile is created and stored in the system.

- The child is linked to the guardians's account

- Default reward settings (if any) are applied to the child.

- The system logs the creation of the child profile for audit purposes.

- The child can log into the sytem based on there role.

- The child becomes available for behaviour tracking and weekly reward calculations.

#### - Minimal Postconditions (always true after the use case ends)

- The system logs the attempt to add a child (success or failure).

- No partial or corrupted child profiles are created.

- If the operation fails, the system remains unchanged.
---

### Main Success Scenario

1. The guardian selects the option to add a new child.

2. The system displays the child registration form.

3. The guardian enters the required child details(e.g username).

4. The system validates the input (e.g username not empty, username already registered).

5. The system creates a new child profile and links it to the guardian's account.

6. The sytem applies default reward settings or prompts the guardian to configure them.

7. The system confirms that the child has been successfully added.
---

### Alternative Flows

#### A1 - Child already exists

1. The guardian enters a child name that already exists under their account.

2. The system displays an error message indicating the child is already registered.

3. The guardian may enter a different name or cancel the action.

4. The flow returns to Step 3 of the Main Success Scenario.
---

#### Exception Flows

#### E1 - System cannot save the child profile

1. The system encounters an error while creating the child profile (e.g data base unavailable).

2. The system displays an error message indicating the child could not be added.

3. The guardian may retry or cancel the action.

4. The use case ends.