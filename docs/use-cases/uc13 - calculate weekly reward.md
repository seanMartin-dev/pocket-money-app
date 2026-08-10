## UC13 - *calculate weekly reward*

### Actor

- System (automated process)
---

### Goal

- To automatically calculate each child's final weekly reward amount based on their behaviour entries for the completed week.
---

### Preconditions

- The weekly perio has ended (e.g Sunday at midnight).

- All daily behaviour entries for the week have been recorded.

- Thes system has access to each child's reward setting (UC-4).

- No calculation is currently in progress for the same week.

- The system clock triggers the weekly calculation process.
---

### Postconditions

#### Successful Postconditions

- The final weekly reward amount is calculated for each child.

- The result is stored in the weekly outcome record.

- The calculation is marked as complete.

- The system logs the calculation event.

#### Minimal Postconditions

- The system logs the attempt (success or failure).

- No partial or inconsistent reward data is stored.
---

### Assumptions

- The system has defined reward calculation formula.

- Behaviour entries include all required data.

- The system can safely perform batch calculations without performance issues.
---

### Main Success Scenario

1. The system detects that the weekly period has ended.

2. The system retrieves all behaviour entries for each child for the completed week.

3. The system retrieves each child's reward settings (e.g maximum weekly reward).

4. The system applies the reward calculation formula.

5. The system generates the final weekly reward amount.

6. The system stores the weekly outcome for each child.

7. The system marks the calculation as complete.

8. The system logs the successful weekly calculation.
---

### Alternative Flows

#### A1 - Missing behaviour entries

1. The system detects missing behaviour entries for one or more days.

2. The system applies default values (e.g treat missing as "not good").

3. The flow returns to Step 4 of the Main Success Scenario.

#### A2 - Guardian updates reward settings late

1. The system detects that reward settings were changed shortly before calculation.

2. The system uses the most recent settings.

3. The flow returns to Step 4 of the Main Success Scenario.
---

### Exception Flows

#### E1 - Calculation error

1. The system encounters an error during calculation (e.g corrupted data).

2. The system logs the failure.

3. The system retries according to a predefined schedule.

4. If retries fail, the system alerts an administrator.

5. The use case ends.

#### E2 - Cannot store weekly outcome

1. The system calculates the reward but cannot save the result.

2. The system logs the failure.

3. The system retries saving.

4. If retries fail, the system alerts an administrator.

5. The use case ends.