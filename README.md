## **Приложение Miles (modern):**

**[Main](https://github.com/maxim-valov/Miles_modern/blob/master/src/Main.java):**

```java
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 14_988;
        int miles = service.calculate(price);
        System.out.println("Bonus Miles: " + miles);
    }
}
```

**[BonusMilesService](https://github.com/maxim-valov/Miles_modern/blob/master/src/BonusMilesService.java):**

```java
public class BonusMilesService {
        public int calculate(int price) {
            int bid = 20;
            int miles;
            miles = price / bid;
            return miles;
        }
    }
```