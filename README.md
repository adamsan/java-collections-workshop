# Collections workshop

![dolls](https://www.pngall.com/wp-content/uploads/4/Matryoshka-Doll-PNG-High-Quality-Image-180x180.png)

## Interfaces

- goal: abstraction -> to hide implementation details
- contract for a `class` - what behaviour a class needs to implement
- only method signature, no body
- everything is `public abstract` by default
- can have variables, `public static final` by default
- implementing class can implement multiple interfaces

Example:

```java
interface MyInterface {
  int foo(String word);
}

class MyClass implements MyInterface {
  @Override
  public int foo(String word) {
    return 0;
  }
}
```

## Collections

Collections / containers - in the `java.util.*` package
Groups multiple objects into a single object.

Benefits:

- easier than arrays
- for some operations the fast algorithms are aready implemented

Most often used collection interfaces:

- `List` - has order, same element can occure multiple times.
- `Set` - isn't ordered, an element occurres only once - like a mathematical set.
- `Map` - mapping between key value pairs.

### List

`ArrayList` implementation
similar to an array, but it can grow.
You operate on it with method calls instead of squarre brackets.

`List numbers = new ArrayList();`

Add generics information:
`List<Integer> numbers = new ArrayList<>();`

`Collections` class contains many helper methods: `sort`, `shuffle`, `swap`, `min`, `max`, etc...

Example:

```java
List<Interger> nums1 = List.of(4, 5, 6);
List<Interger> nums2 = Arrays.asList(4, 5, 6);
List<Interger> nums3 = new ArrayList<>();
```

#### Iterator

- can be used to traverse collections - you can remove elements on a list while traversing through it.

```java
Iterator it = nums1.iterator();
while(it.hasNext()) {
  int number = it.next();
  System.out.println(number);
  if(shouldDelete(number)) {
    it.remove();
  }
}
```
#### Tasks

*(start every task with writing tests)*

1. Try to remove elements from a list, while iterating on it with a for loop (without an iterator). What happens?
2. Create a method, that takes a list of Strings, and a positive integer as parameter, and removes any words from the original list, that are longer than the given parameter.
3. Implement the same method, but leave the original list intact, instead return with a new list of short words.

### Set

- as mathematical set
- implementations: `HashSet`, `TreeSet`, `LinkedHashSet`

#### Hash function
- one way mathematical function, like a fingerprint

```java
Set<Integer> nums1 = Set.of(1,2,3);
Set<Integer> nums2 = new HashSet<>(Arrays.asList(4, 5, 6));
nums2.add(8);
nums2.remove(2);
if(nums2.contains(2)){
//...
}

```

#### Tasks

*(start every task with writing tests)*

1. Implement the following set operations:
   - union,
   - intersect
   - difference
   - symmetric difference

2. Implement a method, that counts how many **different** characters are in a string:
   - "apple" -> 4, because (a, p, l, e)
   - "onion ring" -> 6, because (o, n, i, ' ', r, g)


### Map

- key-value store.
- Basic operations:
  - put(key, value)
  - get(key)
  - contains(key)
- Implementations: `HashMap`, `TreeMap`
```java
Map<Integer, String> numbersWordMap = Map.of(3, "apple", 5, "orange", 7, peach);

```
#### Tasks

*(start every task with writing tests)*

1. Implement a method, which returns with a map of character frequencies in the parameter String. `Map<Char, Integer> getFrequency(String input)`
2. Implement a method, which returns with a map, where the keys are the input words lengths, the values are the first word, that has the length of it's key.
3. Implement a method, which returns with a map, where every key is a word length of it's input, and the corresponding values is a list of words with that length.

### Sorting collections

#### Comparable
- interface, gives a default sorting for each object.
- Integer
- String
- Custom object can be extended.

```java
Collections.sort(list);
```

#### Comparator

- an object that implements Comparator, determines the comparing order
- must implement the `int compare(T a, T b)` method. Must return negative, if `a < b`, `0`, if `a == b`, otherwise positive.

```java
import java.util.Comparator;

class MyComparator implements Comparator<String> {
  @Override
  public int compare(String o1, String o2) {
    return o1.length() - o2.length();
  }
}

Collections.sort(list, new MyComparator());
```

#### Tasks

1. Implement a method, that sorts numbers in descending order.
2. Create a `class Student`, with attributes `id, name, age`. Implement the following methods:
   - `List<Student> sortByAge(List<Student> students)`
   - `List<Student> sortById(List<Student> students)`
   - `List<Student> sortByNameAndId(List<Student> students)`
