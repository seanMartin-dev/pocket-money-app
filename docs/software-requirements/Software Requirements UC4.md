# Software Requirements UC4 – Set Reward
## SFR1: UC4 Step 2 – Display Current Reward
### Description:
- The system shall display the child’s current weekly reward amount, or a blank field if no reward has been set.

### Fit Criterion:
- When the guardian selects a child, the system must retrieve and display the current reward amount within 2 seconds.
- A test is passed if:
	- The correct value is shown for children with existing rewards.
	- The field is empty for children without a reward
	- The UI is fully interactive.

## SFR2: UC4 Step 3 – Enter or Adjust Reward
### Description:
- The system shall allow the guardian to enter or modify the weekly reward amount.

### Fit Criterion:
- The input field must accept only numeric values within the allowed range (e.g., 0-100).
- A test is passed if:
	- Valid numbers are accepted
	- Invalid inputs (letters, symbols, negative values, out-of-range values) are rejected immediately
	- The guardian can edit the value without UI errors

## SFR3: UC4 Step 5 – Validate Reward Amount
### Description:
- The system shall validate the new reward amount before saving.

### Fit Criterion:
- Given a set of valid and invalid reward values, the system must:
	- Accept 100% of valid values
	- Reject 100% of invalid values
	- Display an appropriate error message within 1 second
	- Prevent saving when validation fails

## SFR4: UC4 Step 6 – Save Updated Reward
### Description:
- The system shall save the updated reward amount securely in the database.

### Fit Criterion:
- When provided with a valid reward amount, the system must update the child’s reward record within 1 second.
- A test is passed if:
	- The new value is stored correctly
	- The updated value is immediately retrievable
	- No partial or corrupted data is stored
