# 프로그래머스 - 직사각형 별찍기

```
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

* 제한사항
- n과 m은 각각 1000 이하인 자연수입니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
```
<br>

1. 가로 길이가 더 많이 실행돼야 하므로 안쪽 for문에 가로 길이가 할당된 a만큼 반복하는 for문을 작성했다.
2. 바깥쪽 for문에 세로 길이가 할당된 b만큼 반복되도록 조건을 걸었다.
  
<br>

***
### 다른 사람 문제 풀이 참조  
  
<br>

```java
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }
}
```
<br>
StringBuilder와 IntStream을 사용해 하는 방식이었다. 스트림은 배우지 않아서 아직 이해가 안 되는데, 따로 공부해야겠다.


<br>
<br>
