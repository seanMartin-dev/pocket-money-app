## UC14 - *notify weekly outcome*

### Actor

- System (automated process)

---

### Goal 

- To automatically notify the guardian (and optionall the child) of the final weekly reward outcome once the weekly calculation has been completed.

---

### Preconditions

- The weekly reward calculation has been successfully completed (UC-13).

- The system has access to guardian contact details (e.g in-app notifications, email, push notifications).

- The week has officially ended.

- Notification settings are enabled for the guardian (and child, if applicable).

---

### Postconditions

#### Successful Postconditions

- The guardian receives a notification containing the final weekly reward outcome.

- The notification includes a summary of the child's behaviour for the week.

- The system logs that the notification was sent.

#### Minimal Postconditions

- The system logs the attempt (success or failure).

- No reward data is modified.

---

### Assumptions

- The system support at least on notification channel (in-app, email, push).

- The guardian understands the meaning of the weekly outcome.

- The system can queue and retry notifications if delivery fails.

---

### Main Success Scenario

1. The system detects that the weekly reward calculation is complete.

2. The system retrieves the final weekly reward outcome for each child.

3. The system generates a notification message containing:
- Final reward amount.
- Weekly behaviour summary.
- Optional comments recorded during the week.

4. The system sends the notification to the guardian.

5. The system logs that the notification was successfully delivered.

---

### Alternative Flows

#### A1 - Chil notifications enabled

1. The system checks notification settings for the child.
2. The system sends a simplified version of the weekly outcome to the child.
3. The flow returns to Step 5 of the Main Success Scenario

---

### Exception Flows

#### E1 - Notification delivery fails

1. The system attempts to send the notification but fails (e.g network issue).

2. The system logs the failure.

3. The system retries according to a predefined schedule.

4. If retries fail, the system alerts an administrator or marks the notification as underliverable.

5. The use case ends.

#### E2 - Missing or invalid contact details

1. The system detects missing or invalid guardian contact information.

2. The system logs the issue.

3. The sustem stores the weekly outcome but does not send a notification.

4. The use case ends.