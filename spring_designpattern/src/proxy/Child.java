package proxy;

public class Child implements Developer{

    public void develop(){
        // 주관심사만 구현 -> 비즈니스 로직
        System.out.println("아가는 스크래치로 개발한다.");
    }
}
