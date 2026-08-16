```mermaid
classDiagram
    class Guardian
    class Child
    class RewardSetting

    Guardian "1" --> "0..*" Child : manages
    Child "1" --> "1" RewardSetting : reward rules
