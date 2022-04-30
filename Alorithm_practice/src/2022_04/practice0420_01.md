# 프로그래머스 - 핸드폰 번호 가리기

```
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린  
문자열을 리턴하는 함수, solution을 완성해주세요.  

* 제한사항
- phone_number는 길이 4 이상, 20이하인 문자열입니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        
        answer = phone_number.substring(0, length - 4).replaceAll("[0-9]", "*") 
            .concat(phone_number.substring(length - 4));
        
        return answer;
    }
}
}
```
<br>

1. 길이가 몇 번 쓰일 것 같아 변수로 따로 만들었다.
2. phone_number의 뒤에서 네 번째 앞까지의 번호를 substring()으로 추출해 replaceAll()을 통해 모두 * 로 변환한다.
3. substring()으로 phone_number의 뒤에서 네 번째까지의 번호를 추출해 concat()으로 앞서 변환한 문자와 연결한다.

<br>

replaceAll()은 몰랐어서 처음엔 replace()를 쓰면 되나? 싶었지만 replace()는 특정 문자만 바꾸는 것이기 때문에 
다른 것을 사용할 필요가 있다고 느꼈다. 그래서 String 범위 치환을 검색해보니 replaceAll()이 나왔다.
보아하니 둘은 비슷하지만 replaceAll()은 정규식을 사용할 수 있다는 차이점이 있는 것 같았다. 
그래서 replaceAll("[0-9]", "*") 로 하여 숫자가 모두 *이 될 수 있도록 했다.  

또한 처음에는 앞의 문자와 뒤의 네자리를 + 결합연산자로 합쳐주었는데, 테스트에 걸리는 시간이 보통 0.n초대였는데 이번엔 1.n초대가
된 것이 보여 concat()으로 바꿔주었다. concat()이 결합연산자보다 빠르기 때문이다.
  
<br>

***
### 다른 사람 문제 풀이 참조  
  
<br>

```java
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}
```
<br>

1. phone_number를 toCharArray()를 통해 배열로 변환하여 char[]타입 배열 ch에 저장한다.
2. for문을 돌려서 ch의 길이 - 4, 즉 뒤에서 네자리가 되기 전까지 반복하며 ch[i]에 *를 새로 저장한다.

이렇게도 풀 수 있다는 걸 알고 신기했다.


<br>
<br>
