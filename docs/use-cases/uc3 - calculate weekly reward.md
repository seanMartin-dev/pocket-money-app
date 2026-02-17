## UC3 - *calculate weekly reward*

### Actor

- System(primary)
- Guardian(secondary, initiates the calculation)

---

### Goal

- To calculate the child's weekly pocket-money reward based on all behaviour entries recorded during the week.

---

### Preconditions

- The guardian is authenticated and logged into the system

- The child has at least one behaviour entry recorded for the current week.

- A reward scheme or calculation rule exists (e.g., points, deductions, threshold).

---

### Postconditions

- The system has calculated the weekly reward for the selected child.

- The calculated reward is stored and associated with the correct week.

- The guardian can view the calculated reward.

- The child's weekly reward summary is updated.

---

### Assumptions

- The reward calculation rules are predefined and understood by the guardian.

- Behaviour entries include data, time, and optional comments.

- The system automatically identifies the correct weekly period.

- The guardian may trigger the calculation manually, or the system may perform it automatically at week-end.

---

### Main Success Scenario

1. The guardian selects the child whose weekly reward they want to calculate.

2. The system identifies the current weekly period.

3. The system retrieves all behaviour entries for the selected child within that week.

4. The system applies the predefined reward calculation rules to the behaviour entries.
    
    - For days with no behaviour entry, the system applies the neutral-day rule.

5. The system generates the weekly reward amount.

6. The system stores the calculated reward for the week.

7. The system displays the weekly reward summary to the guardian.

---

### Alternative Flows

#### A1 - Guardian selects a different week

1. The guardian chooses a previous week instead of the current one.
2. The system retrieves behaviour entries for the selected week.
3. The system recalculates the reward for that week.
4. The flow returns to step 7 of the Main Success Scenario.

#### A2 - Automatic weekly calculation (system-initiated)

1. At the end of the week, the system auotmatically retrieves all behaviour entries.
2. The system calculates the weekly reward.
3. The system stores the reward and notifies the guardian.
4. The use case ends.

---

### Exception Flows

#### E1 - No behvaiour entries for the selected week

1. The system displays a message indicating that no behaviour entries exist for the selected week.
2. The system cannot calculate a reward.
3. The use case ends.

#### E2 - Reward calculation rules missing or invalid

1. The system detects that the reward scheme is not configured correctly.
2. The system displays an error message.
3. The guardian is prompted to configure or correc the reward rules.
4. The use case ends.

#### E3 - System error during calculation
1. The system encounters an error while calculating the reward
2. The system displays an error message.
3. The guardian may retry or return to the main menu.
4. The use case ends.