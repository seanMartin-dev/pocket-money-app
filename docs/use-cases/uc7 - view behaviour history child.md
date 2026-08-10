## UC7 - *view behaviour history (Child)*

### Actor

- Child
---

### Goal

To view their own behaviour entries for a selected time period.
---

### Preconditions

- Child is authenticated

- Child has behaviour entries recorded
---

### Preconditions

- Behaviour history for the selected period is displayed.

- Comments are show if they exist.

- No data is modified.


### Assumptions

- The child understands how to navigate to the behaviour history section.

- The system has stored behaviour entries with date, time, and optional comments.

---

### Main Success Scenario

1. Child opens there behaviour history.

2. The system displays the available time periods (e.g current week, previous weeks).

3. The child selects a time period.

4. The system retrieves all behaviour entries for the selected time period.

5. The system displays the behaviour entries, including date, time, and behaviour judgement, and any comments.

6. The child reviews the behaviour history.

### Alternative Flows

Same as UC-7
---

### Exception Flows

Same as UC-7

