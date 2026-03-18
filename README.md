# Design Patterns in Java 🏗️

A curated collection of **commonly used design patterns** implemented in Java, with explanations, examples, and practical use cases.

---

## 📌 Summary

This repository demonstrates key object-oriented design patterns, highlighting **best practices in software architecture**. Each pattern is implemented in Java with example code to illustrate its purpose and usage.

---

## 🧠 Key Topics

* Creational Patterns

  * Singleton
  * Factory
  * Builder
  * Prototype
* Structural Patterns

  * Adapter
  * Decorator
  * Facade
  * Composite
* Behavioral Patterns

  * Observer
  * Strategy
  * Command
  * Iterator

---

## 📂 Repository Structure

```text id="dpstr1"
creational/    # Singleton, Factory, Builder, Prototype
structural/    # Adapter, Decorator, Facade, Composite
behavioral/    # Observer, Strategy, Command, Iterator
```

Each folder contains:

* Pattern implementation in Java
* Example usage
* Key advantages and real-world use cases

---

## 🎯 Purpose

* Understand and practice **object-oriented principles**
* Learn how to implement reusable, maintainable code
* Prepare for **system design interviews** and real-world architecture decisions

---

## 🧠 Approach

* Explain each pattern with a short description
* Provide clean, working Java code examples
* Highlight trade-offs and when to use the pattern

---

## 🚀 Example

### Singleton Pattern

```java id="dpex1"
public class Singleton {
    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

## 📈 Future Improvements

* Add UML diagrams for each pattern
* Include real-world mini-project examples using patterns
* Add comparisons between similar patterns (e.g., Strategy vs. State)

---

## 💡 Key Insight

Mastering design patterns improves code **readability, scalability, and maintainability**, and demonstrates professional-level software engineering skills.

---
