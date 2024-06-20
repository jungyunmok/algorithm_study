package ch02_1;

// 1000 이하의 소수 나열(버전2)
public class Ex14_primeNumber2 {
    public static void main(String[] args) {
        int count = 0; // 나눗셈 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2; // 소수 2 넣고 index값 증가시킴

        // 소수를 찾는 것이기에 홀수만 조사
        for (int n = 3; n <= 1000; n+=2) {
            int i;
            for (i = 1; i < ptr; i++) {
                count++;
                // 이미 찾은 소수로 나눠보기
                if(n % prime[i] == 0) {
                    break; // 나누어 떨어지면 소수가 아니기에 반복문 탈출
                }
            }
            // 끝까지 나누어 떨어지지 않으면 소수 배열에 저장
            if(ptr == i) {
                prime[ptr++] = n;
            }
        }

        // 찾은 ptr개의 소수 출력
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수: " + count);
    }
}

/*
나눗셈을 수행한 횟수: 14622
 */