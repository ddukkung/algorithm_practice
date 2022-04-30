# 정수 내림차순으로 배치하기

```
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.  
예를들어 n이 118372면 873211을 리턴하면 됩니다.  

* 제한사항
- n은 1이상 8000000000 이하인 자연수입니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (char)temp;
                }
            }
        }
        
        return Long.parseLong(String.valueOf(arr));
    }
}
```
<br>
char[] 배열로 만들어 for문을 돌려 비교해야 된다는 것까지는 생각을 했으나 각 인덱스의 값을 비교하는 방법이 떠오르지 않아 다른 사람의 풀이를 참고했다.  

<br>

1. n을 String.valueOf()로 String으로 바꾼 뒤 toCharArray()로 char[] 배열로 만들어 arr 변수에 저장
2. for문을 돌려 바깥쪽 for문은 0부터 arr의 길이만큼, 안쪽 for문은 i + 1부터 arr의 길이만큼 반복한다.
3. 만약 arr[i]가 arr[j]보다 작을 경우 temp에 arr[i]를, arr[i]에 arr[j]를, arr[j]에 temp를 저장하여 정렬을 한다.
4. 그렇게 for문을 끝까지 돌리면 내림차순으로 배열에 정렬이 된다. 이 배열을 Long.parseLong을 통해 Long 타입으로 변환해 리턴.

  
<br>
