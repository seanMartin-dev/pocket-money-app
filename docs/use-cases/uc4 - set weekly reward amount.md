## UC4 - *set reward*

### Actor

- Guardian

---

### Goal 

- To configure or update the maximum weekly reward amount for a child.

---

### Preconditions

- The guardian is authenticated and logged into the system.

- The child is registered under the guardian's account.

- The guardian has permission to modify reward settings

---

### Postconditions

#### Successful Postconditions

- The child's reward settings are created or updated.

- Future weekly calculation use the new reward amount.

- The update is recorded for audit purposes

#### Minimal Postconditions

- The system logs the attempt (success or failure).

- No partial or invalid reward configuration is stored.

---

### Assumptions

- The guardian understands how behvaiour affects rewards.

- The system validates reward values (e.g. numeric, within allowed range).

---

### Main Success Scenario

1. The guardian selects the child whose reward settings they want to update.

2. The system displays the current reward amount or a blank field if none exists.

3. The guardian enters or adjusts the weekly reward amount.

4. The guardian confirms the update.

5. The system validates the new reward amount

6. The system saves the update reward setting.

7. The system confirms that the reward has been successfully updated.

---

### Alternative Flows

#### A1 - Guardian cancels

1. The guardian cancels before saving.
2. The system discards any unsaved changes.
3. The use case ends.

#### A2 - Reset to default

1. The guardian selects "Reset to default".
2. The system loads default reward amount
3. The flow returns to Step 3 of the Main Success Scenario

---

### Exception Flows

#### E1 - Invalid reward amount
1. The system detects invalid input (e.g negative numbers, non-numeric values).
2. The system displays an error message.
3. The guardian re-enters a valid amount.
4. The flow returns to Step 3 of the Main Success Scenario.

#### E2 - Save error
1. The sytem cannot save the reward setting (e.g database unavailable).
2. The system displays an error message.
3. The guardian may retry or exit.
4. The use case ends.
