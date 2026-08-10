## UC12 - *initialise new day*

### Actor

- System (automated process)

---

### Goal

- To automatically prepare the system for a new day by creating a default behaviour entry for each child.
---

### Preconditions

- The system clock has reached the scheduled daily reset time (e.g midnight).

- The child is registered under a guardian's account.

- The current week has already been initialised (UC-11).

- No behaviour entry exists yet for the new day.

---

### Postconditions

#### Successful Postconditions

- A new behaviour entry is created for each child for the new day.

- The behaviour entry is initialised with a default value (e.g "good").

- The system logs the daily initialisation event.

- The entry is ready for the guardian to judge or add comments.

#### Minimal Postconditions

- The system logs the attempt (success or failure).

- No partial or corrupted daily entries are created.

---

### Assumptions

- The system has reliable scheduler or cron-like mechanism.

- The system can safely write daily entries without downtime.

- Default behaviour values are defined in system settings.

---

### Main Success Scenario

1. The system detects that a new day has begun.

2. The system verifies that the current week is active.

3. The system creates a new behaviour entry for each child.

4. The system sets the default behaviour value (e.g, "good").

5. The system stores the new behaviour entry.

6. The system logs the successful daily initialisation.

---

### Alternative Flows

#### A1 - Daily initialisation delayed

1. The system detects that the previous day's processes are still running (e.g reward calulations).

2. The system waits and retries after a defined interval.

3. The flow returns to Step 2 of the Main Success Scenario.

---

### Exception FLows

#### E1 - System cannot create daily entries

1. The system encounters an error while creating the new day's entries.

2. The system logs the failure.

3. The system retries according to a predefined schedule.

4. If retries fail, the system alerts an administrator.

5. The use cas ends.