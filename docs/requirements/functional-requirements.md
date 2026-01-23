## FR-1: Weekly Initialisation

The system must automatically initialise each new week for every child by assigning the maximum provisional pocket money.

## FR-2: Daily Initialisation

The system must automatically initialise each new day to good.

## FR-3: Change behaviour type

The system must allow a guardian to change behaviour type on current day

## FR-4: Tracking

The system must be able to track behaviour over a week.

## Fr-5: Streak tracking

The system must be able to track consecutive "good" and "not good" days for each child.

## FR-6: Behavioiur Histor Retrieval (Guardian)

The system must allow a guardian to view a child's behaviour history for:

- a specific week

- a custom date range

- all historical weeks

## FR-7: Weekly Reward Calculation

At the end of each week the system must:

- aggregate behaviour entries

- apply deductions

- calculate the final pocket money amount

- store the weekly outcome

## FR-8 Reward Setting

The system must allow a guardian to set or update the maximum weekly reward amount for each child.

## FR-9 Reward Viewing (Child)

The system must allow a child to view:

- projected pocket money on any day during a current week

- their final pocket money for the previous week

## FR-10: Behavioiur History Retrieval (Child)

The system must allow a child to view there own behaviour history, pocket money earned, but not modify it.

## FR-11: Access Control

The system must enforce role-based access:

- guadians can modify behaviour and reward settings

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
