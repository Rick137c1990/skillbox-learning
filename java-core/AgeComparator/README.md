
# Sorting Three Ages  

## Goal  

Learn how to write conditional statements combining multiple boolean expressions.  

## Task  

Create a program that outputs the ages of three people in ascending order — from the youngest to the  oldest.  

## Implementation  

1. Declare three variables representing the ages of three people:  

```java  
int vasyaAge = 10;
int katyaAge = 65;
int mishaAge = 34;
```

Declare three variables to hold the minimum, middle, and maximum ages:  

```java
int min = -1;    // minimum age
int middle = -1; // middle age
int max = -1;    // maximum age
```

Determine the minimum age:  

```java
if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
    min = vasyaAge;
} else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
    min = katyaAge;
} else {
    min = mishaAge;
}
```

Determine the maximum age:  

```java
if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
    max = vasyaAge;
} else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
    max = katyaAge;
} else {
    max = mishaAge;
}
```

Determine the middle age (the one that is neither minimum nor maximum):  

```java
if ((vasyaAge != min) && (vasyaAge != max)) {
    middle = vasyaAge;
} else if ((katyaAge != min) && (katyaAge != max)) {
    middle = katyaAge;
} else {
    middle = mishaAge;
}
```

Output the results:  

```java
System.out.println("min " + min + " age");
System.out.println("middle " + middle + " age");
System.out.println("max " + max + " age");
```

Notes:  
- This solution works well for distinct ages.  
- If some ages are equal, the logic may need adjustment.  
- Using arrays and sorting is a more scalable approach but here the focus is on practicing boolean  conditions.  
---
The repository exists purely as a learning and demonstration artifact.  

