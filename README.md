# class09-12
## kata task1
[Task Link](https://www.codewars.com/kata/57f609022f4d534f05000024)    
My solution

```java
import java.util.Arrays;

class Solution {
    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0] == numbers[1]) {
            return numbers[numbers.length - 1];
        }
        return numbers[0];
    }
}
```

My fav solution
```java
class Solution {
  static int stray(int[] numbers) {
    if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
    for (int i : numbers) if (i != numbers[0]) return i;
    return 0;
  }
}
```

## kata task2
[Task link](https://www.codewars.com/kata/6391fe3f322221003db3bad6)
My solution

```java
public class Perpendicular {
    public static int maxBisectors(int n) {
        if (n%2==0){
        return (n/2)*(n/2);
        }
        else {
              return (((n-1)/2)*((n-1)/2)+n/2);
        }
    }
}
```

My fav solution

```java
public class Perpendicular {
  public static int maxBisectors(int n) {
    return (int) Math.pow((double) n/2, 2);
  }
}
```
