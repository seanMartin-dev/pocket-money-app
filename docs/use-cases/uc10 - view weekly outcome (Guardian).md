## UC10 - * view weekly outcome (Adult)*

### Actor

- Guardian
---

### Goal

- To allow the guardian to view the fianl weekly reward outcome for a selected child once the week has ended and the system has completed the weekly calculation.
---

### Preconditions

- The guardian is authenticated and logged into the system.

- The child is registered under the guardian's account.

- The weekly reward calculation for the selected week has been completed by the system.

- The week being viewed has ended (i.e, outcoume is final).
---

### Postconditions

#### - Successful Postconditions

- The system displays the final weekly reward outcome for the selected child.

- The guardian can view the behaviour summary that led to the outcome.

- No data is modified.

#### Minimal Postconditions

- The system logs that the guardian viewed the weekly outcome.

- The system state remains unchanged.
---

### Assumptions

- The guardian understands how weekly rewards are calculated.

- The system stores weekly summaries and final reward amounts.

- The system can retrieve historical weekly outcomes.
---

### Main Success Scenario

1. The guardian selects the child whose weekly outcome they want to view.

2. The system displays a list of completed weeks.

3. The guardian selects a completed week.

4. The system retrieves the final weekly reward outcome for that week.

5. The system displays:
- Final reward amount
- Behaviour summary (good/bad days)
- Any comments recorded during the week.

6. The guardian reviews the weekly outcome.
---

### Alternative FLows

#### A1 - Guardian switches to a different week

1. The guardian selects a different completed week.

2. The system retrieves the outcome for the new week.

3. The flow returns to Step 5 of the Main Success Scenario.

#### A2 - No reward earned

1. The system detects that the child earned £0 for the selected week.

2. The system displays the outcome with an explanation.

3. The flow returns to Step 6 of the Main Success Scenario.
---

### Exception FLows

#### E1 - Weekly outcome not available

1. The system detects that the selected week has not been calculated or is incomplete.

2. The system displays a message such as "Outcome not available for this week".

3. The guardian may select a different week.

4. The use case ends.

##### E2 - System cannot retrieve weekly outcome

1. The system encounters an erro retrieving the weekly outcome

2. The system displays an error message. 

3. The guardian may retry or return to the main menu.

4. The use case ends.