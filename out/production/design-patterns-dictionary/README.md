# design-patterns-dictionary

| Type           | Purpose                 | Example                      |
|----------------|-------------------------|------------------------------|
| **Creational** | How objects are created | Factory, Singleton           |
| **Structural** | How objects relate      | Adapter, Decorator, Mediator |
| **Behavior**   | How objects interact    | Command, Observer, Strategy  |


## Mediator

Mediator defines the interface the **Colleague** objects use to communicate
Colleague defines the abstract class holding a single reference to the Mediator
ConcreteMediator encapsulates the interaction logic between Colleague objects
ConcreteColleague1 and ConcreteColleague2 communicate only through the Mediator

![Mediator pattern](assets/img.png)
https://www.baeldung.com/java-mediator-pattern
