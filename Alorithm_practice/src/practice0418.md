# 프로그래머스 - 문자열을 정수로 바꾸기

```
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

* 제한사항
- s의 길이는 1 이상 5이하입니다.
- s의 맨앞에는 부호(+, -)가 올 수 있습니다.
- s는 부호와 숫자로만 이루어져있습니다.
- s는 "0"으로 시작하지 않습니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public int solution(String s) {
        
        if (s.charAt(0) == '-') {
            return Integer.parseInt(s.substring(1, s.length())) * -1;
        } else {
            return Integer.parseInt(s);
        } 
    }
}
```
<br>

1. 먼저 +, -를 구분해야 할 것 같아서 charAt()으로 0번 인덱스를 가져와 부호를 판별했다.
2. -일 경우 부호를 제외한 인덱스 1 ~ 문자열의 길이 - 1 만큼을 substring()으로 가져와 Integer.parseInt()로 정수로 변환한 뒤 -1을 곱해 음수로 만들어 리턴한다.
3. 짝수일 경우에는 앞에 부호가 붙지 않으므로 아무런 조작 없이 Integer.parseInt()를 통해 그대로 정수로 변환해 리턴한다.  
  
<br>

***
### 다른 사람 문제 풀이 참조  
  
<br>

```java
class Solution {
    public int solution(String s) {
          return Integer.parseInt(s);
    }
}
```
<br>

처음 이 풀이를 보고 부호는 상관 없는 건가? 생각했다. 찾아보니 역시나 부호까지 다 변환해준다고 한다. 뻘짓했군... 

<br>
<br>
