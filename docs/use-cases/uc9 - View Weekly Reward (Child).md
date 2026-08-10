## UC9 - * view weekly reward (Child)*

### Actor

- Child
---

### Goal

- To allow the child to view their current weekly reward amount based on their behaviour entries for the ongoing week.
---

### Preconditions

- The child is authenticated and logged into the system.

- The child has at least one behaviour entry recorded for the current week (or the system can show a default value).

- The weekly reward calculation has been performed up to the current day.
---

### Postconditions

#### - Successful Postconditions

- The system displays the child's current weekly reward amount.

- The child can see how their behaviour has affected the reward so far.

- No data is modified.

#### Minimal Postconditions

- The system logs thea the child viewed their weekly reward.

- The system state remains unchanged.
---

### Assumptions

- The child understands the meaning of the weekly reward amount.

- The system has already calculated the reward up to the current day.

- The system can display reward breakdwons (optional).
---

### Main Success Scenario

- The child logs into the system.

- The child selects the option to view their weekly reward.

- The system retrieves the current week's reward calculation.

- The system displays the weekly reward amount.

- The child reviews their reward progress.
---

### Alternative Flows

#### A1 - No behaviour entries yet this week

1. The system detects that no behaviour entries exist for the current week.

2. The systme displays a message such as "No behaviour recorded yet this week".

3. The system may display the default reward amount (e.g full reward).

4. The use case ends.

#### A2 - Child views reward breakdown (optional feature)

1. The child selects "view breakdown".

2. The system displays daily behaviour entries and how each affected the reward.

3. The flow returns to Step 5 of the Main Success Scenario.
---

### Exception Flows

#### E1 - System cannot retrieve reward data

1. The system encounters an error retrieving the weekly reward.

2. The system displays an error message.

3. The child may retry or return to the main menu.

4. The use case ends.