## FR-1: Weekly Initialisation

The system must automatically initialise each new week for every child by assigning the maximum provisional pocket money defined for that child.

## FR-2: Daily Behaviour Initialisation

The system must automatically initialise each new day's behaviour to "good" at the start of the day.

## FR-3: Behaviour Update

The system must allow a guardian to change a child's behaviour for the current day only from "good" to "not good".

## FR-4: Weekly Behaviour Tracking

The system must record and maintain behaviour entries for each day of the week for every child.

## FR-5: Streak Tracking

The system must be able to track consecutive "good" and "not good" days for each child and update streak counts whenever behaviour changes.

## FR-6: Behaviour History Retrieval (Guardian)

The system must allow a guardian to view a child's behaviour history for:

- a specific week

- a custom date range

- all historical weeks

## FR-7: Weekly Reward Calculation

At the end of each week the system must:

- aggregate behaviour entries

- apply deductions based on the number of "not good" days in the week being calculated

- calculate the final pocket money amount

- store the weekly outcome

## FR-8 Reward Setting

The system must allow a guardian to set or update the maximum weekly reward amount for each child.

## FR-9 Reward Viewing (Child)

The system must allow a child to view:

- the provisional pocket money for the current week based on behaviour so far

- their final pocket money for the previous week

## FR-10: Behaviour History Retrieval (Child)

The system must allow a child to view their own:

- behaviour history

- weekly pocket money outcomes

The child must not be able to modify this information

## FR-11: Access Control

The system must enforce role-based access:

- guardians can modify behaviour and reward settings

- children can only view their own data

- children cannot view other children's data

- guardians cannot modify past weeks once they are finalised

## FR-12 Weekly Outcome Storage

The system must store weekly summaries including:

- final reward amount

- behaviour breakdown

- streak information

## FR-13 Notification of Weekly Outcome

At the end of each week, the system must notify:

- the guardian of the transfer amount

- the child of the reward outcome

## FR-14 Record The Date and Time

The system shall automatically record the date and time of each behaviour judgement.

## FR-15 Add A Comment

The system shall allow the guardian to optionally add a comment to a behaviour judgement.
