# 행렬의 덧셈

```
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.   
2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.  

* 제한사항
- 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
```
<br>

### 내 문제 풀이  

```java
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
```
<br>

1. answer에 arr1의 행과 열 길이만큼 크기를 할당한다.
2. for문을 돌려 arr1의 길이만큼 반복하며 answer[i][j]에 arr1[i][j]와 arr2[i][j]를 합한 값을 저장한다.
  
<br>

***
### 다른 사람 문제 풀이 참조  
  
<br>

```java
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}

```
<br>

* answer의 길이를 arr1로 바로 할당한 점이 신기했다. 


<br>
<br>
