package ch02_1;

// 1000이하의 소수 나열(버전3)
public class Ex15_primeNumber3 {
    public static void main(String[] args) {
        int count = 0; // 곱셈과 나눗셈의 횟수
        int ptr = 0; // 찾은 소수 개수
        int[] prime = new int[500]; // 소수 배열

        prime[ptr++] = 2; // 소수 2
        prime[ptr++] = 3; // 소수 3

        // 홀수만 조사
        for (int n = 5; n <= 1000; n+=2) {
            boolean flag = false;

            // prime[i]의 제곱이 n 이하인지 판단
            for (int i = 1; prime[i]*prime[i] <=n ; i++) {
                count += 2;
                // 나누어 떨어지면 소수가 아니기에 반복문 탈출
                if(n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }

            // 마지막까지 나눠지지 않았을 경우 소수 배열에 저장
            if(!flag) {
                prime[ptr++] = n;
                // prime[i]*prime[i] <=n 조건이 성립하지 않는 경우 여기서곱셉 연산 횟수 증가시켜줌
                count++;
            }
        }

        // 찾은 ptr개의 소수 출력
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수: " + count);
    }
}

/*
곱셈과 나눗셈을 수행한 횟수: 3774
 */