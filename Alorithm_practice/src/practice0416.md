# 프로그래머스 - 가운데 글자 가져오기

> 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.  
> 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
  
<br>

**제한사항**
* s는 길이가 1 이상, 100이하인 스트링입니다.

<br>

### 내 문제 풀이  

```java
class Solution {
    public String solution(String s) {
        int midIdx = s.length() / 2;
        
        if (s.length() % 2 == 0) {
            return s.substring(midIdx - 1, midIdx + 1);
        } else {
            return s.charAt(midIdx);
        }
        
    }
}
```
<br>

1. 단어의 가운데 인덱스를 구하기 위해 midIdx라는 변수에 단어 s의 길이를 구해 반으로 나눴다.  
2. 그런 다음 짝수인지 홀수인지 판별이 필요할 것 같아 if문을 통해 홀짝 판별을 했다.  
3. 짝수일 경우엔 두 글자를 추출해야 하므로 substring을 사용했다.  
4. length()를 통해 구해진 길이는 만약 6글자일 경우 6이 나오지만 substring에서 인덱스는 0부터 시작하기 때문에 'midIdx - 1' 부터 'midIdx + 1'의 글자를 추출하도록 했다.  
  4-1. 예를 들어 6글자일 경우 나누기 2를 하면 3이고, 위와 같이 substring을 하면 0, 1, 2, 3, 4, 5 중 2 ~ 3이 된다. substring의 두 번째 인자는 -1이 되기 때문이다.
5. 홀수는 한 글자만 추출하면 되기 때문에 charAt()을 사용했다. 5글자일 경우 midIdx는 2이 되고, 인덱스 0, 1, 2, 3, 4 중 가운데 2가 되므로 따로 빼줄 필요가 없다.  
  
  
***
  
여기까지가 나의 문제 풀이이다. 문제는 이 뒤의 리뷰 때에 있다. 친구와 함께 이 문제에 대해 리뷰를 하고, 다른 사람이 푼 문제 풀이를 봤다.  
  
<br>

```java
String getMiddle(String word){
    return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
}
```
처음엔 어떻게 짝수 홀수 판별을 하지 않고도 가능한지 이해가 안 됐다. 문제는 내가 substring의 두 번째 인자에 -1이 된다는 것을 그새 까먹어버린 탓이었다.  
  
<br>
  
짝수의 경우 - 주어진 문자는 middle
```
word.length() -> 6. 거기에 -1 / 2를 하면 2가 나온다. 
word.length() / 2 + 1 은 4. substring의 두 번째 인자는 -1 되므로 최종적으론 3이다.
middle의 인덱스는 0, 1, 2, 3, 4, 5 이므로 결국 substring의 인덱스는 2 ~ 3, 즉 dd가 추출된다.
```
<br>
  
홀수의 경우 - 주어진 문자는 ought
```
word.length() -> 5. -1 / 2 하면 2가 나온다.  
word.length() / 2 + 1은 3. 그러나 substring의 두 번째 인자는 -1 되므로 최종적으론 2가 된다.
ought의 인덱스는 0, 1, 2, 3, 4 이므로 결국 substring의 인덱스는 2, 2가 되므로 2 한자리만 추출된다. 즉 g이다. 
```
  
처음엔 substring의 두 번째 인자가 -1 되는 것을 까먹어서 전혀 이해가 안 됐지만 알고나니 이해가 됐고 신박한 코드라는 생각이 들었다. 
아직은 이런 문제에 우선 if문으로만 풀어보게 되는데, 나도 계속 코딩테스트를 연습하다보면 이런 코드를 짤 수 있게 될 거라 믿는다.

<br>
<br>
