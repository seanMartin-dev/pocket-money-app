## UC5 - *set reward*

### Actor

- Guardian

---

### Goal 

- To configure or update the rules used to calculate weekly rewards.

---

### Preconditions

- The guardian is authenticated.

- The child is registered.

---

### Postconditions

- A reward scheme is created or updated.

- Future weekly calculation use the new scheme.

---

### Assumptions

- The guardian understands how behvaiour affects rewards.

---

### Main Success Scenario

1. The guardian selects the child.

2. The system displays the current reward scheme or a blank template.

3. The guardian enters or adjust reward rules.

4. The guardian confirms the scheme.

5. The system validates the rules.

6. The system saves the scheme.

7. The system confirms success.

---

### Alternative Flows

#### A1 - Guardian cancels

1. The guardian cancels before saving.
3. The system discards changes.

#### A2 - Reset to default

1. The guardian selects "Reset to default".
2. The system loads default rules.
3. Return to step 3 of the Main Success Scenario.

---

### Exception Flows

#### E1 - Invalid rules
1. The system detects invalid rules.
2. The system displays an error.
3. Return to step 3 of the Main Success Scenario.

#### E2 - Save error
1. The sytem cannot save the scheme.
2. The system displays an error.
3. The guardian may retry or exit.
