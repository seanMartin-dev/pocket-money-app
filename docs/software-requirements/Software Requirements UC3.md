# Software requirements UC3
### SFR13: UC3 Step 2
- Description: The system shall display the child registration form when the guardian selects the option to add a new child.

- Fit Criterion: The child registration form must appear within 2 seconds and contain all required fields (e.g., username).

## SFR14: UC3 Step 4
### Description: 
- The system shall validate the child’s details, including required fields and uniqueness of the child username under the guardian’s account.

### Fit Criterion
- Given valid and invalid child details, the system shall correctly accept 100% of valid inputs and reject 100% of invalid input (e.g., empty username, duplicate username) displaying an error within 1 second.

## SFR15: UC3 Step 5
### Description:
- The system shall create a new child profile and store it securely in the database.

### Fit Criterion: 
- When provided with valid child details, the system shall create a child profile within 1 second, and the profile must be retrievable immediately after creation.

## SFR16: UC3 Step 5.b
### Description: 
- The system shall link the newly created child profile to the authenticated guardian’s account.

### Fit Criterion:
- After creation, the child profile must appear under the guardian’s account in the database, and the guardian must be able to view the child in their child list.

## SFR17: UC3 Step 6
### Description: 
- The system shall apply default reward settings to the child or prompt the guardian to configure them.

### Fit Criterion:
- After child creation, the system shall either assign default reward settings or display a configuration prompt within 1 second. A test is passed if the child has valid reward settings immediately after creation.

## SFR18: UC3 Step 7
### Description: 
- The system shall confirm successful child creation to the guardian.

### Fit Criterion: 
- The system shall display a success message within 1 second after the child profile is created and linked.

