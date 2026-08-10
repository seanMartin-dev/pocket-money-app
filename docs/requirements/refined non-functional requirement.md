# Non-Functional Requirements (NFRs)

## NFR-1: Platform & Client Support

### Requirment:
- The system shall be delivered as a mobile-friendly web application, accessible through modern mobile browsers.
- No native mobile apps are required in the current release.
- The backend shall expose a secure REST API consumed by the web client.
- All communication must use HTTPS..

### Fit Criteria

- The web app must function correctly on:
    - Chrome (Android)
    - Safari (iOS)
    - Firefox Mobile

- The UI must be responsive and usable on screens between 360px and 1080px wide.

- All endpoints must enforce HTTPS(TLS 1.2+).
- Attempting HTTP access must return 301 redirect or 403.
---

## NFR-2: Authentication & Security

### Requirment:
- Browser-based login for guardians and children.
- Role-based access enforced at API level.
- Sensitive data encrypted in transit.
- Passwords hashed securely.
- System protected against OWASP TOP 10.

### Fit Criteria:
- Passwords hashed
- JWT tokens expire in 60 minutes.
- API returns 403 when a child attempts guardian-only actions.
- OWASP ZAP scan shows no high-severity issues.
---

## NFR-3: Data Persistence

### Requirements:
- All behaviour, streak, weekly outcome, and user data must be stored in a relational database.

### Fit Criteria:
- MYSQLite used
- ACID transactions for behaviour logging + weekly calculations.
- 99.9 % write reliability under normal load.
---

## NFR-4: Data Retention

### Requirement:
- Historical behaviour data stored indefinitely.
- Weekly summaries permanent.
- Children cannot modify any data.
- Guardians cannot modify past weeks once finalised.

### Fit Criteria:
- Attempts to modify locked data return 403.
- Historical data accessible for lifetime of account.
---

## NFR-5: Consistency

### Requiremnt:
- Weekly calculations deterministric.
- Behaviour entries locked after the day ends.
- Weekly outcomes immutable after finalisation.

### Fit Criteria:
- Behaviour entries become read-only at 23:59.
- Weekly outcomes locked at Sunday 23.59.
- Streak logic validated with automated tests.
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

