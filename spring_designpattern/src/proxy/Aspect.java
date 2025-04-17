package proxy;

public class Aspect implements Developer{

    private Developer developer;

    public Aspect(Developer developer) {
        this.developer = developer;
    }

    // 주관심사가 아닌 나머지 작업들 모듈화

    @Override
    public void develop() {
        System.out.println("출근 카드를 찍는다.");

        try{
            developer.develop();
        }catch (Exception e){
            System.out.println("쉬는 날이었다;");
        }finally {
            System.out.println("집에 간다.");
        }
    }
}
