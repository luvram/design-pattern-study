# 데코레이터 (Decorator) 패턴
## 개념
    객체에 추가 요소를 동적으로 더할 수 있다. 데코레이터를 사용하면 서브 클래스를 만드는 경우에 비해 훨씬 유연하게 기능을 확장할 수 있다.
## 설명
    - 데코레이터 패턴에서는 구상 구성요소를 감싸주는 데코레이터들을 사용한다.
    - 데코레이터 클래스의 형식은 그 클래스가 감싸고 있는 클래스의 형식을 반영한다.
    - 데코레이터에서는 자기가 감싸고 있는 구성요소의 메소드를 호출한 결과에 새로운 기능을 더함으로서 행동을 확장한다.
    - 구성요소를 감싸는 데코레이터의 개수에는 제한이 없다.
    - 구성요소의 클라이언트 입장에서는 데코레이터의 존재를 알 수 없다. 클라이언트에서 구성요소의 구체적인 형식에 의존하게 되는 경우는 예외.
## 단점
    - 자잘한 클래스들이 엄청나게 추가되는 경우가 있다. 그러다 보면 남들이 봤을때 이해하기 힘든 디자인이 만들어질 수 있다.
    - 구성 요소를 초기화하는데 필요한 코드가 훨씬 복잡해진다. (팩토리와 빌더 패턴으로 해결 가능)
## 추가
    - 예제에서는 이해를 돕기 위해 `abstract class`를 사용하여 데코레이터 패턴을 구현했지만 가능하다면 `interface`를 사용하는것이 좋다.   