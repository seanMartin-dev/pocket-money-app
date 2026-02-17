## uc2 - *view behaviour history*

### Actor

- Guardian (and optionally Child, depending on system desing)

---

### Goal

To view a child's recorded behaviour entries for a selected time period(e.g., current week, previous weeks).

---

### Preconditions

- The guardian is authenticated and logged into the sytem.

- The child has at least one recorded behaviour entry.

---

### Preconditions

- The system displays the behaviour history for the selected child and time period.

- If comments exist, they are shown alongside the behaviour entries.

- The guardian has an accurate overview of the child's behaviour for the chosen period.


### Assumptions

- The guardian understands how to navigate to the behaviour history section.

- The system has stored behaviour entries with date, time, and optional comments.

---

### Main Success Scenario

1. the guardian selects the child whose behaviour history they want to view.

2. The system displays the available time periods (e.g current week, previous weeks).

3. The guardian selects a time period.

4. The system retrieves all behaviour entries for the selected child and time period.

5. The system displays the behaviour entries, including date, time, and behaviour judgement, and any comments.

6. The guardian reviews the behaviour history.

### Alternative Flows

#### A1 - Guardian changes the selected time period

1. The guardian selects a different time period.
2. The system retrieves the behaviour entries for the new period.
3. The flow returns to step 5 of the Main Success Scenario.

#### A2 - No behaviour entries exist for the selected period

1. The system displays a message indicating that no behaviour entries are available for the chosen time period.
2. The guardian may select a different time period.
3. The flow returns to step 3 of the Main Success Scenario.

---

### Exception Flows

#### E1 - System cannot retrieve behaviour data

1. The system displays an error message indicating that behaviour data could not be retrieved.
2. The guardian may retry or return to the main menu.
3. The use case ends.

