# 하샤드 수

```
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고,  
18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.  

* 제한사항
- x는 1 이상, 10000 이하인 정수입니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int temp = x;
        
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        answer = x % sum == 0 ? true : false;
        
        return answer;
    }
}
```
<br>

1. 각 자릿수를 더할 sum 변수와 x의 값을 임시로 저장할 temp 변수를 선언한다.
2. 정확한 횟수가 정해진 것이 아니므로 while문으로 temp가 0보다 클 때까지 반복한다.
3. sum에 각 자릿수가 더해지도록 temp % 10을 해 나머지를 구해 더한다.
4. temp는 / 10을 한다.
5. 삼항연산자로 x / sum의 나머지가 0일 경우 answer에 true가, 아닐경우 false가 되도록 한다.
  
<br>

***
### 다른 사람 문제 풀이 참조  
  
<br>

```java
public boolean isHarshad(int num){

    String[] temp = String.valueOf(num).split("");

    int sum = 0;
    for (String s : temp) {
        sum += Integer.parseInt(s);
    }

    if (num % sum == 0) {
            return true;
    } else {
      return false;
    }
}

```
<br>

* num을 String으로 바꿔 split()해 String 배열로 만듬
* for each문으로 배열에 있는 걸 하나씩 거내 sum에 인티저로 파싱해서 저장
* num % sum이 0일 경우 true, 아니면 false 리턴

스트링 배열로 만든 점이 신기했다.


<br>
<br>
