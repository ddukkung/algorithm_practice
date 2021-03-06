# 최대공약수와 최소공배수

```
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.  
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.  
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.  

* 제한사항
- 두 수는 1이상 1000000이하의 자연수입니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        return new int[] {a, n * m / a};
    }
}
```
<br>

이번 문제는 도저히 로직이 떠오르지 않아서 다른 사람의 풀이를 사용했다.  

1. 두 수 중 큰 수를 a에, 작은 수를 b에 초기화
2. b가 0이 아닐 때까지 반복
3. r은 a / b를 한 나머지를 저장하고, a는 b를, b는 r의 값을 저장한다.
4. 이를 나머지가 0이 아닐 때까지 반복하면 그것이 최대공약수가 된다.
5. int형 배열 인덱스 0번에 최대공약수를, 인덱스 1번에는 n * m / a(최대공약수)를 해 구한 최소공배수를 저장해 리턴한다.

<br>

이를 유클리드 호제법이라고 한다.
```
임의의 두 자연수 a, b(a > b)가 주어지고
a를 b로 나눈 나머지를 r(r = a % b)로 이라고 하자.

a = b가되고 b = r이 되는데, 이때 b가 0이 될 때의 a가 최대공약수이다.
```
  
<br>

***
### 다른 사람의 풀이 참고
```
public int[] gcdlcm(int a, int b) {
    int[] answer = new int[2];

    answer[0] = gcd(a,b);
    answer[1] = (a*b)/answer[0];
    return answer;
}

public static int gcd(int p, int q)
{
  if (q == 0) return p;
  return gcd(q, p%q);
}
```

1. 최대공약수, 최소공배수 두 개만 배열에 저장하므로 배열 크기를 2만큼 할당한다.
2. 최대공약수 자리인 0번 인덱스에 gcd() 메소드를 a, b를 인자로하여 호출한다.
3. q가 0일 경우 p를 리턴하고, 아닐 경우 다시 gcd()를 q, p % q를 인자로 해 호출한다. (재귀함수)
4. 그렇게 q(=b)가 0이 될 때까지 반복하면 최대공약수를 구할 수 있다.
5. 최소공배수는 (a * b) / 최대공약수를 하면 구할 수 있다.

반복문 대신 재귀함수를 쓴 점이 신선했다.
