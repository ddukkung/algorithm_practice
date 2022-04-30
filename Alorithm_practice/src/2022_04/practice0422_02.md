# 제일 작은 수 제거하기

```
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.  
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.  
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.  

* 제한사항
- arr은 길이 1 이상인 배열입니다.
- 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        
        if (arr.length <= 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];

            for (int num : arr) {
                min = Math.min(min, num);
            }

            int index = 0;

            for (int num : arr) {
                if (num  == min) {
                    continue;
                }
                answer[index++] = num;
            }
        }
   
        return answer;
    }
}
```
<br>

배열에 원소가 하나만 있을 경우 -1을 리턴하고, 작은 수를 구하는 것까지는 풀었지만 그 원소를 삭제하는 방법을 
생각해내지 못하겠어서 다른 사람의 풀이를 참고했다. 단순히 answer에 그 수만을 제외한 원소들을 저장하면 되는 거였다...

1. 기준이 될 수로 arr 배열의 0번 인덱스를 min 변수에 초기화
2. 만약 arr 배열에 원소가 하나뿐일 경우 0번 인덱스에 -1을 저장
3. 아닐 경우 answer 배열에 arr의 길이 -1만큼 크기를 할당한다. (어차피 가장 작은 수는 제거될 것이기 때문)
4. for each문을 통해 arr의 원소들과 기준값인 min을 Math 클래스의 min() 메소드를 사용하여 비교해 더 작은 수를 min에 저장
5. answer의 인덱스가 될 index 변수 선언
6. for each문을 통해 arr의 모든 원소를 꺼내 min과 같은지 비교
7. 같을 경우 continue를 통해 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.
8. num과 min이 같지 않을 경우, 즉 num이 min보다 클 경우 answer[index++]에 num을 반복 저장한다.
9. answer 리턴
  
<br>
