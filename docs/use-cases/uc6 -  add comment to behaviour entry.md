## UC6 - *add comment to behaviour entry*

### Actor

- Guardian
---

### Goal

- To add an optional comment to a child's behaviour entry for the current day.
---

### Preconditions

- The guardian is authenticated and logged into the system.

- The child is registered under the guardian's account.

- A behaviour entry for the current day already exists (initialised by the system).

- The guardian has permission to modify today's behaviour entry.
---

### Postconditions

#### - Successful Postconditions

- The comment is stored and linked to the behaviour entry for the current day.

- The behaviour record now includes the guardian's comment.

- The system logs the update for audit purposes.

#### - Minimal Postconditions

- The system logs the attempt (success or failure).
- No partial or corrupted comment data is stored.
---

### Assumptions

- The guardian understands that comments are optional.

- The system supports text-based comments.

- The behaviiour entry for the day has not been finalised or locked.
---

### Main Success Scenario

1. The guardian selects the child whose behaviour entry they want to comment on.

2. The system displays today's behaviour entry.

3. The guardian selects the option to add a comment.

4. The guardian enters the comment text.

5. The system validates the comments.

6. The system saves the comment and attaches it to the behaviour entry.

7. The system confirms that the comment has been successfully added.
---

### Alternative FLows

#### A1 - Guardian edits an existing comment.

1. The guardian selects an existing comment.
2. The system displays the current comment text.
3. The guardian updates the comment.
4. The system saves the updated comment.
5. Return to Step 7 of the Main Success Scecnario.

#### A2 - Guardian cancels

1. The guardian cancels before saving.
2. The system discards any unsaved comment text.
3. The use case ends.
---

### Exception Flows

#### E1 - Comment cannot be saved

1. The system encounters an erro while saving the comment.
2. The system displays an error message.
3. The guardian may retry or exit.
4. The use case ends.

#### E2 - Behaviour entry is locked

1. The system detects that today's behaviour entry has already been finalised.
2. The system prevents adding or editing comments.
3. The system displays an appropriate message.
4. The use case ends.
