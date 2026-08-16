```mermaid
classDiagram
    class Guardian {
        guardianId : UUID
        name : String
        email : String
        passwordHash : String
        accountStatus : String
        createdAt : DateTime
    }

    class Child {
        childId : UUID
        username : String
        createdAt : DateTime
    }

    class RewardSetting {
        rewardSettingId : UUID
        weeklyAmount : Number
        createdAt : DateTime
        updatedAt : DateTime
    }

    Guardian "1" --> "0..*" Child : manages
    Child "1" --> "1" RewardSetting : reward rules
