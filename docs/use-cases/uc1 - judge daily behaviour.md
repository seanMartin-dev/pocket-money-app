# UC1 - *judge daily behaviour*

### Actor

- Guardian

---

### Goal

- To record a child's behaviour for the current day as part of the weekly pocket-money calculation.

### Preconditions

- The guardian is authenticated and logged into the system.

- The child has been registered under the guardian's account.

- The current date falls within an active weekly reward period.

---

### Postconditions

- The system has recorded the behaviour judgement with its associated date and time.

- If provided, the system has stored the guardian's comment.

- The weekly reward calculation reflects the updated behavioiur entry.

---

### Main Success Scenario

1. The guardian selects the child whose behaviour they want to judge.

2. The system displays the current date and the available behaviour options.

3. The guardian select the behaviour judgement for the day. 

4. The system records the behaviour judgement for the selected child, including the date and time automatically.

5. The system updates the weekly reward calculation based on the new behaviour entry.

6. The system confirms that the behaviour has been successfully logged.

---

### Alternative Flows

#### - Guardian adds an optional comment

1. The guardian chooses to add a comment describing the behaviour.

2. The system stores the comment with the behaviour record.

3. The flow returns to step 5 of the Main Success Scenario.

---

### Exception FLows

#### - System cannot save the behaviour

1. The system displays an error message indicating the behaviour could not be saved.

2. The guardian may retry or cancel the action.

3. The use case ends.


