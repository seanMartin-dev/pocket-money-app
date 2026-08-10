## UC11 - *initialise new week*

### Actor 

- System (automated process)

---

### Goal

- To automatically prepare the system for a new reward week by resetting weekly data and creating new behaviour entries for each child.
---

### Preconditions

- The prvious reward week has ended.

- The system clock has reached the scheduled weekly reset time (e.g Sunday at midnight).

- All weekly reward calculations for the previous week have been completed (UC-13).

- All children are registered under their respective guardians.

---

### Postconditions

#### Successful Postconditions

- A new weekly period is created for each child.

- Behaviour entries for each day of the new week are initialised (e.g default "goog").

- Streak counters (if weekly-based) are reset.

- The system logs the weekly initialisation event.

#### Minimal Postconditions

- The system logs the attempt (success or failure).

- No partial or corrupted weekly data is created.

---

### Assumptions

- The system has reliable scheduler or cron-like mechanism.

- The system has access to all required child and guardian records.

- The system can safely write new weekly data without downtime.

---

### Main Success Scenario

1. The system detects that the previous week has ended.

2. The system verifies that all weekly reward calculations are complete.

3. The system creates a new weekly record for each child.

4. The system initialises behaviour entries for each day of the new week (default values).

5. The system resets weekly counters (e.g good/bad streaks if weekly).

6. The system stores all new weekly data.

7. The system logs the successful weekly initialisation.

---

### Alternative Flows

#### A1 - Weekly initialisation delayed

1. The system detects that calculations for the previous week are still pending.

2. The system waits and retries after a defined interval.

3. The flow returns to Step 2 of the Main Success Scenario.

---

### Exception Flows

#### E1 - System cannot create new weekly data

1. The system encounters an error while creating the new week.

2. The system logs the failure.

3. The system retries according to a predefined schedule.

4. If retries fail, the system alerts an administrator.

5. The use case ends.

---