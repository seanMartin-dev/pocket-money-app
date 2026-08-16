### Glossary – Conceptual Classes (UC1–UC4)

| Term          | Category         | Definition |
|---------------|------------------|------------|
| Guardian      | Concept Actor    | A responsible adult who registers an account, logs in, and manages one or more Children. |
| Child         | Concept Actor    | A dependent registered under a Guardian, whose reward settings can be configured. |
| RewardSetting | Concept Domain   | The configuration that defines a Child’s weekly reward amount. |

### Glossary – Associations (UC1–UC4)

| Term                 | Category    | Definition |
|----------------------|-------------|------------|
| Guardian–Child       | Association | A Guardian manages one or more Children. |
| Child–RewardSetting  | Association | A Child has one RewardSetting that defines their weekly reward amount. |

### Glossary – Attributes (UC1–UC4)

| Concept       | Attribute Name     | Description |
|---------------|--------------------|-------------|
| Guardian      | guardianId         | Unique identifier for the guardian. |
| Guardian      | name               | Guardian’s full name. |
| Guardian      | email              | Guardian’s email used for registration and login. |
| Guardian      | passwordHash       | Securely stored password representation. |
| Guardian      | accountStatus      | Indicates if the account is pending confirmation, active, or locked. |
| Guardian      | createdAt          | Timestamp of when the guardian account was created. |
| Child         | childId            | Unique identifier for the child. |
| Child         | username           | Child’s username used for login. |
| Child         | createdAt          | Timestamp of when the child profile was created. |
| RewardSetting | rewardSettingId    | Unique identifier for the reward setting. |
| RewardSetting | weeklyAmount       | The weekly reward amount configured by the guardian. |
| RewardSetting | createdAt          | Timestamp of when the reward setting was created. |
| RewardSetting | updatedAt          | Timestamp of the most recent update to the reward setting. |

