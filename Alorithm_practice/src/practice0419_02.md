# x만큼 간격이 있는 n개의 숫자

```
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.  

* 제한사항
- x는 -10000000 이상, 10000000 이하인 정수입니다.  
- n은 1000 이하인 자연수입니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = x;
        
        for(int i = 0; i < n; i++) {
            answer[i] = temp;
            temp += x;
        }
        
        return answer;
    }
}
```
<br>

1. answer에 n 크기만큼 배열 크기를 할당한다.
2. x의 원본값을 임시로 저장할 temp 변수를 선언한다.
3. for문으로 n번만큼 answer[i]에 temp의 값을 저장하는 것을 반복한다.
4. 한 번 반복될 때마다 temp값에 x만큼 더한다.
  
<br>

***
### 다른 사람 문제 풀이 참조  
  
<br>

```java
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}

```
<br>

* answer의 0번 인덱스엔 어차피 x가 들어가야 하니 처음부터 x를 저장한 것 같다.
* answer[i - 1] + x를 함으로써, 앞의 인덱스에 x를 더해 x의 값을 변화시키지 않고도 x만큼 늘어나도록 한 듯하다.

효율적인 코드인 것 같다.


<br>
<br>
