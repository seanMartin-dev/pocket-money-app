# Non-Functional Requirements (NFRs)

## NFR-1: Platform & Client Support

- The system must support a mobile client as the primary interface.
- A backend server must expose a secure REST API.
- All communication between client and server must use HTTPS.
---

## NFR-2: Authentication & Security

- The system must provide secure loging for guardians and children.
- Role-based access control must be enforced.
- All sensitive data must be encrypted in trainsit.
- Passwords must be stored using secure hashing algorithms.
- The system must protect against common vulnerabilities (OWASP TOP 10).
---

## NFR-3: Data Persistence

- The system must persist:
    - behaviour entries
    - weekly outcomes
    - streak data
    - comments
    - user accounts
    - reward settings
- A relation database myst be used to ensure consistency.
---

## NFR-4: Data Retention

- All historical behaviour data must be retained indefinitely.
- Weekly summaries be stored permanently.
- Children must not be able to delete or modify any data.
- Guardians must not be able to modify past weeks once finalised.
---

## NFR-5: Consistency

- Weekly calculation must be deterministric and repeatable.
- Behaviour entries must not be modifiable after the day ends.
- Weekly outcomes must be immutable once finalised.
- Streaks must remain consitent across weeks.
---

## NFR-6: Scheduled Processing

- The system must automatically:
    - initialise each new weak
    - initialise each new day
    - calculate weekly outcomes
    - send weekly notifications
- Scheduled jobs must run reliably without manual intervention.
---

## NFR-7: Performance

- API responses should complete within 200-500ms under normal load.
- The system must support multiple children per guardian.
- Historical data queries must remain performant as data grows.
---

## NFR-8: Scalability

- The system must support multiple guardians and multiple children per guardian.
- The architecture must allow horizontal scaling of the backend.
- The database schema must support long-term growth.
---
## NFR-9: Availability
- The system must be avaiable 24/7.
- Behaviour logging must be possible at any time.
- Weekly calculations must run even if the user is offline.
---

## NFR-10: Usability
- The mobile app must be simple and intuitive for both guardians and children.
- Behaviour logging must require minimal steps.
- Weekly outcomes must be clearly presented.
---

## NFR-11: Auditability
- The system must record:
    - date and time of each behaviour judgement
    - the user who made the judgement
- Historical data must be tamper-proof.
---

## NFR-12: Notifications
- The system must notify:
    - guardians of weekly transfer amounts
    - children of weekly reward outcomes
- Notifications may be delivered via push or in-app messaging.
---

## NFR-13: Offline Mode(Optional Future Increment)
- The moblie app may allow offline behaviour logging.
- Data must sync automatically when the device reconnects.

## NFR-14: The system is avaiable and online

