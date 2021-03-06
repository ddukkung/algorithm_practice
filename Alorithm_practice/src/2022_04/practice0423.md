# 정수 제곱근 판별

```
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.  
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.  

* 제한사항
- n은 1이상, 50000000000000 이하인 양의 정수입니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public long solution(long n) {
        
        for (long i = 1; i <= n; i++) {
            if (n == i * i) {
                return ++i * i;
            }
        }
        
        return -1;
    }
}
```
<br>
잠깐 풀이를 찾아봤을 때 다들 sqrt를 사용하던데 나는 메소드를 사용하지 않고 직접 로직을 만들어서 풀고 싶었다.  

<br>

1. 1부터 n까지 반복
2. 만약 n이 i * i와 같을 경우 전위 증가 연산자를 사용하여 i를 1만큼 증가시킨 후 i * i하여 리턴.
3. n까지 반복이 끝났는데도 if문에 부합하지 않을 경우 for문을 끝내고 -1을 리턴한다.
  
<br>
