| Term           | Category | Definition |
|----------------|----------|------------|
| Guardian | Class | A registered adult who can create Children and judge their behaviour.|
| Child    | Class | An entity created by a Guardian whose behaviour is judged.|
| Email    | Class | A class responsible for constructing and sending email messages.|
| Database | Class | A persistent storage class that saves and retrieves system data such as Guardians and Children.|
| PasswordHasher | Class | A class that hashes passwords and verifies them during authentication.|
| Date | Class | A class that represents a calender date and is used to create date objects for recording events such as registration, behaviour entries, and reward periods.


| Association        | Between                | Multiplicity              | What They Know |
|--------------------|------------------------|---------------------------|-----------------|
| Guardian–Child | Guardian ↔ Child | 1 Guardian to many Child | Guardian knows its Children; Child knows its Guardian. |
| Guardian–Database  | Guardian ↔ Database | Many Guardians stored in 1 Database | Database knows all Guardians. |
| Guardian-Date | Guardian <-> Date | 1 Guardian has 1 registration Date | Guardian stores the date they registered.
| Child–Database | Child ↔ Database | Many Children stored in 1 Database | Database knows all Children. |
| Guardian–PasswordHasher | Guardian ↔ PasswordHasher | 1 Guardian uses 1 PasswordHasher | PasswordHasher knows how to hash Guardian passwords. |
| Guardian–Email | Guardian ↔ Email | 1 Guardian may trigger 1 Email | Email knows the Guardian’s address. |

