# Domain description

The system allows guardians to record and manage a child’s daily behaviour as part of a weekly pocket‑money scheme. Each behaviour entry is stored with its date and time, and guardians may optionally add a comment describing the behaviour or incident. The system uses these entries to calculate the child’s weekly reward, providing a fair, consistent, and transparent process for both guardian and child.


---

## Actors

### Child

- Behaviour is logged.

- Subject to reward/penalty outcomes.

- Informed of pocket money to be received.

### Guardian

- Makes judgement on behaviour.

- Responsible for logging bad behaviour.

- Informed of pocket money total to be transferred.

---

## Domain rules

### Tracking of behaviour

- At the start of each week, the child is provisionally assigned the maximum pocket money.

- At the start of each day behaviour is automatically assigned to good.

- On any day behaviour is reassigned to "not good", a deduction will be incurred from provisional pocket money.

- At the end of the week, the system calculates the pocket money to be rewarded.

### Streaks

- Streaks of continuous good or bad days are tracked separately.

---

## Domain Processes

### Week initialisation

- System assigns maximum provisional pocket money to child.

- Behaviour defaults to "good" for all days in week.

### Daily behaviour logging

- Guardian reviews child's behaviour throughout the day.

- If at any time in the day behaviour is adjudged to be "not good", guardian reassigns default behaviour to "not good".

- System deducts from provisional pocket money.

- System updates streak counters (good/bad).

### Weekly review

- At the end of 7 days, system aggregates behaviour records.

- System calculates final pocket money (after deductions).

- Guardian is informed of transfer amount.

- Child is informed of reward outcome.

### Continuous Tracking

- System maintains history of weekly outcomes.

- System tracks streaks across weeks.

- Reports available for guardian (optional future increment).
