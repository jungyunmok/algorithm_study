package ch02_1;

// 1000 이하의 소수 나열(버전1)
public class Ex13_primeNumber1 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for(i=2; i<n; i++) {
                counter++;
                // 나누어 떨어지면 소수가 아니기에 반복 탈출
                if(n%i == 0) break;
            }
            if(n == i) {
                System.out.println(n);
            }
        }

        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}

/*
나눗셈을 수행한 횟수: 78022
 */