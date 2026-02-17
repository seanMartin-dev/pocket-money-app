## UC4 - *view weekly reward summary*

### Actor

- Guardian(primary)
- Child(secondary, if the system allows them to view their own reward)

---

### Goal

- To view the child's weekly pocket-money reward and the behaviour summary that contributed to it

---

### Preconditions

- The guardian is authenticated and logged into the system.

- A weekly reward has been calculated for the selected child (via uc3).

- The child has at least one behaviour entry for the selected week.

--- 

### Postconditions

- The system displays the weekly reward amount for the selected child.

- The system shows the behaviour entries that contributed to the reward.

- The guardian has a clear understanding of how the reward was determined.

---

### Assumptions

- The guardian understands the reward scheme and how behaviour affects the weekly total.

- The system stores weekly reward results and behaviour entries reliably.

- The guardian may view current or past weekly summaries.

---

Main Success Scenario

1. The guardian selects the child whose weekly reward summary they want to view.

2. The system displays available weeks (e.g., current week, previous weeks).

3. The guardian selects a week.

4. The system retrieves the calculated reward for the selected week.

5. The system retrieves all behaviour entries for that week.

6. The system displays the weekly reward amount along with the behaviour summary.

7. The guardian reviews the weekly reward summary.

---

### Alternative Flows

#### A1 - Guardian selects a different week

1. The guardian chooses a different week from the list.
2. The system retrieves the reward and behaviour entries for the new week. 
3. The flow returns to step 6 of the Main Success Scenario.

#### A2 - Child views their own weekly reward

1. The child logs into their account.
2. The system displays the current week's reward summary.
3. The child reviews the reward and behaviour entries.
4. The use case ends.

---

### Exception Flows

#### E1 - No reward calculated for the selected week

1. The system displays a message indicating that no reward has been calculated for the selected week.
2. The guardian may choose to trigger the calculation (uc3).
3. The use case ends.

#### E2 - No behviour entries for the selected week

1. The system displays a message indicating that no behaviour entries exist for that week.
2. The system cannot display a reward summary.
3. The use case ends.

#### E3 - System error retrieving reward or behaviour data

1. The system displays an error message indicating that data could not be retrieved.
2. The guardian may retry or return to the main menu.
3. The use case ends.